package com.example.insta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> studentlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student s1 = new Student("يوسف",14,12,R.drawable.boy1);
        Student s2 = new Student("سلمان",13,10,R.drawable.boy1);
        Student s3 = new Student("ماجد",15,11,R.drawable.boy1);
        Student s4 = new Student("فهد",16,15,R.drawable.boy1);

        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        studentlist.add(s4);

        StudentAdapter studentAdapter = new StudentAdapter(this,0,studentlist);
        ListView listview = findViewById(R.id.listview);
        listview.setAdapter(studentAdapter);

    }
}