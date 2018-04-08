package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultTemperature extends AppCompatActivity {

    @BindView(R.id.tvTempResult)  TextView tvKelvinResult;
    @BindView(R.id.tempMeasure)     TextView tempMeasure;
    TextView tvValue;
    TextView tvTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_temperature);

        ButterKnife.bind(this);
        tvValue = tvKelvinResult;
        tvTemp = tempMeasure;
        Intent resultIntent     = getIntent();
        ConverterFormula objectKelvin = new ConverterFormula();
        objectKelvin.tempConvertFun(tvValue,tempMeasure,resultIntent);
    }
}
