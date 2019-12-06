package com.newler.studymemory.image;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.request.RequestOptions;
import com.newler.studymemory.Apple;
import com.newler.studymemory.R;

public class ImageActivity extends AppCompatActivity {
    private static final String IMAGE_PATH = "http://17173-video-qiniu-s.17173cdn.com/1531291915624.m3u8";
    private ImageView iv565, iv888;
    private Apple apple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        iv565 = findViewById(R.id.image565);
        iv888 = findViewById(R.id.image888);

        apple = new Apple();

        Glide.with(this)
                .load(IMAGE_PATH)
                .apply(new RequestOptions().format(DecodeFormat.PREFER_RGB_565))
                .into(iv565);

        Glide.with(this)
                .load(IMAGE_PATH)
                .apply(new RequestOptions().format(DecodeFormat.PREFER_ARGB_8888))
                .into(iv888);
    }
}
