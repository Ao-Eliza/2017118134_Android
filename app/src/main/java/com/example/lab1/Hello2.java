package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Hello2 extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Hello2-";
    private static int objCount = 0;
    private int mobjCount;

    private List<Hello2_fruit> fruitList = new ArrayList<Hello2_fruit>();//水果数据

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello2);

        //检测日志，活动的跳转日志
        objCount++;
        mobjCount = objCount;
        Log.d(TAG, mobjCount + "-onCreate");
        setTitle("Hello2");
        setupClicks();

        //水果列表ListView
        initFruits();//初始化水果数据
        Hello2_fruitAdapter adapter = new Hello2_fruitAdapter(Hello2.this, R.layout.activity_hello2_fruit, fruitList);
        ListView listView = (ListView) findViewById(R.id.fruitList);
        listView.setAdapter(adapter);
        //添加ListView点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Hello2_fruit fruit = fruitList.get(position);
                Toast.makeText(Hello2.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {//所有数据添加两遍，因为数据量不够，不足以布满整个屏幕
            Hello2_fruit apple = new Hello2_fruit("apple", R.drawable.apple_pic);
            fruitList.add(apple);
            Hello2_fruit banana = new Hello2_fruit("banana", R.drawable.banana_pic);
            fruitList.add(banana);
            Hello2_fruit orange = new Hello2_fruit("orange", R.drawable.orange_pic);
            fruitList.add(apple);
            Hello2_fruit watermelon = new Hello2_fruit("watermelon", R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Hello2_fruit pear = new Hello2_fruit("pear", R.drawable.pear_pic);
            fruitList.add(pear);
            Hello2_fruit mango = new Hello2_fruit("mango", R.drawable.mango_pic);
            fruitList.add(mango);
            Hello2_fruit grape = new Hello2_fruit("grape", R.drawable.grape_pic);
            fruitList.add(grape);
            Hello2_fruit strawberry = new Hello2_fruit("strawberry", R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Hello2_fruit pineapple = new Hello2_fruit("pineapple", R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Hello2_fruit cherry = new Hello2_fruit("cherry", R.drawable.cherry_pic);
            fruitList.add(cherry);
        }
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
        Log.d(TAG, mobjCount + "-onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, mobjCount + "-onPause");
    }

    @Override
    protected void onResume() {
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
    }
}
