package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultCelsiusToKelvin extends AppCompatActivity {

    @BindView(R.id.tvKelvinResult) TextView tvKelvinResult;
    TextView tvValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_celsius_to_kelvin);

        ButterKnife.bind(this);
        tvValue = tvKelvinResult;

        Intent resultIntent     = getIntent();
        String value            = resultIntent.getStringExtra("valueCel");
        double celsiusValue     = Double.parseDouble(value);
        double kelvinValue      = celsiusValue + 273.15;
        String kelvinResults    = String.valueOf(kelvinValue);
        tvValue.setText(kelvinResults);
    }
}
