package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultKmphToMph extends AppCompatActivity {

    @BindView(R.id.tvMphResult) TextView tvMphResult;
    TextView tvValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_kmph_to_mph);

        ButterKnife.bind(this);
        tvValue = tvMphResult;

        Intent resultIntent = getIntent();
        ConverterFormula objectMph = new ConverterFormula();
        objectMph.kmphToMphConvert(tvValue,resultIntent);
    }
}
