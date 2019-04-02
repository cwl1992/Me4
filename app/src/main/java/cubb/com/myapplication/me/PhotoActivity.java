package cubb.com.myapplication.me;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import utils.ApiService;
import utils.BaseUrl;
import utils.Infos;

public class PhotoActivity extends AppCompatActivity {

    private static final String TAG = "PhotoActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_activity);

        initData();

        //initData2();

    }

    private void initData2() {


        /*Retrofit retrofit2 = new Retrofit.Builder()
                .baseUrl(BaseUrl.HouseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        ApiService apiService = retrofit2.create(ApiService.class);
        apiService.getKuaidi2("zhongtong", "75137494011806")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Infos>(){
                    @Override
                    public void onNext(Infos infos) {
                        String com = infos.getCom();
                        List<Infos.DataBean> data = infos.getData();
                        Log.i(TAG, "onNext: 输出2"+ com + infos.getNu());
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });*/

    }

    private void initData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BaseUrl.HouseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Call<Infos> zhongtong = apiService.getKuaidi("zhongtong", "75137494011806");
        zhongtong.enqueue(new Callback<Infos>() {
            @Override
            public void onResponse(Call<Infos> call, Response<Infos> response) {
                List<Infos.DataBean> data = response.body().getData();
                Infos body = response.body();
                String nu = body.getNu();
                Log.i(TAG, "onResponse: 输出" + nu);
                for (int i = 0; i < data.size(); i++) {
                    String context = data.get(i).getContext();
                    Log.i(TAG, "onResponse: 输出的结果" + context);
                }
            }
            @Override
            public void onFailure(Call<Infos> call, Throwable t) {
                Log.i(TAG, "onFailure: 输出的结果" + t.getMessage());
            }
        });


    }
}
