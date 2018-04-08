package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultWeight extends AppCompatActivity {

    @BindView(R.id.tvWeightResult)  TextView tvLbsResult;
    @BindView(R.id.weightMeasure)  TextView weightMeasure;
    TextView tvValue;
    TextView tvWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_weight);

        ButterKnife.bind(this);
        tvValue = tvLbsResult;
        tvWeight = weightMeasure;

        Intent resultIntent     = getIntent();
        ConverterFormula objectWeight = new ConverterFormula();
        objectWeight.weightConvertFun(tvValue,tvWeight,resultIntent);
    }
}
