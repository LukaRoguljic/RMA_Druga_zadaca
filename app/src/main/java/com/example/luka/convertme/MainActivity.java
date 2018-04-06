package com.example.luka.convertme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.kmMilesBtn)      Button kmMilesBtn;
    @BindView(R.id.kgLbsBtn)        Button kgLbsBtn;
    @BindView(R.id.celKelvinBtn)    Button celKelvinBtn;
    @BindView(R.id.kmMphBtn)        Button kmMphBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
