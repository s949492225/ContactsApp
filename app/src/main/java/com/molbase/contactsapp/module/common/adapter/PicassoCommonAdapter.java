package com.molbase.contactsapp.module.common.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * 使用picasso加载图片的通用adapter
 * Created by lintao.song on 2015/11/9.
 */
public abstract class PicassoCommonAdapter<T> extends CommonAdapter<T> {
    private Picasso mPicasso;

    /**
     * @param data     列表数据
     * @param mContext context
     * @param layoutID cell的布局id
     */
    public PicassoCommonAdapter(List<T> data, Context mContext, int layoutID) {
        super(data, mContext, layoutID);
        mPicasso = Picasso.with(mContext);

    }

    /**
     * 显示图片
     *
     * @param url              图片的地址
     * @param imageViewId      设置的图片的view 的id
     * @param placeHolderImgId 占位图的id
     */
    public void setWebImageWithPlaceHolder(String url, int imageViewId, int placeHolderImgId) {
        if (url != null && !url.trim().equals("")) {
            ImageView view = mViewHolder.getView(imageViewId);
            mPicasso.load(url).placeholder(placeHolderImgId).into(view);
        }
    }

    /**
     * 显示图片 ，此处有默认的占位图 defaultPlaceHolderImg修改
     *
     * @param url         图片的地址
     * @param imageViewId 设置的图片的view 的id
     */
    public void setWebImageWithPlaceHolder(String url, int imageViewId) {
        if (url != null && !url.trim().equals("")) {
            setWebImageWithPlaceHolder(url, imageViewId, PlaceHolderImageConfig.defaultPlaceHolderImg);
        }
    }

}
