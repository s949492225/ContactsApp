package com.molbase.contactsapp.module.common.network;


import retrofit2.Callback;
import retrofit2.Response;

/**
 * SwiftRetroFit...........
 * cn.syiyi.com.network...........
 * Created by lintao.song on 2016/1/26.
 */
public class SwiftJsonCallback<T> implements Callback<T> {
    public SwiftJsonCallback() {
        onStart();
    }

    public void onStart() {

    }

    public void onSuccess(T t) {
        System.out.println(t.toString());
    }

    @Override
    public void onResponse(Response<T> response) {
        if (response.isSuccess()) {
            onSuccess(response.body());
        } else {
            onFailure(new StatusCodeException(response.code()));
        }
    }

    @Override
    public void onFailure(Throwable t) {
        System.out.println(t.toString());
    }


}
