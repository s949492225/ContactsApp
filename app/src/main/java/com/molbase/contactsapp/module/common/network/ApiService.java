package com.molbase.contactsapp.module.common.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * SwiftRetroFit...........
 * cn.syiyi.com.network...........
 * Created by lintao.song on 2016/1/26.
 */
public interface ApiService {

    @GET("Android/{pageSize}/{pageCount}")
    Call<ReceiveData> articles(@Path("pageSize") int pageSize, @Path("pageCount") int pageCount);
}
