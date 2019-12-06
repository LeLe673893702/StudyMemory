package com.newler.studymemory.reference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.newler.studymemory.R;

/**
 * @author 17173
 */
public class InstanceActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instance);
        findViewById(R.id.finish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ToastUtils.getInstance(this).showToast();
    }


}
