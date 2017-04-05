package com.test.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyBMI extends AppCompatActivity {
    private EditText mHight = null;
    private EditText mWeight = null;
    private Button mCalButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_bmi);
        mHight = (EditText)findViewById(R.id.editHight);
        mWeight = (EditText)findViewById(R.id.editWeight);
        mCalButton = (Button)findViewById(R.id.button);
    }
    public void calBMI(View v){
        String h = mHight.getText().toString();
        String w = mWeight.getText().toString();
        float weight = Float.parseFloat(w);
        float hight = Float.parseFloat(h);
        float BMI = weight/(hight*hight);
        Log.d("BMI",String.valueOf(BMI));
        Toast.makeText(this, String.valueOf(BMI),Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("BMI",BMI);
        startActivity(intent);

    }
}
