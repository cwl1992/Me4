package utils;


import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface ApiService {


    @GET("query")
    Call<Infos> getKuaidi(@Query("type") String type, @Query("postid") String postid);


    @GET("query")
    Call<Infos> getKuaidi2(@Query("type") String type, @Query("postid") String postid);




    /*
     * https://www.jianshu.com/p/29c2a9ac5abf
     *
     * */

    @GET("service/getInfo.php/")
    Observable<ResponseBody> getData(@Query("ip") String ip);


    @GET("{url}")
    Observable<ResponseBody> executeGet(@Path("url") String url, @QueryMap Map<String, String> map);


   /* @Multipart
    @POST("{url}")
    Observable<ResponseBody> uploadFile
            (@Path("url") String url,
             @Part("image\\";filename=\\"image.jpg") ResponseBody avatar);



    @POST("{url}")
    Call<ResponseBody> uploadFiles(
      @Url("url") String url,
      @Part("filename") String dese,
      @PartMap Map<String,ResponseBody> map
    );*/


   /* @POST("{url}")
    Call<ResponseBody> uploadFiles2(
            @Url("url") String url,
            @Part("filename") String description,
            @PartMap()  Map<String, RequestBody> maps);*/


}
