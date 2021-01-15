package com.gtja.foldingscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * maxAspectRatio设置的是最大的宽与高的比例
 * 注意：如果设置了最大宽高比，请不要忘记也设置 android：resizeableActivity false。否则，最大宽高比无意义。
 */
public class AspectRatioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspect_ratio);
    }
}