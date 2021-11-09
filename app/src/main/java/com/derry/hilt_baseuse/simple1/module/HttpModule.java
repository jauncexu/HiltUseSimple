package com.derry.hilt_baseuse.simple1.module;

import com.derry.hilt_baseuse.simple1.obj.HttpObject;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ApplicationComponent;

// ActivityComponent.class    能注入到Activity，不能注入到Application
// ApplicationComponent.class 能注入到Activity， 能注入到Application
@InstallIn(ActivityComponent.class) // 注入到Activity里面去（按规则来，该是哪个注入，就写哪个，不要乱搞）
@Module
public class HttpModule {

    @Provides // 暴露对象 电脑
    public HttpObject getHttpObject(){
        return new HttpObject();
    }
}
