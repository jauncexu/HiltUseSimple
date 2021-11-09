package com.derry.hilt_baseuse.simple2.ui;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.derry.hilt_baseuse.R;
import com.derry.hilt_baseuse.simple2.obj.HttpObject;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity2 extends AppCompatActivity {

    @Inject
    HttpObject httpObject;

    @Inject
    HttpObject httpObject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("derry", httpObject.hashCode() + " MainActivity2");
        Log.e("derry", httpObject2.hashCode() + " MainActivity2");
        Toast.makeText(this, httpObject.hashCode() + "", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, httpObject2.hashCode() + "", Toast.LENGTH_SHORT).show();
    }
}