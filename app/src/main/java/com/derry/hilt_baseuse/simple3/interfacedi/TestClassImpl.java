package com.derry.hilt_baseuse.simple3.interfacedi;

import android.util.Log;

import javax.inject.Inject;

// 接口的实现类
public class TestClassImpl implements TestInterface {

    @Inject
    TestClassImpl() {}

    @Override
    public void method() {
        Log.i("derry", "恭喜恭喜你，注入成功√");
    }
}
