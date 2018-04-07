package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultKmToMiles extends AppCompatActivity {

    @BindView(R.id.tvMilesResult)   TextView tvMilesResult;
    TextView tvValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_km_to_miles);

        ButterKnife.bind(this);
        tvValue = tvMilesResult;

        Intent resultIntent     = getIntent();
        String value            = resultIntent.getStringExtra("valueKm");
        double kilometersValue  = Double.parseDouble(value);
        double milesValue       = kilometersValue * 0.6;
        String milesResult      = String.valueOf(milesValue);
        tvValue.setText(milesResult);
    }
}
