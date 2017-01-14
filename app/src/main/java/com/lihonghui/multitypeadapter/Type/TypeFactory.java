package com.lihonghui.multitypeadapter.Type;

import android.view.View;

import com.lihonghui.multitypeadapter.holder.BaseViewHolder;
import com.lihonghui.multitypeadapter.model.Normal;
import com.lihonghui.multitypeadapter.model.One;
import com.lihonghui.multitypeadapter.model.Three;
import com.lihonghui.multitypeadapter.model.Two;

/**
 * Created by Harry.Kong on 2016/12/30.
 * 此接口抽象出来需要的类型和holder
 */

public interface TypeFactory {
    int type(One one);

    int type(Two two);

    int type(Three three);

    int type(Normal normal);

    BaseViewHolder createViewHolder(int type, View itemView);
}
