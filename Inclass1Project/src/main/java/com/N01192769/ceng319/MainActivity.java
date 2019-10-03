package com.N01192769.ceng319;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.content.Intent;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
private void displayData(){
    setTheme(R.style.SplashScreenTheme);

}


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                displayData();
            }
        },8000);

        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Switch switch1 = findViewById(R.id.switch1);
        switch1.setOnClickListener ( new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             Toast.makeText(getApplicationContext(),
                                                     "Hello, this is my first Android APP",
                                                     Toast.LENGTH_LONG).show(); }});

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
                Toast.makeText(getApplicationContext(), "Should not click", Toast.LENGTH_LONG).show(); }
        });



    }}





