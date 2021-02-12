package com.example.nsgapp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

<<<<<<< HEAD
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
=======
import okhttp3.OkHttpClient;
>>>>>>> c607543eb7f084b10e9abc3da14e4429bf3a06c4
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
<<<<<<< HEAD
            
            loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            CookieManager cookieManager = new CookieManager();
            cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
            okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(loggingInterceptor)
                    .cookieJar(new JavaNetCookieJar(cookieManager))
=======
            loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(loggingInterceptor)
>>>>>>> c607543eb7f084b10e9abc3da14e4429bf3a06c4
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
