package com.htc.eleven.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    public static final String TAG = "Eleven-DisplayActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView text = (TextView) findViewById(R.id.text_view);

        String message = getIntent().getStringExtra(MyActivity.EXTRA_MESSAGE);
        text.setText(message);
        Log.d(TAG, "Default text size is: " + text.getTextSize());
        text.setTextSize(40);
        Log.d(TAG, "Current text size is: " + text.getTextSize());
        // getTextSize()'s value is larger than current value, why ?
//        float size = text.getTextSize();
//        text.setTextSize(size);
    }
}
