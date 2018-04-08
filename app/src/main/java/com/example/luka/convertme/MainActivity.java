package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.distanceBtn)      Button kmMilesBtn;
    @BindView(R.id.temperatureBtn)    Button celKelvinBtn;
    @BindView(R.id.speedBtn)        Button kmMphBtn;
    @BindView(R.id.weightBtn)        Button kgLbsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.distanceBtn)
        public void startKmMiles(){
        Intent startKmToMilesActivity = new Intent(this,ToDistance.class);
        startActivity(startKmToMilesActivity);
    }

    @OnClick(R.id.temperatureBtn)
        public void startCelKelvin(){
            Intent startCelToKelvinActivity = new Intent(this,ToTemperature.class);
            startActivity(startCelToKelvinActivity);
    }

    @OnClick(R.id.speedBtn)
        public void startKmhMph(){
            Intent startKmhToMphActivity = new Intent(this,ToSpeed.class);
            startActivity(startKmhToMphActivity);
    }

    @OnClick(R.id.weightBtn)
        public void startKgLbs(){
            Intent startKgToMlsActivity = new Intent(this,ToWeight.class);
            startActivity(startKgToMlsActivity);
    }

}
