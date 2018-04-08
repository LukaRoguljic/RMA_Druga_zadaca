package com.example.luka.convertme;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Luka on 8.4.2018..
 */

public class ConverterFormula {

    public ConverterFormula() {
    }

    public void kmToMilesConvert(TextView tvValue, Intent resultIntent){
        String value            = resultIntent.getStringExtra("valueKm");
        double milesValue       = Double.parseDouble(value)*0.6;
        String milesResult      = String.valueOf(milesValue);
        tvValue.setText(milesResult);
    }

    public void celToKelvinConvert(TextView tvValue, Intent resultIntent){
        String value            = resultIntent.getStringExtra("valueCel");
        double kelvinValue      = Double.parseDouble(value) + 273.15;
        String kelvinResults    = String.valueOf(kelvinValue);
        tvValue.setText(kelvinResults);
    }

    public void kgToLbsConvert(TextView tvValue, Intent resultIntent){
        String value            = resultIntent.getStringExtra("valueKg");
        double lbsValue         = Double.parseDouble(value) * 2.2046;
        String lbsResult        = String.valueOf(lbsValue);
        tvValue.setText(lbsResult);
    }

    public void kmphToMphConvert(TextView tvValue, Intent resultIntent){
        String value            = resultIntent.getStringExtra("valueKmph");
        double mphValue         = Double.parseDouble(value) * 0.6;
        String mphResult        = String.valueOf(mphValue);
        tvValue.setText(mphResult);
    }
}
