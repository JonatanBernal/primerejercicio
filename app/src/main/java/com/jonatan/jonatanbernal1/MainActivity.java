package com.jonatan.jonatanbernal1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private int numero;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG,"onCreate");
        setContentView(R.layout.activity_main);
        numero = 0;

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "onStart");
        numero = 1;

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy");
        numero = 4;
    }
}
