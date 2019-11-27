package com.example.class5b;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class MyApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        Stetho.initializeWithDefaults(this);


    }
}
