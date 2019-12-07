package com.newler.studymemory;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.newler.studymemory.collection.HashMapActivity;
import com.newler.studymemory.image.ImageActivity;
import com.newler.studymemory.inner.InnerActivity;
import com.newler.studymemory.net.OkHttpActivity;
import com.newler.studymemory.reference.HaHaActivity;
import com.newler.studymemory.reference.InstanceActivity;
import com.newler.studymemory.view.ViewActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btCollection, btManyView,
            btInner, btNewObject, btMat, btImage, btHaHa;
    private ArrayList<Integer> mIntegerArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mIntegerArrayList =  new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            mIntegerArrayList.add(i);
        }
    }

    private void initView() {
        btCollection = findViewById(R.id.collection);
        btCollection.setOnClickListener(this);

        btManyView = findViewById(R.id.many_view);
        btManyView.setOnClickListener(this);

        btInner = findViewById(R.id.inner_view);
        btInner.setOnClickListener(this);

        btNewObject = findViewById(R.id.new_object_view);
        btNewObject.setOnClickListener(this);

        btMat = findViewById(R.id.mat);
        btMat.setOnClickListener(this);

        btHaHa = findViewById(R.id.bt_test_haha);
        btHaHa.setOnClickListener(this);

        findViewById(R.id.weak).setOnClickListener(this);

        findViewById(R.id.bt_image).setOnClickListener(this);

        findViewById(R.id.bt_test_okhttp).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.collection:
                startHashMapActivity();
                break;

            case R.id.many_view:
                startViewActivity();
                break;

            case R.id.inner_view:
                startInnerActivity();
                break;

            case R.id.new_object_view:
                startNewObjectActivity();
                break;

            case R.id.mat:
                startMatActivity();
                break;

            case R.id.weak:
                startWeakActivity();
                break;

            case R.id.bt_image:
                startImageActivity();
                break;

            case R.id.bt_test_haha:
                startHaHaActivity();
                break;

            case R.id.bt_test_okhttp:
                startOkHttpActivity();
                break;

            default:break;
        }
    }

    public void startImageActivity() {
        Intent starter = new Intent(this, ImageActivity.class);
        startActivity(starter);
        finish();
    }

    public void startWeakActivity() {
        Intent starter = new Intent(this, InstanceActivity.class);
        try {
            starter.putExtra("ss", mIntegerArrayList);
            startActivity(starter);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void startMatActivity() {
        Intent starter = new Intent(this, MatActivity.class);
        startActivity(starter);
    }

    public void startNewObjectActivity() {
        Intent starter = new Intent(this, NewClassFrequentlyActivity.class);
        startActivity(starter);
    }


    public void startHashMapActivity() {
        Intent starter = new Intent(this, HashMapActivity.class);
        startActivity(starter);
    }


    public void startViewActivity() {
        Intent starter = new Intent(this, ViewActivity.class);
        startActivity(starter);
    }

    public void startInnerActivity() {
        Intent starter = new Intent(this, InnerActivity.class);

        startActivity(starter);
    }

    public void startHaHaActivity() {
        Intent starter = new Intent(this, HaHaActivity.class);
        startActivity(starter);
    }

    public void startOkHttpActivity() {
        Intent starter = new Intent(this, OkHttpActivity.class);
        startActivity(starter);
    }
}
