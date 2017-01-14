package com.lihonghui.multitypeadapter.model;

import com.lihonghui.multitypeadapter.Type.TypeFactory;


/**
 * Created by Harry.Kong on 2016/12/30.
 * 此接口抽象出来（和 factory建立管连）
 */

public interface Visitable {
    int type(TypeFactory typeFactory);
}
