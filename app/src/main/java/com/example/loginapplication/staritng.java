package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class staritng extends AppCompatActivity {
Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staritng);
       timer=new Timer();
       timer.schedule(new TimerTask() {
           @Override
           public void run() {
               Intent intent=new Intent(staritng.this,MainActivity.class);
               startActivity(intent);
               finish();
           }
       },3000);
    }
}