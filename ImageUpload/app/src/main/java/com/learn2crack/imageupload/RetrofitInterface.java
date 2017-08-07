package com.learn2crack.imageupload;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface RetrofitInterface {
    @Multipart
    @POST("/images/upload")
    Call<Response> uploadImage(@Part MultipartBody.Part image);
}
