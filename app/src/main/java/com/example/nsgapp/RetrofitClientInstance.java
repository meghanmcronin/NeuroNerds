package com.example.nsgapp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    private static String API_BASE_URL = "http://10.0.2.2:8080/";
    private static Retrofit retrofit;
    private static Gson gson;
    private static OkHttpClient okHttpClient;
    private static HttpLoggingInterceptor loggingInterceptor;

    public static Retrofit getRetrofitInstance(){
        if(retrofit == null){
            gson = new GsonBuilder()
                    .setLenient()
                    .create();
            loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(loggingInterceptor)
                    .build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(okHttpClient)
                    .build();
        }
        return retrofit;
    }
}
