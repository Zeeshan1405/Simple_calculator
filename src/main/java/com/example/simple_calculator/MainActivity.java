package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    Button b1,b2,b3,b4;
    TextView result1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=findViewById(R.id.numberone);
        n2=findViewById(R.id.numbertwo);

        b1=findViewById(R.id.addition);
        b2=findViewById(R.id.subtraction);
        b3=findViewById(R.id.divide);
        b4=findViewById(R.id.multiply);

        result1=findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=n1.getText().toString();
                Float num1=Float.parseFloat(s1);
                String s2=n2.getText().toString();
                Float num2=Float.parseFloat(s2);
                float r1=num1+num2;
                result1.setText(String.valueOf(r1));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=n1.getText().toString();
                Float num1=Float.parseFloat(s1);
                String s2=n2.getText().toString();
                Float num2=Float.parseFloat(s2);
                float r1=num1-num2;
                result1.setText(String.valueOf(r1));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=n1.getText().toString();
                Float num1=Float.parseFloat(s1);
                String s2=n2.getText().toString();
                Float num2=Float.parseFloat(s2);
                float r1=num1/num2;
                result1.setText(String.valueOf(r1));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=n1.getText().toString();
                Float num1=Float.parseFloat(s1);
                String s2=n2.getText().toString();
                Float num2=Float.parseFloat(s2);
                float r1=num1*num2;
                result1.setText(String.valueOf(r1));
            }
        });
    }
}