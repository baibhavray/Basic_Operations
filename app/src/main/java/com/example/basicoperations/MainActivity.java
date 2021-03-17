package com.example.basicoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnRadio,btnCheckBox,btnGridView,btnSpinner,btnListView,btnImageView,btnAuto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRadio = findViewById(R.id.btnRadio);
        btnCheckBox = findViewById(R.id.btnCheckBox);
        btnGridView = findViewById(R.id.btnGridView);
        btnSpinner = findViewById(R.id.btnSpinner);
        btnListView = findViewById(R.id.btnListView);
        btnImageView = findViewById(R.id.btnImageView);
        btnAuto = findViewById(R.id.btnAuto);

        btnRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Radio_Button.class);
                startActivity(intent);
            }
        });

        btnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Check_Box.class);
                startActivity(intent);
            }
        });

        btnGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Grid_View.class);
                startActivity(intent);
            }
        });

        btnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Spinner.class);
                startActivity(intent);
            }
        });

        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_List_View.class);
                startActivity(intent);
            }
        });
        btnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Image_View.class);
                startActivity(intent);
            }
        });
        btnAuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Auto_Complete_Text.class);
                startActivity(intent);
            }
        });


    }
}