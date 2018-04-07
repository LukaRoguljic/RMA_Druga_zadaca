package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class KgToLbs extends AppCompatActivity {

    @BindView(R.id.kgConvertBtn) Button     kgConvertBtn;
    @BindView(R.id.et_KgToLBs)   EditText   et_KgToLbs;
    EditText etValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kg_to_lbs);

        ButterKnife.bind(this);
        etValue = et_KgToLbs;
    }

    @OnClick(R.id.kgConvertBtn)
        public void giveResultInLbs(){
        Intent startResultToLbs = new Intent(this,ResultKgToLbs.class);
        startResultToLbs.putExtra("valueKg", etValue.getText().toString());
        startActivity(startResultToLbs);
    }

}
