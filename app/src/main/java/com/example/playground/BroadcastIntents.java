package com.example.playground;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BroadcastIntents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_intents);
    }

    // broadcast a custom intent
    public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("com.example.playground.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}