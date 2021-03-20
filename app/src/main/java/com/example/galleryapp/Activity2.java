package com.example.galleryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
int minteger;
Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

      /*  button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                increaseInteger(minteger);

            }*/
    }

    public void increaseInteger(View view) {
        minteger = minteger + 1;
        display(minteger);
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(R.id.CounterValue);
        displayInteger.setText(": " + number);
    }
}