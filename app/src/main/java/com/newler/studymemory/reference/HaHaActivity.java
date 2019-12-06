package com.newler.studymemory.reference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.newler.studymemory.Apple;
import com.newler.studymemory.R;
import com.newler.studymemory.TestModel;

import java.util.ArrayList;
import java.util.List;

public class HaHaActivity extends AppCompatActivity {
    private List<TestModel> mTestModels ;
    private List<Apple> mApples;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ha_ha);
        mTestModels = new ArrayList<>();
        mApples = new ArrayList<>();
        for(int i = 0; i < 50; i++) {
            mTestModels.add(new TestModel(i));
        }

        for (int j = 0; j < 50; j++) {
            mApples.add(new Apple());
        }
    }
}
