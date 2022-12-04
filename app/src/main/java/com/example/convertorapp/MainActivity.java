package com.example.convertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton length,weight,speed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        length= findViewById(R.id.length);
        weight= findViewById(R.id.weight);
        speed= findViewById(R.id.speed);


        length.setOnClickListener(e->{
            Intent i = new Intent(this,LengthConversion.class);
            startActivity(i);
        });
        weight.setOnClickListener(e->{
            Intent i = new Intent(this,WeightConversion.class);
            startActivity(i);
        });
        speed.setOnClickListener(e->{
            Intent i = new Intent(this,SpeedConversion.class);
            startActivity(i);
        });


    }
}