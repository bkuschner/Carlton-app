package com.example.carltonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_USERNAME = "com.example.carltonapp.USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void watchFootball (View view) {
        Intent toWatchActivity = new Intent(this, WatchFootballActivity.class);
        toWatchActivity.putExtra(EXTRA_USERNAME,
                getResources().getString(R.string.unidentified_greeting));
        startActivity(toWatchActivity);
    }

    public void login (View view) {
        Intent toLogin = new Intent(this, LoginActivity.class);
        startActivity(toLogin);
    }

}
