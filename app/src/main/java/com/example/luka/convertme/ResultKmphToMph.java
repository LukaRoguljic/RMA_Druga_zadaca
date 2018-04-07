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
        String value = resultIntent.getStringExtra("valueKmph");
        double kmphValue = Double.parseDouble(value);
        double mphValue = kmphValue * 0.6;
        String mphResult = String.valueOf(mphValue);
        tvValue.setText(mphResult);
    }
}
