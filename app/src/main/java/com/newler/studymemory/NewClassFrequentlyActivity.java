package com.newler.studymemory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewClassFrequentlyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_class_frequently);
        for (int i = 0; i < 10000000; i++) {
            Apple apple = new Apple();
        }
    }
}
