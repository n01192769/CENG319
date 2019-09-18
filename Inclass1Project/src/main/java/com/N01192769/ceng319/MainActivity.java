package com.N01192769.ceng319;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    public void stuff(){
        Toast.makeText(getApplicationContext(), "Hello, this is my first Android APP", Toast.LENGTH_LONG).show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch switch1 = findViewById(R.id.switch1);
        switch1.setOnClickListener ( new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                                stuff();
                                         }
                                      });


        //public void
//        switch1.setChecked(true);




        Button but = findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hello, this is my first Android APP", Toast.LENGTH_LONG).show();
            }
        });


        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Should not click", Toast.LENGTH_LONG).show();

            }
        });

    }}





