package com.example.basicoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import java.util.ArrayList;

public class Activity_Auto_Complete_Text extends AppCompatActivity {
    AutoCompleteTextView actv;
    MultiAutoCompleteTextView mactv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__auto__complete__text);

        actv = findViewById(R.id.actv);
        mactv = findViewById(R.id.mactv);
        ArrayList al = new ArrayList();
        al.add("Python");
        al.add("PHP");
        al.add("PERL");
        al.add("Android");
        al.add("IOS");
        al.add("WEB");
        al.add("Java");
        al.add("Machine Learning");
        al.add("XML");
        al.add("HTML");
        al.add("React");
        al.add("Node JS");
        al.add("Mango DB");
        al.add("CSS");
        al.add("DBMS");
        ArrayAdapter aa = new ArrayAdapter(Activity_Auto_Complete_Text.this,android.R.layout.simple_list_item_1,al);

        actv.setThreshold(1);
        //Here "setThreshold(1)" is used so that after typing a letter it will start showing suggestions.
        // Other wise it will show suggestion after 2 words.
        actv.setAdapter(aa);


        ArrayAdapter aa2 = new ArrayAdapter(Activity_Auto_Complete_Text.this, android.R.layout.simple_list_item_1, al);
        mactv.setThreshold(1);
        mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        //Here we are taking "," as a separator , This is default separator
        mactv.setAdapter(aa2);
    }
}