package com.molbase.contactsapp.module.common.network;

import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * SwiftRetroFit...........
 * cn.syiyi.com.network...........
 * Created by lintao.song on 2016/1/26.
 */
public class SwiftRetrofitClient {
        private static final String BASE_URL = "http://gank.avosapps.com/api/data/";
//    private static final String BASE_URL = "http://www.baidu.com/";
    private static ApiService api;

    static {
        new SwiftRetrofitClient();
    }

    private SwiftRetrofitClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(ApiService.class);
    }


    public static ApiService api() {
        return api;
    }
}
