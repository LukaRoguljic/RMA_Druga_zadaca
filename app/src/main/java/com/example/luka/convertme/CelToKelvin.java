package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CelToKelvin extends AppCompatActivity {

    @BindView(R.id.celConvertBtn)   Button      celConvertBtn;
    @BindView(R.id.et_CelToKelvin)  EditText    et_CelToKelvin;
    EditText etValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cel_to_kelvin);

        ButterKnife.bind(this);
        etValue = et_CelToKelvin;
    }

    @OnClick(R.id.celConvertBtn)
        public void giveResultInKelvin(){
        Intent startResultToKelvin = new Intent(this,ResultCelsiusToKelvin.class);
        startResultToKelvin.putExtra("valueCel", etValue.getText().toString());
        startActivity(startResultToKelvin);
    }
}
