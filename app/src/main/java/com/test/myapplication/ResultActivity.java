package com.test.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        text = (TextView)findViewById(R.id.textResult);
        Intent intent = getIntent();
        float bmi = intent.getFloatExtra("BMI",0);
        text.setText("youer BMI is"+bmi);
    }
}
