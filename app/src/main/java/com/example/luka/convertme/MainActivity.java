package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.kmMilesBtn)      Button kmMilesBtn;
    @BindView(R.id.kgLbsBtn)        Button kgLbsBtn;
    @BindView(R.id.celKelvinBtn)    Button celKelvinBtn;
    @BindView(R.id.kmMphBtn)        Button kmMphBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.kmMilesBtn)
        public void startKmMiles(){
        Intent startKmToMilesActivity = new Intent(this,KmToMiles.class);
        startActivity(startKmToMilesActivity);
    }

    @OnClick(R.id.kgLbsBtn)
        public void startKgLbs(){
            Intent startKgToLbsActivity = new Intent(this,KgToLbs.class);
            startActivity(startKgToLbsActivity);
    }

    @OnClick(R.id.celKelvinBtn)
        public void startCelKelvin(){
            Intent startCelToKelvinActivity = new Intent(this,CelToKelvin.class);
            startActivity(startCelToKelvinActivity);
    }

}
