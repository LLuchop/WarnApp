package com.example.appincendios;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class juegosActivity extends AppCompatActivity {
    Button sig;
    Button sigsig;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos);
        sig = (Button) findViewById(R.id.vid);
        sigsig = (Button) findViewById(R.id.game);

        sigsig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(juegosActivity.this, LinkJuegosActivity.class);
                Bundle b = ActivityOptions.makeSceneTransitionAnimation(juegosActivity.this).toBundle();
                startActivity(i,b);
            }
        });

        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(juegosActivity.this, videosActivity.class);
                Bundle b = ActivityOptions.makeSceneTransitionAnimation(juegosActivity.this).toBundle();
                startActivity(i,b);
            }
        });
    }
}