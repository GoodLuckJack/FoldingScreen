package com.gtja.foldingscreen.adaptive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gtja.foldingscreen.R;
import com.gtja.foldingscreen.adaptive.ui.main.TextAdaptiveFragment;

public class AdaptiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adaptive_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TextAdaptiveFragment.newInstance())
                    .commitNow();
        }
    }
}