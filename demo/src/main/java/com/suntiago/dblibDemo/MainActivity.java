package com.suntiago.dblibDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.kymjs.kjframe.KJDB;

/**
 * Created by zy on 2018/11/16.
 */

public class MainActivity extends Activity {
    private final String TAG = getClass().getSimpleName();


    Entity e = new Entity(1, "hello world");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void save(View v) {
        if (KJDB.getDefaultInstance().findById(1, Entity.class) != null) {
            KJDB.getDefaultInstance().update(e);
            Toast.makeText(this, "update success", Toast.LENGTH_LONG).show();
        } else {
            KJDB.getDefaultInstance().save(e);
            Toast.makeText(this, "save success", Toast.LENGTH_LONG).show();
        }
    }

    public void query(View view) {
        Entity et = KJDB.getDefaultInstance().findById(1, Entity.class);
        if (et != null) {

            Toast.makeText(this, "query success  " + et.getName(), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "not found", Toast.LENGTH_LONG).show();
        }
    }
}
