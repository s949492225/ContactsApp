package com.molbase.contactsapp.module.common.view.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.molbase.contactsapp.module.common.presenter.BasePresenter;

/**
 * ContactsApp...........
 * com.molbase.contactsapp.module.common...........
 * -------------------------------
 * Created by lintao.song on 2016/2/22.
 */
public abstract class BaseActivity extends AppCompatActivity {
    private BasePresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (mPresenter != null) {
            mPresenter.onCreate();
        }
    }

    public void initPresenter() {

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mPresenter != null) {
            mPresenter.onResume();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mPresenter != null) {
            mPresenter.onStop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.onDestory();
        }
    }
}
