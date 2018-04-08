package com.example.luka.convertme;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Luka on 8.4.2018..
 */

public class ConverterFormula {

    public ConverterFormula() {
    }

/*----------------------------- DISTANCE CONVERTER FUNCTION --------------------------------*/
    @SuppressLint("SetTextI18n")
    public void distanceConvertFun(TextView tvValue, TextView tvDistance, Intent resultIntent){
        String value            = resultIntent.getStringExtra("valueKm");
        String distanceValue    = resultIntent.getStringExtra("valueDistance");
        String distanceValueTo  = resultIntent.getStringExtra("valueDistanceToConvert");

        if(distanceValue.equals("Kilometers") && distanceValueTo.equals("Miles")){
            double milesValue       = Double.parseDouble(value)*0.621371192;
            String milesResult      = String.valueOf(milesValue);
            tvValue.setText(milesResult);
            tvDistance.setText("MILES");
        }
        else if (distanceValue.equals("Kilometers") && distanceValueTo.equals("Yards")){
            double yardsValue       = Double.parseDouble(value)*1093.6133;
            String yardsResult      = String.valueOf(yardsValue);
            tvValue.setText(yardsResult);
            tvDistance.setText("YARDS");
        }
        else if(distanceValue.equals("Kilometers") && distanceValueTo.equals("Kilometers")){
            double kilometersValue       = Double.parseDouble(value)*1;
            String kilometersResult      = String.valueOf(kilometersValue);
            tvValue.setText(kilometersResult);
            tvDistance.setText("KILOMETERS");
        }

        else if(distanceValue.equals("Miles") && distanceValueTo.equals("Kilometers")){
            double kilometersValue       = Double.parseDouble(value)*1.6;
            String kilometersResult      = String.valueOf(kilometersValue);
            tvValue.setText(kilometersResult);
            tvDistance.setText("KILOMETERS");
        }
        else if(distanceValue.equals("Miles") && distanceValueTo.equals("Yards")){
            double yardsValue       = Double.parseDouble(value)*1760;
            String yardsResult      = String.valueOf(yardsValue);
            tvValue.setText(yardsResult);
            tvDistance.setText("YARDS");
        }
        else if(distanceValue.equals("Miles") && distanceValueTo.equals("Miles")){
            double milesValue       = Double.parseDouble(value)*1;
            String milesResult      = String.valueOf(milesValue);
            tvValue.setText(milesResult);
            tvDistance.setText("MILES");
        }
        //0.00056818
        else if(distanceValue.equals("Yard") && distanceValueTo.equals("Kilometers")){
            double kilometersValue       = Double.parseDouble(value)*0.0009144;
            String kilometersResult      = String.valueOf(kilometersValue);
            tvValue.setText(kilometersResult);
            tvDistance.setText("KILOMETERS");
        }
        else if(distanceValue.equals("Yard") && distanceValueTo.equals("Miles")){
            double milesValue       = Double.parseDouble(value)*0.00056818;
            String milesResult      = String.valueOf(milesValue);
            tvValue.setText(milesResult);
            tvDistance.setText("MILES");
        }
        else{
            double yardsValue       = Double.parseDouble(value)*1;
            String yardsResult      = String.valueOf(yardsValue);
            tvValue.setText(yardsResult);
            tvDistance.setText("YARDS");
        }



    }
/*-------------------------------- TEMPERATURE CONVERTER FUNCTION -------------------------------*/
    @SuppressLint("SetTextI18n")
    public void tempConvertFun(TextView tvValue, TextView tempMeasure, Intent resultIntent) {
        String value        = resultIntent.getStringExtra("valueCel");
        String tempValue    = resultIntent.getStringExtra("valueTemperature");
        String tempValueTo  = resultIntent.getStringExtra("valueTemperatureToConvert");

        if (tempValue.equals("Celsius") && tempValueTo.equals("Kelvin")) {
            double kelvinValue  = Double.parseDouble(value) + 273.15;
            String kelvinResult = String.valueOf(kelvinValue);
            tvValue.setText(kelvinResult);
            tempMeasure.setText("KELVIN");
        }
        else if (tempValue.equals("Celsius") && tempValueTo.equals("Fahrenheit")) {
            double fahrenheitValue  = Double.parseDouble(value) * 33.8;
            String fahrenheitResult = String.valueOf(fahrenheitValue);
            tvValue.setText(fahrenheitResult);
            tempMeasure.setText("FAHRENHEIT");
        }
        else if (tempValue.equals("Celsius") && tempValueTo.equals("Celsius")) {
            double celsiusValue     = Double.parseDouble(value) * 1;
            String celsiusResult    = String.valueOf(celsiusValue);
            tvValue.setText(celsiusResult);
            tempMeasure.setText("CELSIUS");
        }
        else if (tempValue.equals("Kelvin") && tempValueTo.equals("Celsius")) {
            double celsiusValue     = Double.parseDouble(value) - 273.15;
            String celsiusResult    = String.valueOf(celsiusValue);
            tvValue.setText(celsiusResult);
            tempMeasure.setText("CELSIUS");
        }
        else if(tempValue.equals("Kelvin") && tempValueTo.equals("Fahrenheit")) {
            double fahrenheitValue  = (Double.parseDouble(value) * 1.8)-459.67 ;
            String fahrenheitResult = String.valueOf(fahrenheitValue);
            tvValue.setText(fahrenheitResult);
            tempMeasure.setText("FAHRENHEIT");
        }
        else if(tempValue.equals("Kelvin") && tempValueTo.equals("Kelvin")) {
            double kelvinValue  = Double.parseDouble(value);
            String kelvinResult = String.valueOf(kelvinValue);
            tvValue.setText(kelvinResult);
            tempMeasure.setText("KELVIN");
        }
        else if (tempValue.equals("Fahrenheit") && tempValueTo.equals("Celsius")) {
            double celsiusValue     = (Double.parseDouble(value) -32)*0.5555555556;
            String celsiusResult    = String.valueOf(celsiusValue);
            tvValue.setText(celsiusResult);
            tempMeasure.setText("CELSIUS");
        }
        else if(tempValue.equals("Fahrenheit") && tempValueTo.equals("Kelvin")) {
            double kelvinValue  = (Double.parseDouble(value)+459.67)*0.5555555556;
            String kelvinResult = String.valueOf(kelvinValue);
            tvValue.setText(kelvinResult);
            tempMeasure.setText("KELVIN");
        }
        else{
            double fahrenheitValue  = Double.parseDouble(value);
            String fahrenheitResult = String.valueOf(fahrenheitValue);
            tvValue.setText(fahrenheitResult);
            tempMeasure.setText("FAHRENHEIT");
        }
    }

