package com.jsoniter.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jsoniter.JsonIterator;

import model.TestEntity;

public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivity";
    String test ="{\"rs\":true,\"code\":200}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testJsoniter2();
    }

    private void testJsoniter2() {
        TestEntity entity = JsonIterator.deserialize(test, TestEntity.class);
        Log.i(TAG, "testJsoniter2: " + entity.toString());
    }


}
