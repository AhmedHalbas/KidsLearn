package com.example.android.kidslearn;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private Handler mHandler = new Handler();

    private Intent intent;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                 intent = new Intent(SplashScreen.this,MainActivity.class);

                startActivity(intent);

                finish();

            }
        },1500);




    }
}
