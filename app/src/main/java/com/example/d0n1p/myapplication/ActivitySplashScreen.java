package com.example.d0n1p.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class ActivitySplashScreen extends AppCompatActivity {

    private int SLEEP_TIMER = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iSplash = new Intent(ActivitySplashScreen.this, MainActivity.class);
                startActivity(iSplash);

                finish();
            }
        }, SLEEP_TIMER);

    }

}
