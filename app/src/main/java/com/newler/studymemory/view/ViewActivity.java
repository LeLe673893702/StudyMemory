package com.newler.studymemory.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.newler.studymemory.R;

public class ViewActivity extends AppCompatActivity {
    private View oneView ;
    private View twoView;
    private View threeView;
    private View conView;
    private View reView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        oneView = View.inflate(this, R.layout.one_layout, null);
        twoView = View.inflate(this, R.layout.two_layout, null);
        threeView = View.inflate(this, R.layout.three_layout, null);
        conView = View.inflate(this, R.layout.activity_view, null);
        reView = View.inflate(this, R.layout.relative_layout, null);
    }

}
