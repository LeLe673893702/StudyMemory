package com.newler.studymemory.inner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.newler.studymemory.R;

public class InnerActivity extends AppCompatActivity implements Runnable {
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner);
        imageView = findViewById(R.id.image);
        button = findViewById(R.id.button);


        imageView.postDelayed(this, 10000000);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("InnerActivity", "onDestroy");
        imageView.removeCallbacks(this);
    }

    @Override
    public void run() {

    }
}
