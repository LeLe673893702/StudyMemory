package com.newler.studymemory;

import android.content.Context;

import java.util.ArrayList;

/**
 * @author 17173
 * @what
 * @date 2018/9/12
 */
public class Mat {
    private ArrayList<String> mStrings = new ArrayList<>();
    private Context mContext;
    public Mat() {
        mStrings.add("1");
    }

    public Mat(Context context) {
        mContext = context;
    }
}
