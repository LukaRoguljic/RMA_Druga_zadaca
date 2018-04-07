package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class KmToMiles extends AppCompatActivity {

    @BindView(R.id.kmConvertBtn) Button kmConvertBtn;
    @BindView(R.id.et_KmToMiles) EditText et_KmToMiles;
    EditText etValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_km_to_miles);

        ButterKnife.bind(this);
        etValue = et_KmToMiles;
    }

    @OnClick(R.id.kmConvertBtn)
        public void giveResultInMiles(){
        Intent startResultToMiles = new Intent(this,ResultKmToMiles.class);
        startResultToMiles.putExtra("valueKm", etValue.getText().toString());
        startActivity(startResultToMiles);
    }
}
