package com.derry.hilt_baseuse.app;

import android.app.Application;

import dagger.hilt.android.HiltAndroidApp;

// hilt 基本上都要 用 Application来辅助 （同学们去测试）
@HiltAndroidApp
public class MyApplication extends Application {

}
