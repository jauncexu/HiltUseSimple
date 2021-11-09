package com.derry.hilt_baseuse.simple2.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.derry.hilt_baseuse.R;
import com.derry.hilt_baseuse.simple2.obj.HttpObject;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    HttpObject httpObject;

    @Inject
    HttpObject httpObject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("derry", httpObject.hashCode() + "");
        Log.e("derry", httpObject2.hashCode() + "");
        Toast.makeText(this, httpObject.hashCode() + "", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, httpObject2.hashCode() + "", Toast.LENGTH_SHORT).show();
    }

    public void click(View view) {
        startActivity(new Intent(this, MainActivity2.class));
    }
}