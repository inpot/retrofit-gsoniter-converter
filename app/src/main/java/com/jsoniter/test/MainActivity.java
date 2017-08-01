package com.jsoniter.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jsoniter.JsonIterator;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import jsoniter.JsoniterConverterFactory;
import model.TestEntity;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivity";
    String baseUrl = "https://test.78x56.com/api/v1/";
    String test ="{\"rs\":true,\"code\":200}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testJsoniter();
    }

    private void testJsoniter2() {
        TestEntity entity = JsonIterator.deserialize(test, TestEntity.class);
        Log.i(TAG, "testJsoniter2: " + entity.toString());
    }

    private void testJsoniter() {
        // usage add converter
        Retrofit retrofit = new Retrofit.Builder().addConverterFactory(new JsoniterConverterFactory()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).baseUrl(baseUrl).build();
    }
}
