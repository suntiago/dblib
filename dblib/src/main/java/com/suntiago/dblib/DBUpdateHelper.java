package com.suntiago.dblib;

/**
 * Created by zy on 2018/11/16.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import org.kymjs.kjframe.KJDB;

/**
 * Created by zy on 2018/2/25.
 */

public class DBUpdateHelper implements KJDB.DbUpdateListener {
    private static final String TAG = DBUpdateHelper.class.getSimpleName();
    public static final int DATABASE_VERSION = 1;

    @Override
    public void onCreate(Context context, SQLiteDatabase sqLiteDatabase) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }


}