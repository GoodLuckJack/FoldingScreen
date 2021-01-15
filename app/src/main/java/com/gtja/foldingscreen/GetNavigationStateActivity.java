package com.gtja.foldingscreen;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * Created by Jacky on 2020/11/6.
 */
public class GetNavigationStateActivity extends Activity {

    private static final int MASK = 0x00000001;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_navigation_state_activity);

        final TextView tv = findViewById(R.id.tv_navigation_state);
        findViewById(R.id.btn_set_navigation_state).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hide();
                if (getVisibility()) {
                    tv.setText("隐藏");
                } else {
                    tv.setText("显示");
                }
            }
        });

        if (getVisibility()) {
            tv.setText("隐藏");
        } else {
            tv.setText("显示");
        }
    }

    private boolean getVisibility() {
        int systemUIVisibility = getWindow().getDecorView().getSystemUiVisibility();
        boolean visibility = ((systemUIVisibility >> 1) & MASK) != 0;
        return visibility;
    }

    private void hide() {
        View decorView = getWindow().getDecorView();
        // Hide both the navigation bar and the status bar.
        // SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
        // a general rule, you should design your app to hide the status bar whenever you
        // hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }
}
