package com.example.stonewang.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by stoneWang on 2016/12/26.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient clinet = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        clinet.newCall(request).enqueue(callback);
    }
}
