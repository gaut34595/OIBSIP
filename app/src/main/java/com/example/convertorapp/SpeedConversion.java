package com.example.convertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpeedConversion extends AppCompatActivity {
    Spinner speedConversion;
    Spinner speedConversionres;
    EditText value;
    Button convert;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_conversion);
        speedConversion= findViewById(R.id.speed);
        speedConversionres = findViewById(R.id.speedcon);
        value= findViewById(R.id.value);
        convert= findViewById(R.id.convertBtn);
        output= findViewById(R.id.result);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(speedConversion.getSelectedItem().toString().equals("Select Measurement") && speedConversionres.getSelectedItem().toString().equals("Select Measurement")){
                    Toast.makeText(SpeedConversion.this, "Please Select a Measurement", Toast.LENGTH_SHORT).show();
                }
                else if(speedConversion.getSelectedItem().toString().equals("Select Measurement") && !value.getText().toString().isEmpty()){
                    Toast.makeText(SpeedConversion.this, "Please select input measure", Toast.LENGTH_SHORT).show();
                }
                else if(speedConversion.getSelectedItem().toString().equals("Select Measurement") && !value.getText().toString().isEmpty()){
                    Toast.makeText(SpeedConversion.this, "Please select output measure", Toast.LENGTH_SHORT).show();
                }

                else if(value.getText().toString().isEmpty()){
                    Toast.makeText(SpeedConversion.this, "Please Enter the value", Toast.LENGTH_SHORT).show();
                }else{
                    Editable inputval = value.getText();
                    Double d = Double.valueOf(inputval.toString());

                    if(speedConversion.getSelectedItem().toString().equals("Km/h") && !value.getText().toString().isEmpty() && speedConversionres.getSelectedItem().toString().equals("m/sec")){
                        d= d/3.6;
                        output.setText(String.valueOf(d) + " m/sec");
                    }
                    if(speedConversion.getSelectedItem().toString().equals("Km/h") && !value.getText().toString().isEmpty() && speedConversionres.getSelectedItem().toString().equals("Km/h")){
                        output.setText(String.valueOf(d) + " Km/h");
                    }
                    if(speedConversion.getSelectedItem().toString().equals("m/sec") && !value.getText().toString().isEmpty() && speedConversionres.getSelectedItem().toString().equals("Km/h")){
                        d= d*3.6;
                        output.setText(String.valueOf(d) + " Km/h");
                    }
                    if(speedConversion.getSelectedItem().toString().equals("m/sec") && !value.getText().toString().isEmpty() && speedConversionres.getSelectedItem().toString().equals("m/sec")){
                        output.setText(String.valueOf(d) + " m/sec");
                    }

                }
            }
        });
    }
}