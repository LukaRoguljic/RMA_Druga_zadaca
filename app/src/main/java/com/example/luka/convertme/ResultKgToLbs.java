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
        String value            = resultIntent.getStringExtra("valueKg");
        double kgValue          = Double.parseDouble(value);
        double lbsValue         = kgValue * 2.2046;
        String lbsResult        = String.valueOf(lbsValue);
        tvValue.setText(lbsResult);
    }
}
