package com.example.appincendios;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Adultos1 extends AppCompatActivity {
    Button primeros;
    Button test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adultos1);

        primeros = (Button) findViewById(R.id.prAux);
        test = (Button) findViewById(R.id.test);
        primeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Adultos1.this, PrimerosAuxilios.class);
                Bundle b = ActivityOptions.makeSceneTransitionAnimation(Adultos1.this).toBundle();
                startActivity(i,b);
            }
        });
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Adultos1.this, Test.class);
                Bundle b = ActivityOptions.makeSceneTransitionAnimation(Adultos1.this).toBundle();
                startActivity(i,b);
            }
        });


    }
}