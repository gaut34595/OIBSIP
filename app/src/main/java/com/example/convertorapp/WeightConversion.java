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

public class WeightConversion extends AppCompatActivity {
    Spinner weightConversion;
    Spinner WeightConversionres;
    EditText value;
    Button convert;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_conversion);
        weightConversion= findViewById(R.id.weight);
        WeightConversionres= findViewById(R.id.weightcon);
        value= findViewById(R.id.value);
        convert= findViewById(R.id.convertBtn);
        output= findViewById(R.id.result);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(weightConversion.getSelectedItem().toString().equals("Select Measurement") && WeightConversionres.getSelectedItem().toString().equals("Select Measurement")){
                    Toast.makeText(WeightConversion.this, "Please Select a Measurement", Toast.LENGTH_SHORT).show();
                }
                else if(weightConversion.getSelectedItem().toString().equals("Select Measurement") && !value.getText().toString().isEmpty()){
                    Toast.makeText(WeightConversion.this, "Please select input measure", Toast.LENGTH_SHORT).show();
                }
                else if(WeightConversionres.getSelectedItem().toString().equals("Select Measurement") && !value.getText().toString().isEmpty()){
                    Toast.makeText(WeightConversion.this, "Please select output measure", Toast.LENGTH_SHORT).show();
                }
                
                else if(value.getText().toString().isEmpty()){
                    Toast.makeText(WeightConversion.this, "Please Enter the value", Toast.LENGTH_SHORT).show();
                }else {
                    Editable inputval = value.getText();
                    Double d = Double.valueOf(inputval.toString());
                    if(weightConversion.getSelectedItem().toString().equals("Grams") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Grams")){
                        output.setText(inputval + " grams");
                    }
                    if(weightConversion.getSelectedItem().toString().equals("Grams") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Kilograms")){
                        d= d/1000;
                        output.setText(String.valueOf(d) + " Kilograms");
                    }
                    if(weightConversion.getSelectedItem().toString().equals("Grams") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Ton")){
                        d= d/1000000;
                        Log.d(">>>>>>>>>>", String.valueOf(d));
                        output.setText(String.valueOf(d) + " Ton");
                    }
                    if(weightConversion.getSelectedItem().toString().equals("Grams") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Miligrams")){
                        d= d*1000;
                        Log.d(">>>>>>>>>>", String.valueOf(d));
                        output.setText(String.valueOf(d) + " Miligrams");
                    }

                    if(weightConversion.getSelectedItem().toString().equals("Kilograms") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Grams")){
                        d= d*1000;
                        Log.d(">>>>>>>>>>", String.valueOf(d));
                        output.setText(String.valueOf(d) + " Grams");
                    }
                    if(weightConversion.getSelectedItem().toString().equals("Kilograms") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Kilograms")){

                        output.setText(String.valueOf(d) + " Kilograms");
                    }
                    if(weightConversion.getSelectedItem().toString().equals("Kilograms") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Ton")){
                        d= d/1000;
                        output.setText(String.valueOf(d) + " Ton");
                    }
                    if(weightConversion.getSelectedItem().toString().equals("Kilograms") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Miligrams")){
                        d= d*1000000;
                        output.setText(String.valueOf(d) + " Miligrams");
                    }
                    if(weightConversion.getSelectedItem().toString().equals("Ton") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Grams")){
                        d*=1000000;
                        output.setText(String.valueOf(d) + " Grams");
                    }
                    if(weightConversion.getSelectedItem().toString().equals("Ton") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Kilograms")){
                        d=d*1000;
                        output.setText(String.valueOf(d) + " Kilograms");
                    }
                    if(weightConversion.getSelectedItem().toString().equals("Ton") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Ton")){

                        output.setText(String.valueOf(d) + " Ton");
                    }
                    if(weightConversion.getSelectedItem().toString().equals("Ton") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Miligrams")){
                        d*=1000000000;
                        output.setText(String.valueOf(d) + " Miligrams");
                    }
                    if(weightConversion.getSelectedItem().toString().equals("Miligrams") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Grams")){
                        d/=1000;
                        output.setText(String.valueOf(d) + " Grams");
                    }
                    if(weightConversion.getSelectedItem().toString().equals("Miligrams") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Kilograms")){
                        d/=1000000;
                        output.setText(String.valueOf(d) + " Kilograms");
                    }
                    if(weightConversion.getSelectedItem().toString().equals("Miligrams") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Ton")){
                        d/=1000000000;
                        output.setText(String.valueOf(d) + " Ton");
                    }
                    if(weightConversion.getSelectedItem().toString().equals("Miligrams") && !value.getText().toString().isEmpty() && WeightConversionres.getSelectedItem().toString().equals("Miligrams")){
                        output.setText(String.valueOf(d) + " Miligrams");
                    }
                }

            }
        });

    }
}