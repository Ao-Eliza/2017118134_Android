package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Hello3 extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Hello3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello3);
        Log.d(TAG, "onCreate");
        setTitle("Hello2");
        setupClicks();
    }

    private void setupClicks() {
        Button b;

        b = (Button) findViewById(R.id.btToHello1);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.btToHello2);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.btToHello3);
        b.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        if (v.getId() == R.id.btToHello1) {
            intent = new Intent(this, Hello1.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btToHello2) {
            intent = new Intent(this, Hello2.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btToHello3) {
            intent = new Intent(this, Hello3.class);
            startActivity(intent);
        }
    }
}
