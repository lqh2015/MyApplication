package com.example.dl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        Log.e("BaseActivity",getClass().getSimpleName());
        Log.e("MainActivity","test");
        Log.e("MainActivity","test2");
    }

    public void getname(){
        Log.e("BaseActivity",this.getClass().getSimpleName());
    }
}
