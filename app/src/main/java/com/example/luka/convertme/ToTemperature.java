package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ToTemperature extends AppCompatActivity {

    @BindView(R.id.temperatureConvertBtn)       Button      temperatureConvertBtn;
    @BindView(R.id.et_Temperature)              EditText    et_Temperature;
    @BindView(R.id.temperatureSpinner)          Spinner     temperatureSpinner;
    @BindView(R.id.temperatureSpinnerToConvert) Spinner     temperatureSpinnerToConvert;
    EditText etValue;
    Spinner  spTemperature;
    Spinner spTemperatureToConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        ButterKnife.bind(this);
        etValue = et_Temperature;
        spTemperature = temperatureSpinner;
        spTemperatureToConvert =temperatureSpinnerToConvert;
    }

    @OnClick(R.id.temperatureConvertBtn)
        public void giveResultTemperature(){
        Intent startResult = new Intent(this,ResultTemperature.class);
        startResult.putExtra("valueCel", etValue.getText().toString());
        startResult.putExtra("valueTemperature", spTemperature.getSelectedItem().toString());
        startResult.putExtra("valueTemperatureToConvert", spTemperatureToConvert.getSelectedItem().toString());
        startActivity(startResult);
    }
}
