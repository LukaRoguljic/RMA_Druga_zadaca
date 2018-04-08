package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ToDistance extends AppCompatActivity {

    @BindView(R.id.distanceConvertBtn)         Button distanceConvertBtn;
    @BindView(R.id.et_Distance)                EditText et_Distance;
    @BindView(R.id.distanceSpinner)            Spinner distanceSpinner;
    @BindView(R.id.distanceSpinnerToConvert)   Spinner distanceSpinnerToConvert;
    EditText    etValue;
    Spinner     spDistance;
    Spinner     spDistanceToConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        ButterKnife.bind(this);
        etValue = et_Distance;
        spDistance = distanceSpinner;
        spDistanceToConvert = distanceSpinnerToConvert;
    }

    @OnClick(R.id.distanceConvertBtn)
        public void giveResultDistance(){

        if(etValue.getText().toString().matches("")){
            Toast.makeText(this, "You did not enter value!", Toast.LENGTH_SHORT).show();
            return;
        }
        else {
            Intent startResult = new Intent(this, ResultDistance.class);
            startResult.putExtra("valueKm", etValue.getText().toString());
            startResult.putExtra("valueDistance", spDistance.getSelectedItem().toString());
            startResult.putExtra("valueDistanceToConvert", spDistanceToConvert.getSelectedItem().toString());
            startActivity(startResult);
        }
    }
}
