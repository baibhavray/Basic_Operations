package com.example.basicoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_Spinner extends AppCompatActivity {
    Spinner spCourses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__spinner);

        spCourses = findViewById(R.id.spCourses);
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

        ArrayAdapter aa = new ArrayAdapter(Activity_Spinner.this,android.R.layout.simple_list_item_1,al);
        spCourses.setAdapter(aa);
        spCourses.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i !=0){
                    TextView tv = (TextView) view;
                    String data = tv.getText().toString();
                    Toast.makeText(Activity_Spinner.this,"Selected Course : "+data,Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}