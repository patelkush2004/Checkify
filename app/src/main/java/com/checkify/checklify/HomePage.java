package com.checkify.checklify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tomer.fadingtextview.FadingTextView;

public class HomePage extends AppCompatActivity {
    private FadingTextView fadingTextView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        fadingTextView = findViewById(R.id.fading_test_view);

        Button calendarbutton = (Button) findViewById(R.id.calendarbutton);
        calendarbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalendar();


            }
        });

        Button todolistbutton = (Button) findViewById(R.id.todolistbutton);
        todolistbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openToDoList();


            }
        });
    }

    public void openCalendar() {
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }

    public void openToDoList() {
        Intent intent = new Intent(this, ToDoList.class);
        startActivity(intent);
    }
}
