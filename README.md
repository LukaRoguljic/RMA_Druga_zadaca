# RMA_Druga_zadaca
 Description: ConvertMe is mobile application for converting units ( speed, distance, weight, temperature ).
 
 ## Summary
 Application was developed in Android Studio ( java and XML used ).
 Simulation was done on Genymotion Virtual Machine.
 StackOverflow used as helping material for making this application.
 
 ## Structure of application
 Application has 9 activities ( starting activity, activity where user inputs value and activity where the result of conversation is shown),
 and 10 classes. 9 classes are for each activity and one additional class was made to make function for converting units.
 
 
## Problems
One fatal error and problem occured when user didn't input any value and after clicking "CONVERT" cutton the application would crashed.
This problem was solved with adding: 
```java
if(etValue.getText().toString().matches("")){
            Toast.makeText(this, "You did not enter value!", Toast.LENGTH_SHORT).show();
            return;
}
else {
            /*CREATE INTENT , PUT EXTRAS AND SEND IT TO NEW ACTIVITY*/;
}
```
Starting activity

![alt text](https://i.imgur.com/wg8AA0Z.png)

Input value and convert activity

![alt text](https://i.imgur.com/zmiirlM.png)

Result activity


![alt text](https://i.imgur.com/QRHDHJj.png)
