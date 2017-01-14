package com.lihonghui.multitypeadapter.holder;

import android.view.View;
import android.widget.TextView;

import com.lihonghui.multitypeadapter.R;
import com.lihonghui.multitypeadapter.adapter.MultiTypeAdapter;
import com.lihonghui.multitypeadapter.model.One;



/**
 * Created by Harry.Kong on 2016/12/30.
 */
public class OneViewHolder extends BaseViewHolder<One> {
    public OneViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(One model, int position, MultiTypeAdapter adapter) {
        TextView textView = (TextView) getView(R.id.one_title);
        textView.setText(model.getText());
    }
}
