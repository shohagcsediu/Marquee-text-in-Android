package com.shohagapp.marqueetexteffect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mqtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mqtext = findViewById(R.id.mqtextTV);
        mqtext.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        mqtext.setSelected(true);
    }
}
