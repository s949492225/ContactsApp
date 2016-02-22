package com.molbase.contactsapp.module.main.view;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.molbase.contactsapp.R;
import com.molbase.contactsapp.module.common.view.impl.BaseActivity;
import com.molbase.contactsapp.module.common.view.impl.BaseFragment;
import com.molbase.contactsapp.module.contacts.view.Contactsfragment;
import com.molbase.contactsapp.module.main.adapter.MainAdapter;
import com.molbase.contactsapp.module.mine.view.Minefragment;
import com.molbase.contactsapp.module.news.view.Newsfragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.syiyi.com.swifttablayout.SwiftTabLayout;


public class MainActivity extends BaseActivity implements BaseFragment.OnFragmentInteractionListener {


    @Bind(R.id.contentLayout)
    ViewPager mContentLayout;
    @Bind(R.id.tabLayout)
    SwiftTabLayout mTabLayout;

    private MainAdapter mMainAdapter;
    private List<BaseFragment> mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mView = new ArrayList<>();
        init();
    }

    private void init() {
        mView.add(Newsfragment.newInstance("这是动态界面"));
        mView.add(Contactsfragment.newInstance("这是人脉界面"));
        mView.add(Minefragment.newInstance("这是我的界面"));
        mMainAdapter = new MainAdapter(getSupportFragmentManager(), mView);
        mContentLayout.setAdapter(mMainAdapter);
        mTabLayout.setupWithViewPager(mContentLayout);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
