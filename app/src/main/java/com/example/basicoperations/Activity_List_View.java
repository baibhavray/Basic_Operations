package com.example.basicoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_List_View extends AppCompatActivity {
    ListView lvCourses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__list__view);

        lvCourses =findViewById(R.id.lvCourses);
        ArrayList al = new ArrayList();
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
        ArrayAdapter aa = new ArrayAdapter(Activity_List_View.this,android.R.layout.simple_list_item_1,al);
        lvCourses.setAdapter(aa);
        lvCourses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView tv = (TextView) view;
                String data = tv.getText().toString();
                Toast.makeText(Activity_List_View.this,"Selected Course "+data,Toast.LENGTH_SHORT).show();
            }
        });
    }
}