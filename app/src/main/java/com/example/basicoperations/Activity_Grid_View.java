package com.example.basicoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_Grid_View extends AppCompatActivity {
    GridView gvCourses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__grid__view);

        gvCourses = findViewById(R.id.gvCourses);
        ArrayList al = new ArrayList();
        //Here we are creating a arrayList, where the data will be stored
        al.add("Java");
        al.add("Android");
        al.add("Python");
        al.add("Machine Learning");
        al.add("XML");
        al.add("HTML");
        al.add("PHP");
        al.add("React");
        al.add("Node JS");
        al.add("Mango DB");
        al.add("CSS");
        al.add("DBMS");
        //Here we are adding the data to thr array list

        ArrayAdapter aa = new ArrayAdapter(Activity_Grid_View.this,android.R.layout.simple_list_item_1,al);
        gvCourses.setAdapter(aa);
        gvCourses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tv = (TextView)view;
                String data = tv.getText().toString();
                Toast.makeText(Activity_Grid_View.this,"Selected Course : "+data,Toast.LENGTH_SHORT).show();

            }
        });
    }
}