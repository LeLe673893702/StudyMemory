package com.newler.studymemory.net;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.newler.studymemory.R;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ok_http);
        Button btStartNet = findViewById(R.id.btStartNet);
        btStartNet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startNet();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void startNet() throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        RequestBody requestBody = RequestBody.create(MediaType.get(""), "");
        Request request = new Request.Builder()
                .url("https://www.baidu.com/")
                .get()
                .build();
        Response response = okHttpClient.newCall(request).execute();
        Log.d("response", response.body().toString());
    }
}
