package org.serasera.horizontalscrollactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Handler centerHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        centerHandler.postDelayed(centerFocusedButton, 3000);

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    private Runnable centerFocusedButton = () -> {
        Log.i(TAG, "4.getx : " + findViewById(R.id.button4).getX());
//        findViewById(R.id.horizontal_scroll_view).scrollBy(Math.round(findViewById(R.id.button4).getX()),0);
        int width = findViewById(R.id.horizontal_scroll_view).getWidth();
        int b4width = findViewById(R.id.button4).getWidth();
        Log.i(TAG, "scrollview width: " + width);
        findViewById(R.id.horizontal_scroll_view).scrollBy(Math.round(findViewById(R.id.button4).getX()) - (width/2) + (b4width/2),0);

    };
}