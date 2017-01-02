package com.example.macbook.demoproject;

import android.app.Application;
import android.util.Log;

import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;

/**
 * Created by LCT
 * Time:16/12/29 16:48.
 * Annotation：
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PushAgent mPushAgent = PushAgent.getInstance(this);
        //注册推送服务，每次调用register方法都会回调该接口
        mPushAgent.register(new IUmengRegisterCallback() {

            @Override
            public void onSuccess(String deviceToken) {
                Log.i("deviceToken",deviceToken);
            }

            @Override
            public void onFailure(String s, String s1) {
                Log.i("deviceToken",s1);
            }
        });


    }
}
