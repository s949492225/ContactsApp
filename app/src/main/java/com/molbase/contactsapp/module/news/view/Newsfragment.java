package com.molbase.contactsapp.module.news.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.molbase.contactsapp.R;
import com.molbase.contactsapp.module.common.view.impl.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Newsfragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Newsfragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Newsfragment extends BaseFragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private View mContent;
    // TODO: Rename and change types of parameters
    private String mParam1;

    private OnFragmentInteractionListener mListener;

    public Newsfragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment BaseMainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Newsfragment newInstance(String param1) {
        Newsfragment fragment = new Newsfragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (mContent == null) {
            mContent = inflater.inflate(R.layout.fragment_base_main, container, false);
        }
        return mContent;
    }

    @Override
    public void onVisibleToUser(@Nullable Bundle savedInstanceState) {
        super.onVisibleToUser(savedInstanceState);
        View content = getView();
        if (content != null && !isInited) {
            TextView tv = (TextView) content.findViewById(R.id.tv);
            tv.setText(mParam1);
            Log.i("xxxxxxxx", "ffffffffffffffffffffffffffffff,,,,," + mParam1);
        }
    }

    @Override
    public void initPresenter() {

    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
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
        mListener = null;
    }

}
