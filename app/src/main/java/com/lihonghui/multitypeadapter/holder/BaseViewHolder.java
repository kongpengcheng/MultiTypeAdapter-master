package com.lihonghui.multitypeadapter.holder;


import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

import com.lihonghui.multitypeadapter.adapter.MultiTypeAdapter;


/**
 * Created by Harry.Kong on 2016/12/30.
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    //c存储的目的是不需要每次都去找id，此arry是 android 提供的，用减小空间
    private SparseArray<View> views;
    private View mItemView;

    public BaseViewHolder(View itemView) {
        super(itemView);
        views = new SparseArray<>();
        this.mItemView = itemView;
    }

    public View getView(int resID) {
        View view = views.get(resID);

        if (view == null) {
            view = mItemView.findViewById(resID);
            views.put(resID, view);
        }

        return view;
    }

    public abstract void setUpView(T model, int position, MultiTypeAdapter adapter);
}
