package com.derry.hilt_baseuse.simple2.module;

import com.derry.hilt_baseuse.simple2.obj.HttpObject;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.scopes.ActivityScoped;

@InstallIn(ActivityComponent.class)
@Module
public class HttpModule {

    @Provides
    // @Singleton // 上面的InstallIn 必须是 (ApplicationComponent.class) 才能全局单例
    @ActivityScoped // 上面的InstallIn 必须是 (ActivityComponent.class) 才能局部单例
    public HttpObject getHttpObject(){
        return new HttpObject();
    }
}
