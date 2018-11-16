package com.suntiago.dblibDemo;

import android.app.Application;

import com.suntiago.dblib.DBUpdateHelper;

import org.kymjs.kjframe.KJDB;

/**
 * Created by zy on 2018/11/16.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initKJDB();
    }

    private void initKJDB() {
        KJDB.create(this, "yujia_carpro.db",
                false, DBUpdateHelper.DATABASE_VERSION, new DBUpdateHelper());
    }
}
