package com.example.lab1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Hello1 extends AppCompatActivity implements View.OnClickListener {//添加点击事件监听器


    private static final String TAG = "Hello1-";//在控制台那边输出对应模块，便于查看日志
    private static int objCount = 0;
    private int mobjCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objCount++;
        mobjCount = objCount;
        Log.d(TAG, mobjCount + "-onCreate");
        setTitle("Hello1");
        setupClicks();
    }

    private void setupClicks() {//监听点击事件
        Button b;

        b = findViewById(R.id.btToHello1);
        b.setOnClickListener(this);
        b = findViewById(R.id.btToHello2);
        b.setOnClickListener(this);
        b = findViewById(R.id.btToHello3);
        b.setOnClickListener(this);
        b = findViewById(R.id.call);
        b.setOnClickListener(this);
        b = findViewById(R.id.map);
        b.setOnClickListener(this);
        b = findViewById(R.id.website);
        b.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, mobjCount + "-onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, mobjCount + "-onPause");
    }

    @Override
    protected void onResume() {//中断后重新开始
        super.onResume();
        Log.d(TAG, mobjCount + "-onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, mobjCount + "-onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        objCount--;
        Log.d(TAG, mobjCount + "-onDestroy");
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
        if (v.getId() == R.id.call) {
            intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + "888888"));
            startActivity(intent);
        }
        //简单的打开谷歌地图
        if (v.getId() == R.id.map) {
            Uri uri = Uri.parse("geo:38.899533,-77.036476");
            intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        if (v.getId() == R.id.website) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://www.baidu.com"));
            startActivity(intent);
        }
    }
}
