package com.newler.studymemory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MatActivity extends AppCompatActivity {
    private A a = new A(new D());
    private String[] strings = new String[1000000];
    private ArrayList<Integer> mArrayList = new ArrayList();
    private Mat mMat = new Mat();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat);
        for (int i = 0; i < 10; i++ ) {
            strings[i] = "1";
        }
        a = new A(new D());
        mArrayList.add(1);
    }
}
