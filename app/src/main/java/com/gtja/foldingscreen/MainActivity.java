package com.gtja.foldingscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = findViewById(R.id.tv);

        //导航栏状态
        findViewById(R.id.btn_get_navigation_state).setOnClickListener(this);

        //设置屏幕长宽比例
        findViewById(R.id.btn_aspect_ratio).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent intent;
        switch (id) {
            case R.id.btn_get_navigation_state:
                intent = new Intent(this, GetNavigationStateActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_aspect_ratio:
                intent = new Intent(this, AspectRatioActivity.class);
                startActivity(intent);
                break;
        }
    }
}