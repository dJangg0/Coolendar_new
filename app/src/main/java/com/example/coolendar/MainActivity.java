package com.example.coolendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarView calendarView = findViewById(R.id.calendarView);
        ImageButton btnAdd = findViewById(R.id.btnAdd);
        ImageButton back = findViewById(R.id.back);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alarmSet();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStartingActivity();
            }
        });

    } //closing oncreate brackets

    private void openStartingActivity() {
        Intent intent = new Intent(this,StartingActivity.class);
        startActivity(intent);
    }

    public void alarmSet(){
      Intent intent = new Intent(this,AlarmSet.class);
      startActivity(intent);

    }



} //closing brackets