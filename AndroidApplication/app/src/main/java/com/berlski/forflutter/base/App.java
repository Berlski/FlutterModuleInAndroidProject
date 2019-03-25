package com.berlski.forflutter.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2015/11/19.
 */
public class App extends Application {

   private static Application application;

    @Override
    public void onCreate() {
        super.onCreate();

        application = this;
    }

    public static Application getApplication(){
        return application;
    }

    public static Context getContext(){
        return getApplication().getApplicationContext();
    }

    /**
     * 根据dimen值计算返回对应屏幕的px值，
     *
     * @param id R.dimen.id
     * @return
     */
    public static int getCount(int id) {
        return getApplication().getResources().getDimensionPixelSize(id);
    }
}
