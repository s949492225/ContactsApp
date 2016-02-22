package com.molbase.contactsapp.module.main.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.molbase.contactsapp.R;
import com.molbase.contactsapp.config.Config;
import com.molbase.contactsapp.module.common.view.impl.BaseFragment;

import java.util.List;

/**
 * LightChat...........
 * cn.syiyi.com.lightchat.view.main.adapter...........
 * Created by lintao.song on 2016/1/20.
 */
public class MainAdapter extends FragmentPagerAdapter {
    private List<BaseFragment> mData;

    public MainAdapter(FragmentManager fm, List<BaseFragment> mData) {
        super(fm);
        this.mData = mData;
    }

    @Override
    public Fragment getItem(int position) {
        return mData.get(position);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Config.PAGE_NAME[position];
    }

    public int getPageDrawable(int postion) {
        return R.mipmap.ic_launcher;
    }
}
