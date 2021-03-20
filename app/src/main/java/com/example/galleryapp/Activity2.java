package com.example.galleryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity  implements View.OnClickListener {
int minteger, counter;
Button button1;
    TextView displayInteger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        displayInteger = (TextView) findViewById(R.id.CounterValue);

        button1.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        boolean showText = false;
        switch(v.getId())
        {
            case R.id.button1: counter++; showText = true; break;
        }
        if(showText)
            displayInteger.setText("Result : "+ counter);
    }
    public void increaseInteger(View view) {
        minteger = minteger + 1;
       // display(minteger);
    }

    private void display(int number) {
        displayInteger.setText(": " + number);
    }
}