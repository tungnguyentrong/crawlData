package retrofit.biliion.com.jsoupgetdata;

        import android.os.AsyncTask;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.widget.TextView;

        import com.firebase.client.Firebase;
        import com.google.firebase.storage.FirebaseStorage;
        import com.google.firebase.storage.StorageReference;
        import com.google.gson.Gson;
        import com.google.gson.GsonBuilder;

        import org.json.JSONArray;
        import org.json.JSONException;
        import org.json.JSONObject;

        import java.io.IOException;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

        import okhttp3.Call;
        import okhttp3.Callback;
        import okhttp3.HttpUrl;
        import okhttp3.MediaType;
        import okhttp3.OkHttpClient;
        import okhttp3.Request;
        import okhttp3.RequestBody;
        import okhttp3.Response;
        import retrofit.biliion.com.jsoupgetdata.data.Product;
        import retrofit.biliion.com.jsoupgetdata.data.ProductResponse;

public class OkhttpCrawler extends AppCompatActivity {
    public String response ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        new GetProduct().execute();
    }

    private class GetProduct extends AsyncTask<Void,Void,String>{
        private static final String url = "https://www.tablenow.vn/List/GetListReservationByFilter";
        private static final String headerRequest = "application/json; charset=utf-8";
        private static final String JSONPayLoad = "{\"filter\":{\"Keyword\":null,\"CategoryIds\":[],\"CuisineIds\":[],\"DistrictIds\":[],\"PageIndex\":1,\"PageSize\":20,\"SortType\":14}}";

        private static final String JsonPayLoadHead = "{\"filter\":{\"Keyword\":null,\"CategoryIds\":[],\"CuisineIds\":[],\"DistrictIds\":[],\"PageIndex\":";
        private static final String JsonPayLoadEnd =",\"PageSize\":20,\"SortType\":14}}";

        Gson gson = new GsonBuilder().create();
        String responseData ="";
        String nameRes="";
        public  Firebase ref = new Firebase("https://foodylove.firebaseio.com/restaurant/");

        @Override
        protected String doInBackground(Void... voids) {
            Map<String,Object> postData = new HashMap<String,Object>();
            for(int i = 1 ; i<30;i++){
                String jsonPayload = JsonPayLoadHead+i+""+JsonPayLoadEnd;
                MediaType JSON = MediaType.parse(headerRequest);

                OkHttpClient client = new OkHttpClient();

                RequestBody requestBody = RequestBody.create(JSON,jsonPayload);
                Request request = new Request.Builder().url(url).post(requestBody).build();
                try {
                    Response response = client.newCall(request).execute();
                    responseData=response.body().string();

                    try {
                        JSONObject reponseOb = new JSONObject(responseData);
                        JSONObject jsonResult = reponseOb.getJSONObject("result");

                        String result = jsonResult.toString();
                        ProductResponse product = gson.fromJson(result,ProductResponse.class);

                        nameRes = product.getTotalCounts()+"";

                        List<Product> productList =product.getItems();


                        for(int j = 0 ; j <productList.size() ; j++){
                            postData.put(productList.get(j).getRestaurantId()+"",productList.get(j));
                        }



                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e) {

                }
            }
            ref.push().setValue(postData);
            return nameRes;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            TextView textView = (TextView)findViewById(R.id.text);
            textView.setText(s);
        }
    }


    private class ReceivingData extends AsyncTask<Void,Void,String>{
        String responseData ;
        @Override
        protected String doInBackground(Void... voids) {
            String url = "https://www.tablenow.vn/Detail/AjaxGetMenu ";
            String headerRequset = "application/json;charset=UTF-8";
            String json ="{\"resId\":126868,\"pageIndex\":0,\"pageSize\":2}";
            MediaType JSON
                    = MediaType.parse("application/json; charset=utf-8");
            OkHttpClient client = new OkHttpClient(); // should be singleton
            RequestBody body = RequestBody.create(JSON, json);
            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();
            Response response = null;
            try {
                response = client.newCall(request).execute();
                responseData = response.body().string();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return responseData;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            TextView textView = (TextView)findViewById(R.id.text);
            textView.setText(s);
        }
    }

}
