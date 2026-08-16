package com.taxi.alai;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("تاكسي علاء 🚕");
        text.setTextSize(28);
        text.setGravity(17);

        setContentView(text);
    }
}
