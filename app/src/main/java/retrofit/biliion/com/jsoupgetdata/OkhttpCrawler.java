package retrofit.biliion.com.jsoupgetdata;

        import android.app.ProgressDialog;
        import android.os.AsyncTask;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.firebase.client.DataSnapshot;
        import com.firebase.client.Firebase;
        import com.firebase.client.FirebaseError;
        import com.firebase.client.ValueEventListener;
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
        import okhttp3.Interceptor;
        import okhttp3.MediaType;
        import okhttp3.OkHttpClient;
        import okhttp3.Request;
        import okhttp3.RequestBody;
        import okhttp3.Response;
        import retrofit.biliion.com.jsoupgetdata.data.Product;
        import retrofit.biliion.com.jsoupgetdata.data.ProductResponse;
        import retrofit.biliion.com.jsoupgetdata.deliverynow.DeliveryItems;
        import retrofit.biliion.com.jsoupgetdata.deliverynow.DeliveryResponse;

        import static android.widget.Toast.LENGTH_SHORT;

public class OkhttpCrawler extends AppCompatActivity {
    public String response ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        // run under main thread

        new GetProduct().execute();
        /*Firebase refCount = new Firebase("https://quizlet-card.firebaseio.com/poke1/");
        refCount.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snap: dataSnapshot.getChildren()) {
                    Log.e(snap.getKey(),snap.getChildrenCount() + "");
                    Toast.makeText(OkhttpCrawler.this,snap.getChildrenCount() + "",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }

        });*/
    }


    private class DiliveryNow extends AsyncTask<Void,Void,String>{
        private static final String url="https://www.deliverynow.vn/List/GetListDeliveryByFilter";
        private static final String content_typte ="application/json; charset=utf-8";
        private static final String request_Payload ="{\"filters\":{\"Keyword\":null,\"CategoryIds\":null,\"DistrictIds\":null,\"CuisineIds\":null,\"SortType\":11,\"PageIndex\":1,\"PageSize\":30,\"Lat\":10.76721,\"Long\":106.68773799999997}}";
        private String request_payload_head ="{\"filters\":{\"Keyword\":null,\"CategoryIds\":null,\"DistrictIds\":null,\"CuisineIds\":null,\"SortType\":11,\"PageIndex\":";
        private String request_payload_end=",\"PageSize\":20,\"Lat\":10.76721,\"Long\":106.68773799999997}}";
        // array int districtID

        private String payload_id_head ="{\"filters\":{\"Keyword\":null,\"CategoryIds\":null,\"DistrictIds\":[";
        private String payload_id_end="],\"CuisineIds\":null,\"SortType\":11,\"PageIndex\":0,\"PageSize\":1,\"Lat\":10.76721,\"Long\":106.68773799999997}}";
        private Gson gson = new GsonBuilder().create();
        String responseJson = "";
        public  Firebase ref = new Firebase("https://ionic-chatappwthfirebase.firebaseio.com/members/");
        int totalCount;
        public ProgressDialog mProgressDialog;
        private String requsetURL ;
        private int [] arrDistrictID ={1, 6, 9, 12, 15, 19, 693, 695, 4, 7, 10, 13, 16, 2, 696, 694, 5, 8, 11, 14, 17, 18, 699, 698,
                25,29,21,23,674,677,680,683,686,689,28,24,26,945,675,678,681,684,687,691,20,22,27,690,676,679,682,685,688,692,
                303,306,309,304,307,302,305,308,301,30,33,158,31,34,159,32,35,119,44,46,121,117,45,47,118,43,120,109,112,36,39,116,110,113,38,42,114,111,37,40,41,115};

        int countFor= 0;
        private ProgressDialog dialog;

        // create constructor
        public DiliveryNow(OkhttpCrawler activity) {
            dialog = new ProgressDialog(activity);
        }

        @Override
        protected void onPreExecute() {
            dialog.setMessage("Doing something, please wait.");
            dialog.show();
        }

        @Override
        protected String doInBackground(Void... ints) {
            Map<String,DeliveryItems> items = new HashMap<String,DeliveryItems>();
            try {
                for(int i=0 ; i<arrDistrictID.length;i++) {
                    countFor++;
                    String payload_id = payload_id_head + ""+arrDistrictID[i]+ "" + payload_id_end; //ok
                    /*requsetURL+= payload_id+"\n";*/
                    MediaType mediaType = MediaType.parse(content_typte); //ok
                    OkHttpClient client = new OkHttpClient();
                    RequestBody body = RequestBody.create(mediaType, payload_id); //ok
                    Request request = new Request.Builder().url(url).post(body).build();// call method post


                    Response response = client.newCall(request).execute();
                    responseJson = response.body().string();
                    JSONObject JsonOb = new JSONObject(responseJson);// create json object from String
                    JSONObject result = JsonOb.getJSONObject("result");
                    String JsonResult = result.toString();
                    DeliveryResponse deliveryResponse = gson.fromJson(JsonResult, DeliveryResponse.class);

                    //start here
                    totalCount = deliveryResponse.getTotalCount();
                    requsetURL+=totalCount+"---";
                    /*int nguyen = totalCount/20;
                    int du = totalCount%20;

                    if(nguyen>=1){

                    }*/
                   /* }
                    for (int k = 0; k < nguyen; k++) {
                        String payload_get_all_data = request_payload_head + k + "" + request_payload_end;
                        RequestBody requestBody = RequestBody.create(mediaType, payload_get_all_data);
                        Request request1 = new Request.Builder().url(url).post(requestBody).build();
                        Response response1 = client.newCall(request1).execute();
                        JSONObject jsonObject = new JSONObject(response1.body().string());
                        JSONObject result1 = jsonObject.getJSONObject("result");
                        DeliveryResponse deliveryResponse1 = gson.fromJson(result1.toString(), DeliveryResponse.class);
                        List<DeliveryItems> deliveryItemsList = deliveryResponse1.getListResult();
                        for (int j = 0; j < deliveryItemsList.size(); j++) {
                            items.put(deliveryItemsList.get(j).getRestaurantId() + "", deliveryItemsList.get(j));
                        }
                    }
*/
                    /*List<DeliveryItems> deliveryItemsList = deliveryResponse.getListResult();
                    for(int i =0; i<deliveryItemsList.size();i++){
                        items.put(deliveryItemsList.get(i).getRestaurantId()+"",deliveryItemsList.get(i));
                    }*/
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            ref.push().setValue(items);
            return requsetURL ;
        }


        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
            TextView textView = (TextView)findViewById(R.id.text);
            textView.setText(s);
        }
    }

    //--------------------------------------
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

                String jsonPayload = JsonPayLoadHead+1+""+JsonPayLoadEnd;

                MediaType JSON = MediaType.parse(headerRequest);

                OkHttpClient client = new OkHttpClient().newBuilder().addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        final Request original = chain.request();

                        final Request authorized = original.newBuilder()
                                .addHeader("Cookie", "ASP.NET_SessionId=nll45ij4wavvhakeiqhu0hmc; view=grid; _ga=GA1.2.36993942.1474246083; _gat=1; DeliveryNow.Web.AuthenFlag=NotAuthentication; version=1.0.0; floc=218")
                                .build();

                        return chain.proceed(authorized);

                    }
                }).build();

                RequestBody requestBody = RequestBody.create(JSON,"{}");
                Request request = new Request.Builder()
                        .addHeader("Origin","https:/www.deliverynow.vn")
                        .addHeader("Referer","https://www.deliverynow.vn/ha-noi/danh-sach-dia-diem-giao-tan-noi-trang-2").url(url).
                                post(requestBody).build();
                /*
                .header("User-Agent", "Atime Online " +
                        "1.0" + " (Android; "
                        + String.valueOf(android.os.Build.MANUFACTURER) + ";"
                        + String.valueOf(android.os.Build.MODEL) + "; ver "
                        + android.os.Build.VERSION.RELEASE + ")")
                * */
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

            /*ref.push().setValue(postData);*/
            return responseData;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            TextView textView = (TextView)findViewById(R.id.text);
            textView.setText(s);
        }
    }

    ////////////////////

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
