package com.example.class5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;

public class SharedActivity extends AppCompatActivity {

    MySharedPreferences msp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);
        msp = new MySharedPreferences(this);

        msp.putString("name", "dff");
        String result = msp.getString("name", "NA");

        animate();



        MySignal.vibrate(this, 500);
    }

    private void animate() {
        msp.putString("dfd", "drtdft");
    }

    @Override
    protected void onStart() {
        super.onStart();
        // TODO: 2019-11-27 start timer 
    }

    @Override
    protected void onStop() {
        super.onStop();
        // TODO: 2019-11-27 Stop timer
    }
}
