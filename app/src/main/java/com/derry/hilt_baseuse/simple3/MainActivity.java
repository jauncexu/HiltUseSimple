package com.derry.hilt_baseuse.simple3;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.derry.hilt_baseuse.R;
import com.derry.hilt_baseuse.simple3.interfacedi.TestInterface;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    TestInterface testInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        testInterface.method();
    }
}
