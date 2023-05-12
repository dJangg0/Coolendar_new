package com.example.coolendar;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AlarmSet extends AppCompatActivity {

   TextView tv_time;
   ImageButton set_alarm;
   ImageButton cancel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_events);

        tv_time = findViewById(R.id.tv_time);
        set_alarm = findViewById(R.id.set_alarm);
        cancel = findViewById(R.id.cancel);



    }
}



