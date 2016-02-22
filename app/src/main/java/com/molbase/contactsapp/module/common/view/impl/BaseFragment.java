package com.molbase.contactsapp.module.common.view.impl;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;

import com.molbase.contactsapp.module.common.presenter.BasePresenter;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BaseFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * create an instance of this fragment.
 */
public abstract class BaseFragment extends Fragment {
    private BasePresenter mPresenter;
    protected boolean isInited;
    private OnFragmentInteractionListener mListener;

    public BaseFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("---BaseFragment", "onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("--BaseFragment", "onActivityCreated");
        if (getUserVisibleHint()) {
            onVisibleToUser(savedInstanceState);
            isInited = true;

        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("--BaseFragment", "onDestroyView");
    }

    /**
     * @param isVisibleToUser 先与onCreated()方法执行，fragment初始化的时候不能执行loadData，因为此时view不可见
     *                        当每次切换页面的时候都加载，默认缓存2个view,不缓存数据
     */
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        if (isVisibleToUser && isVisible()) {
            onVisibleToUser(null);
            isInited = true;

        }
        super.setUserVisibleHint(isVisibleToUser);
    }

    public void onVisibleToUser(@Nullable Bundle savedInstanceState) {
        if (!isInited) {
            initPresenter();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("--BaseFragment", "onResume");
        if (mPresenter != null) {
            mPresenter.onResume();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("--BaseFragment", "onStop");
        if (mPresenter != null) {
            mPresenter.onStop();
        }
    }

    public void initPresenter() {
        if (mPresenter != null) {
            mPresenter.onCreate();
        }
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("--BaseFragment", "onAttach");
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("--BaseFragment", "onDetach");
        if (mPresenter != null) {
            mPresenter.onDestory();
            mListener = null;
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
