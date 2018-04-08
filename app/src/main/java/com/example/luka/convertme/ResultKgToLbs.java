package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultKgToLbs extends AppCompatActivity {

    @BindView(R.id.tvLbsResult) TextView tvLbsResult;
    TextView tvValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_kg_to_lbs);

        ButterKnife.bind(this);
        tvValue = tvLbsResult;

        Intent resultIntent     = getIntent();
        ConverterFormula objectLbs = new ConverterFormula();
        objectLbs.kgToLbsConvert(tvValue,resultIntent);
    }
}
