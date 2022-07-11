package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        if(getIntent().hasExtra("com.example.myaplication.SOMETHING")) {
            TextView hellotextView = (TextView) findViewById(R.id.helloWorldtextView);
            String text = (String) getIntent().getExtras().get("com.example.myaplication.SOMETHING");
            hellotextView.setText(text);
        }
    }
}