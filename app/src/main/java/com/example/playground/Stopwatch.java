package com.example.playground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class Stopwatch extends AppCompatActivity {

    private int seconds = 0;
    private boolean running;
    private boolean wasRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        if(savedInstanceState != null){
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
        runTimer();
    }

//    Start the stopwatch running when the start button is clicked
    public void onClickStart(View view){
        running = true;
    }

//    Stop the stopwatch running when the Stop button is clicked
    public void onClickStop(View view){
        running = false;
    }

//    Reset teh stopwatch when the Reset button is clicked
    public void onClickReset(View view){
        running = false;
        seconds = 0;
    }

    //    looping function to keep increment timer
    private void runTimer() {
        final TextView timeView = (TextView) findViewById(R.id.textView);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;
                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);
                if (running) {
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });

    }

//    saving values so that they aren't destroyed when activity is recreated
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }

//    pauses the running when the user exits app
    @Override
    protected void onStop() {
        super.onStop();
        wasRunning = running;
        running = false;
    }

//    resumes the program when you enters app
    @Override
    protected  void onStart() {
        super.onStart();
        if(wasRunning){
            running = true;
        }
    }

    // pauses the running when the user exits app
    @Override
    protected void onPause() {
        super.onPause();
        wasRunning = running;
        running = false;
    }

    //    resumes the program when you enters app
    @Override
    protected  void onResume() {
        super.onResume();
        if(wasRunning){
            running = true;
        }
    }
}