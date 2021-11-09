package com.derry.hilt_baseuse.simple3.interfacedi;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class) // 注入到 Activity
public abstract class TestInterfaceModule {

    @Binds //        接口              与         实现类   的注入工作
    public abstract  TestInterface bindTestClass(TestClassImpl testClass);
}
