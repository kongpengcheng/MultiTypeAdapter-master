package com.lihonghui.multitypeadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lihonghui.multitypeadapter.adapter.MultiTypeAdapter;
import com.lihonghui.multitypeadapter.model.Normal;
import com.lihonghui.multitypeadapter.model.One;
import com.lihonghui.multitypeadapter.model.Three;
import com.lihonghui.multitypeadapter.model.Two;
import com.lihonghui.multitypeadapter.model.Visitable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harry.Kong on 2016/12/30.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
       // recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return position == 0 ? 2 : 1;
            }
        });
        recyclerView.setLayoutManager(layoutManager);
        List<Visitable> list = getData();
        list.add(0,new One("Type One 0"));
        list.add(1,new Two("Type Two 0"));
        list.add(2,new Three("Type Three 0"));
        list.add(new One("Type One 1"));

        recyclerView.setAdapter(new MultiTypeAdapter(list));
    }

    private List<Visitable> getData(){
        List<Visitable> models = new ArrayList<>();

        for (int index = 0; index < 50; index++ ){
            models.add(new Normal("Type normal "+ index));
        }

        return models;
    }

}
