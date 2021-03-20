package com.example.galleryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //assignment to the id
        textView = findViewById(R.id.textView3);

        //cardVieew Clickable

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intents: implicit intents, used localy with the app

                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
                finish();

            }
        });
}
}