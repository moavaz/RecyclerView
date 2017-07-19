package com.example.moavaz.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<student> students = new ArrayList<>();
        for (int i = 0; i<100; i++){
            students.add(new student(i," name" +i));
        }
        ListView listView = (ListView) findViewById(R.id.stListview);
        ArrayAdapter arrayAdapter = new student_activity(this,students);
        listView.setAdapter(arrayAdapter);
    }
}
