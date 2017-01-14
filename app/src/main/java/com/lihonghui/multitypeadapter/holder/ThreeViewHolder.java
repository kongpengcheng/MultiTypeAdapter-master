package com.lihonghui.multitypeadapter.holder;

import android.view.View;
import android.widget.TextView;

import com.lihonghui.multitypeadapter.R;
import com.lihonghui.multitypeadapter.adapter.MultiTypeAdapter;
import com.lihonghui.multitypeadapter.model.Three;



/**
 * Created by Harry.Kong on 2016/12/30.
 */

public class ThreeViewHolder extends BaseViewHolder<Three> {
    public ThreeViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(Three model, int position, MultiTypeAdapter adapter) {
        TextView textView = (TextView) getView(R.id.three_title);
        textView.setText(model.getText());
    }
}
