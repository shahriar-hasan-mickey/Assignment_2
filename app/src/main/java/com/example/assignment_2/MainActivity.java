package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent tovangtichai = new Intent(MainActivity.this, VangtiChai.class);
                startActivity(tovangtichai);
                // This finish() function is called so that when back space is pressed it does not return to this activity again
                // this method actually gets rid of the piling up of activity in the stack by closing them
                finish();
            }
        }, 0);
    }
}