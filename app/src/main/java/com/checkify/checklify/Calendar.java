package com.checkify.checklify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Calendar extends AppCompatActivity {

    CustomCalendar customCalendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        customCalendar = (CustomCalendar)findViewById(R.id.activity_custom_calendar);
    }
}
