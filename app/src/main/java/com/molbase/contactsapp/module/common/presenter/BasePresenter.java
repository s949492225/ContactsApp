package com.molbase.contactsapp.module.common.presenter;

import com.molbase.contactsapp.module.common.business.BaseBusiness;

/**
 * ContactsApp...........
 * com.molbase.contactsapp.module.common...........
 * -------------------------------
 * Created by lintao.song on 2016/2/22.
 */
public abstract class BasePresenter {
    private BaseBusiness mBusiness;

    public void initBuiness() {

    }

    public  void onCreate(){}


    public  void onResume(){}

    public  void onStop(){}

    public void onDestory() {
        if (mBusiness != null) {
            mBusiness.onDestory();
        }
    }
}
