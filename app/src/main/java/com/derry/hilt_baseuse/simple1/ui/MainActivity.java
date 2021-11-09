package com.derry.hilt_baseuse.simple1.ui;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.derry.hilt_baseuse.R;
import com.derry.hilt_baseuse.simple1.obj.HttpObject;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint // 我是被注解的 被注入的
public class MainActivity extends AppCompatActivity {

    @Inject
    HttpObject httpObject; // 他怎么赋值的 ？ 打通下，如果通过上节课，就已经明白，否则 我们在走一下流程

    @Inject
    HttpObject httpObject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // super.onCreate(savedInstanceState); 语法不通过
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 为什么能够控制  字节码插庄
        // DaggerCOm。create.inject(this);

        Log.i("derry", httpObject.hashCode() + "");
        Log.i("derry", httpObject2.hashCode() + "");
        Toast.makeText(this, httpObject.hashCode() + "", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, httpObject2.hashCode() + "", Toast.LENGTH_SHORT).show();
    }
}