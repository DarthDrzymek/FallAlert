package com.example.drzymek.fallalert;

import android.Manifest;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;
import android.view.View;

public class MainActivity extends Activity {
    private static Integer MY_PERMISSIONS_REQUEST_READ_CONTACTS=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.SEND_SMS},
                MY_PERMISSIONS_REQUEST_READ_CONTACTS);
        System.out.println(MY_PERMISSIONS_REQUEST_READ_CONTACTS);
        sendSMS("501815074","dupa kupa");
    }

    private void sendSMS(String phoneNumber, String message)
    {
        PendingIntent pi = PendingIntent.getActivity(this, 0,
                new Intent(this, SMS.class), 0);
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, message, pi, null);
    }

    public void onButtonClickStart(View view) {

    }


    public void onButtonClickStop(View view) {

    }

    public void onButtonClickDevice(View view) {

    }

    public void onButtonClickSettings(View view) {

    }

    public void onButtonClickCancelAlarm(View view) {

    }

    
}
