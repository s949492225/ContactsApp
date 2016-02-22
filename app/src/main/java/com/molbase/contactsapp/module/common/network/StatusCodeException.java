package com.molbase.contactsapp.module.common.network;

/**
 * SwiftRetroFit...........
 * cn.syiyi.com.network...........
 * Created by lintao.song on 2016/1/26.
 */
public class StatusCodeException extends Throwable {
    private int code;


    public StatusCodeException(int code) {
        this("SwiftRetrofitClient response code not be 200 and code=", code);
        this.code = code;
    }

    public StatusCodeException(String detailMessage, int code) {
        super(detailMessage + code + "!");
    }
}
