package com.example.basicoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Activity_Image_View extends AppCompatActivity {
    ImageView iv;
    Button btnFirst,btnNext,btnPrevious,btnLast;
    int arr[] = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__image__view);

        iv = findViewById(R.id.iv);
        btnFirst = findViewById(R.id.btnFirst);
        btnNext = findViewById(R.id.btnNext);
        btnPrevious = findViewById(R.id.btnPrevious);
        btnLast = findViewById(R.id.btnLast);
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                iv.setImageResource(arr[count]);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == arr.length-1){
                    Toast.makeText(Activity_Image_View.this,"Last Image",Toast.LENGTH_LONG).show();
                }
                else{
                    count++;
                    iv.setImageResource(arr[count]);
                }

            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(count == 0){
                    Toast.makeText(Activity_Image_View.this,"First Image",Toast.LENGTH_LONG).show();
                }
                else{
                    count--;
                    iv.setImageResource(arr[count]);
                }

            }
        });

        btnLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = arr.length-1;
                iv.setImageResource(arr[count]);
            }
        });


    }
}