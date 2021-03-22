package com.example.nsgapp;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Streaming;

public interface InterfaceAPI {
    @GET("studies")
    Call<List<Study>> getStudies();

    @Streaming
    @GET("studies?studyID=num")
    Call<ResponseBody> downloadNifti();

    @POST("login")
    Call<LoginResponse> auth_login(@Header("Authorization") String authHeader, @Body LoginRequest loginRequest);

    @GET("logout")
    Call<Void> auth_logout();
}
