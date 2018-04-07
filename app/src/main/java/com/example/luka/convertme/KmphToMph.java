package com.example.luka.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class KmphToMph extends AppCompatActivity {

    @BindView(R.id.kmphConvertBtn)   Button     kmphConvertBtn;
    @BindView(R.id.et_KmphToMph)     EditText   et_KmphToMph;
    EditText etValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmph_mph);

        ButterKnife.bind(this);
        etValue = et_KmphToMph;
    }

    @OnClick(R.id.kmphConvertBtn)
        public void givResultInMph(){
        Intent startResultToMph = new Intent(this,ResultKmphToMph.class);
        startResultToMph.putExtra("valueKmph", etValue.getText().toString());
        startActivity(startResultToMph);
    }
}
