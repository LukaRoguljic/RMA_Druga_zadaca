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

public class ToSpeed extends AppCompatActivity {

    @BindView(R.id.speedConvertBtn)         Button      speedConvertBtn;
    @BindView(R.id.et_Speed)                EditText    et_Speed;
    @BindView(R.id.speedSpinner)            Spinner     speedSpinner;
    @BindView(R.id.speedSpinnerToConvert)   Spinner     speedSpinnerToConvert;
    EditText etValue;
    Spinner spSpeed;
    Spinner spSpeedToConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        ButterKnife.bind(this);
        etValue = et_Speed;
        spSpeed = speedSpinner;
        spSpeedToConvert = speedSpinnerToConvert;
    }

    @OnClick(R.id.speedConvertBtn)
        public void givResultSpeed(){
        Intent startResult = new Intent(this,ResultSpeed.class);
        startResult.putExtra("valueKmph", etValue.getText().toString());
        startResult.putExtra("valueSpeed", spSpeed.getSelectedItem().toString());
        startResult.putExtra("valueSpeedToConvert", spSpeedToConvert.getSelectedItem().toString());
        startActivity(startResult);
    }
}
