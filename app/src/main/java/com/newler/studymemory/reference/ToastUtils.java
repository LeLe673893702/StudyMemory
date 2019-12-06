package com.newler.studymemory.reference;

import android.content.Context;
import android.widget.Toast;

import com.newler.studymemory.Mat;

import java.lang.ref.WeakReference;

/**
 * @author 17173
 * @what
 * @date 2018/9/3
 */
public class ToastUtils {
    private static ToastUtils sInstance;
    private WeakReference<Context> mWeakContext ;
    private Mat mat;


    public static ToastUtils getInstance(Context context) {
        if (sInstance == null) {
            synchronized (ToastUtils.class) {
                if (sInstance == null) {
                    sInstance = new ToastUtils(context);
                }
            }
        }
        return sInstance;
    }

    public ToastUtils(Context context) {
        mWeakContext = new WeakReference<>(context);
    }

    public void showToast() {
//        Toast.makeText(mWeakContext.get(), "hello word", Toast.LENGTH_SHORT).show();
        mat = new Mat(mWeakContext.get());
    }
}
