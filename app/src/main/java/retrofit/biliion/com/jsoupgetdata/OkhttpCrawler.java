package retrofit.biliion.com.jsoupgetdata;

        import android.os.AsyncTask;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.widget.TextView;

        import com.google.gson.Gson;
        import com.google.gson.GsonBuilder;

        import java.io.IOException;

        import okhttp3.Call;
        import okhttp3.Callback;
        import okhttp3.HttpUrl;
        import okhttp3.MediaType;
        import okhttp3.OkHttpClient;
        import okhttp3.Request;
        import okhttp3.RequestBody;
        import okhttp3.Response;
        import retrofit.biliion.com.jsoupgetdata.data.Product;

/**
 * Created by framgia on 16/09/15.
 */
public class OkhttpCrawler extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new GetProduct().execute();
    }

    private class GetProduct extends AsyncTask<Void,Void,String>{
        private static final String url = "https://www.tablenow.vn/List/GetListReservationByFilter";
        private static final String headerRequest = "application/json; charset=utf-8";
        private static final String JSONPayLoad = "{\"filter\":{\"Keyword\":null,\"CategoryIds\":[],\"CuisineIds\":[],\"DistrictIds\":[],\"PageIndex\":1,\"PageSize\":20,\"SortType\":14}}";
        Gson gson = new GsonBuilder().create();
        String responseData ="";
        String RestaurantName="";

        
        @Override
        protected String doInBackground(Void... voids) {
            MediaType JSON = MediaType.parse(headerRequest);

            OkHttpClient client = new OkHttpClient();

            RequestBody requestBody = RequestBody.create(JSON,JSONPayLoad);
            Request request = new Request.Builder().url(url).post(requestBody).build();
            try {
                Response response = client.newCall(request).execute();
                responseData=response.body().string();
                Product product = gson.fromJson(responseData,Product.class);
                RestaurantName = product.getRestaurantName();
            } catch (IOException e) {

            }
            return RestaurantName;
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
