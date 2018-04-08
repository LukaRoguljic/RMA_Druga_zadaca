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

public class ToWeight extends AppCompatActivity {

    @BindView(R.id.weightConvertBtn)        Button      kgConvertBtn;
    @BindView(R.id.et_Weight)               EditText    et_KgToLbs;
    @BindView(R.id.weightSpinner)           Spinner     weightSpinner;
    @BindView(R.id.weightSpinnerToConvert)  Spinner     weightSpinnerToConvert;
    EditText etValue;
    Spinner spWeight;
    Spinner spWeightToConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        ButterKnife.bind(this);
        etValue = et_KgToLbs;
        spWeight = weightSpinner;
        spWeightToConvert = weightSpinnerToConvert;

    }

    @OnClick(R.id.weightConvertBtn)
        public void giveResultWeight(){
        Intent startResult = new Intent(this,ResultWeight.class);
        startResult.putExtra("valueKg", etValue.getText().toString());
        startResult.putExtra("valueWeight", spWeight.getSelectedItem().toString());
        startResult.putExtra("valueWeightToConvert", spWeightToConvert.getSelectedItem().toString());
        startActivity(startResult);
    }

}
