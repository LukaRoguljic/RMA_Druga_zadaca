package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultSpeed extends AppCompatActivity {

    @BindView(R.id.tvSpeedResult) TextView tvMphResult;
    @BindView(R.id.speedMeasure)  TextView speedMeasure;
    TextView tvValue;
    TextView tvSpeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_speed);

        ButterKnife.bind(this);
        tvValue = tvMphResult;
        tvSpeed = speedMeasure;

        Intent resultIntent = getIntent();
        ConverterFormula objectSpeed = new ConverterFormula();
        objectSpeed.speedConvertFun(tvValue,tvSpeed,resultIntent);
    }
}
