package com.example.sandualexandru.test;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        getSupportFragmentManager().beginTransaction().replace(R.id.contentFrame, DummyFragment.newInstance()).commit();

        Log.d("DESTROY", "onCreate: INTRO");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("DESTROY", "onNewIntent: INTRO");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("DESTROY", "onDestroy: INTRO");
    }
}
