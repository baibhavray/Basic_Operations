package com.example.basicoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class Activity_Radio_Button extends AppCompatActivity {

    LinearLayout layout;
    RadioButton rbRed,rbGreen,rbBlue,rbWhite,rbYellow,rbBlack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__radio__button);

        layout = findViewById(R.id.layout);
        rbRed = findViewById(R.id.rbRed);
        rbGreen = findViewById(R.id.rbGreen);
        rbBlue = findViewById(R.id.rbBlue);
        rbWhite = findViewById(R.id.rbWhite);
        rbYellow = findViewById(R.id.rbYellow);
        rbBlack = findViewById(R.id.rbBlack);

        rbRed.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                layout.setBackgroundColor(Color.RED);
                //Here we are setting the background color to red by click that button
            }
        });
        rbGreen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                layout.setBackgroundColor(Color.GREEN);
            }
        });
        rbBlue.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                layout.setBackgroundColor(Color.BLUE);
            }
        });
        rbWhite.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                layout.setBackgroundColor(Color.WHITE);
                //Here we are setting the background color to red by click that button
            }
        });
        rbYellow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                layout.setBackgroundColor(Color.YELLOW);
            }
        });
        rbBlack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                layout.setBackgroundColor(Color.BLACK);
            }
        });
    }
}