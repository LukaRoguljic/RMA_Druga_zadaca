package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultDistance extends AppCompatActivity {

    @BindView(R.id.tvDistanceResult)   TextView tvMilesResult;
    @BindView(R.id.distanceMeasure) TextView distanceMeasure;
    TextView tvValue;
    TextView tvDistance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_distance);

        ButterKnife.bind(this);
        tvValue = tvMilesResult;
        tvDistance = distanceMeasure;

        Intent resultIntent     = getIntent();
        ConverterFormula objectDistance = new ConverterFormula();
        objectDistance.distanceConvertFun(tvValue,tvDistance,resultIntent);
    }
}
