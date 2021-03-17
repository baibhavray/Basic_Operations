package com.example.basicoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity_Check_Box extends AppCompatActivity {
    CheckBox cbFriends,cbWebsite,cbNewsPaper,cbOthers;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__check__box);

        cbFriends = findViewById(R.id.cbFriends);
        cbWebsite = findViewById(R.id.cbWebsite);
        cbNewsPaper = findViewById(R.id.cbNewsPaper);
        cbOthers = findViewById(R.id.cbOthers);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer sb = new StringBuffer();

                if (cbFriends.isChecked()){
                    sb.append(" Friends");
                    //Here we are checking the condition, if true then it'll append/add the text to StringBuffer
                }
                if (cbWebsite.isChecked()){
                    sb.append(" WebSite");
                }
                if (cbNewsPaper.isChecked()){
                    sb.append(" NewsPaper");
                }
                if (cbOthers.isChecked()){
                    sb.append(" Others");
                }
                Toast.makeText(Activity_Check_Box.this,"Selected : "+sb.toString(),Toast.LENGTH_LONG).show();
                //Here we are toasting a message by using "Toast", "MainActivity.this" is the current activity object
                //"Toast.LENGTH_LONG" is used for the duration of toast(how much time this message will be displayed)."show()" is used to display the message

            }

        });
    }
}