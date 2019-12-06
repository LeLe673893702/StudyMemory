package com.newler.studymemory.collection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.LayoutInflater;
import android.view.View;

import com.newler.studymemory.Apple;
import com.newler.studymemory.R;

import java.util.HashMap;

public class HashMapActivity extends AppCompatActivity {

    private HashMap<Integer, Apple> hashMap;
    private SparseArray<Apple> sparseArray;
    private ArrayMap<Integer, Apple> arrayMap;

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hash_map);
        view = View.inflate(this, R.layout.activity_hash_map, null);

        hashMap = new HashMap<>(15);
        sparseArray = new SparseArray<>(15);
        arrayMap = new ArrayMap<>(15);



        for (int i = 0; i < 15; i++) {
            Apple apple = new Apple();
            hashMap.put(i, apple);

        }

        for (int i = 0; i < 15; i++) {
            Apple apple = new Apple();
            sparseArray.put(i, apple);

        }

        for (int i = 0; i < 15; i++) {
            Apple apple = new Apple();
            arrayMap.put(i, apple);
        }
    }
}
