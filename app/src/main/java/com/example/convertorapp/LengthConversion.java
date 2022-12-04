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

public class LengthConversion extends AppCompatActivity {

    Spinner lengthConversion;
    Spinner lengthConversionres;
    EditText value;
    Button convert;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_conversion);

        lengthConversion= findViewById(R.id.length);
        lengthConversionres= findViewById(R.id.lengthcon);
        value= findViewById(R.id.value);
        convert= findViewById(R.id.convertBtn);
        output= findViewById(R.id.result);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lengthConversion.getSelectedItem().toString().equals("Select Measurement") && lengthConversionres.getSelectedItem().toString().equals("Select Measurement")){
                    Toast.makeText(LengthConversion.this, "Please Select a Measurement", Toast.LENGTH_SHORT).show();
                }
                else if(lengthConversion.getSelectedItem().toString().equals("Select Measurement") && !value.getText().toString().isEmpty()){
                    Toast.makeText(LengthConversion.this, "Please select input measure", Toast.LENGTH_SHORT).show();
                }
                else if(lengthConversionres.getSelectedItem().toString().equals("Select Measurement") && !value.getText().toString().isEmpty()){
                    Toast.makeText(LengthConversion.this, "Please select output measure", Toast.LENGTH_SHORT).show();
                }

                else if(value.getText().toString().isEmpty()){
                    Toast.makeText(LengthConversion.this, "Please Enter the value", Toast.LENGTH_SHORT).show();
                }else {
                    Editable inputval = value.getText();
                    Double d = Double.valueOf(inputval.toString());
                        if(lengthConversion.getSelectedItem().toString().equals("Meter") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Meter")){
                        output.setText(inputval + " Meter");
                    }
                    if(lengthConversion.getSelectedItem().toString().equals("Meter") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Centimeter")){
                        d= d*100;
                        output.setText(String.valueOf(d) + " Centimeter");
                    }
                    if(lengthConversion.getSelectedItem().toString().equals("Meter") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Kilometer")){
                        d= d/1000;
                        output.setText(String.valueOf(d) + " Kilometer");
                    }
                    if(lengthConversion.getSelectedItem().toString().equals("Meter") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Milimeter")){
                        d= d*1000;
                        output.setText(String.valueOf(d) + " Milimeter");
                    }

                    if(lengthConversion.getSelectedItem().toString().equals("Centimeter") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Meter")){
                        d= d/100;
                        output.setText(String.valueOf(d) + " Meters");
                    }
                    if(lengthConversion.getSelectedItem().toString().equals("Centimeter") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Kilometer")){
                        d= d/100000;
                        output.setText(String.valueOf(d) + " Kilometer");
                    }
                    if(lengthConversion.getSelectedItem().toString().equals("Centimeter") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Milimeter")){
                        d*= 10;
                        output.setText(String.valueOf(d) + " Milimeter");
                    }
                    if(lengthConversion.getSelectedItem().toString().equals("Centimeter") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Centimeter")){
                        output.setText(String.valueOf(d) + " Centimeter");
                    }

                    if(lengthConversion.getSelectedItem().toString().equals("Kilometer") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Meter")){
                        d= d*1000;
                        output.setText(String.valueOf(d) + " Meter");
                    }
                    if(lengthConversion.getSelectedItem().toString().equals("Kilometer") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Centimeter")){
                        d*=100000;
                        output.setText(String.valueOf(d) + " Centimeter");
                    }
                    if(lengthConversion.getSelectedItem().toString().equals("Kilometer") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Kilometer")){
                        d=d*1000;
                        output.setText(String.valueOf(d) + " Kilometer");
                    }
                    if(lengthConversion.getSelectedItem().toString().equals("Kilometer") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Milimeter")){
                        d= d*1000000;
                        output.setText(String.valueOf(d) + " Milimeter");
                    }
                    if(lengthConversion.getSelectedItem().toString().equals("Milimeter") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Meter")){
                        d/=1000;
                        output.setText(String.valueOf(d) + " Meter");
                    }
                    if(lengthConversion.getSelectedItem().toString().equals("Milimeter") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Centimeter")){
                        d/=10;
                        output.setText(String.valueOf(d) + " Centimeter");
                    }
                    if(lengthConversion.getSelectedItem().toString().equals("Milimeter") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Kilometer")){
                        d/=1000000;
                        output.setText(String.valueOf(d) + " Kilometer");
                    }
                    if(lengthConversion.getSelectedItem().toString().equals("Milimeter") && !value.getText().toString().isEmpty() && lengthConversionres.getSelectedItem().toString().equals("Milimeter")){
                        output.setText(String.valueOf(d) + " Milimeter");
                    }
                }
            }
        });
    }
}