    /*---------------------------- WEIGHT CONVERTER FUNCTION ----------------------*/
    @SuppressLint("SetTextI18n")
    public void weightConvertFun(TextView tvValue, TextView weightMeasure, Intent resultIntent){
        String value            = resultIntent.getStringExtra("valueKg");
        String weightValue      = resultIntent.getStringExtra("valueWeight");
        String weightValueTo    = resultIntent.getStringExtra("valueWeightToConvert");

        if(weightValue.equals("Kilograms") && weightValueTo.equals("Lbs")){
            double lbsValue         = Double.parseDouble(value) * 2.2046;
            String lbsResult        = String.valueOf(lbsValue);
            tvValue.setText(lbsResult);
            weightMeasure.setText("LBS");
        }
        else if (weightValue.equals("Kilograms") && weightValueTo.equals("Kilograms")){
            double kilogramsValue         = Double.parseDouble(value);
            String kilogramsResult        = String.valueOf(kilogramsValue);
            tvValue.setText(kilogramsResult);
            weightMeasure.setText("KILOGRAMS");
        }
        else if(weightValue.equals("Lbs") && weightValueTo.equals("Kilograms")){
            double kilogramsValue         = Double.parseDouble(value) * 0.45359237;
            String kilogramsResult        = String.valueOf(kilogramsValue);
            tvValue.setText(kilogramsResult);
            weightMeasure.setText("KILOGRAMS");
        }
        else{
            double lbsValue         = Double.parseDouble(value);
            String lbsResult        = String.valueOf(lbsValue);
            tvValue.setText(lbsResult);
            weightMeasure.setText("LBS");
        }
    }

    @SuppressLint("SetTextI18n")
    public void speedConvertFun(TextView tvValue, TextView tvSpeed, Intent resultIntent){
        String value            = resultIntent.getStringExtra("valueKmph");
        String speedValue       = resultIntent.getStringExtra("valueSpeed");
        String speedValueTo     = resultIntent.getStringExtra("valueSpeedToConvert");

        if(speedValue.equals("Kilometers per hour") && speedValueTo.equals("Miles per hour")){
            double mphValue       = Double.parseDouble(value)*0.621371192;
            String mphResult      = String.valueOf(mphValue);
            tvValue.setText(mphResult);
            tvSpeed.setText("MILES PER HOUR");
        }
        else if(speedValue.equals("Kilometers per hour") && speedValueTo.equals("Kilometers per hour")){
            double kmphValue       = Double.parseDouble(value);
            String kmphResult      = String.valueOf(kmphValue);
            tvValue.setText(kmphResult);
            tvSpeed.setText("KILOMETERS PER HOUR");
        }
        else if(speedValue.equals("Miles per hour") && speedValueTo.equals("Kilometers per hour")){
            double kmphValue       = Double.parseDouble(value)*1.609344;
            String kmphResult      = String.valueOf(kmphValue);
            tvValue.setText(kmphResult);
            tvSpeed.setText("KILOMETERS PER HOUR");
        }
        else{
            double mphValue       = Double.parseDouble(value);
            String mphResult      = String.valueOf(mphValue);
            tvValue.setText(mphResult);
            tvSpeed.setText("MILES PER HOUR");
        }
    }
}
