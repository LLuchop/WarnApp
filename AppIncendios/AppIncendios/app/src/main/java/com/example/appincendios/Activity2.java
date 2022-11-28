package com.example.appincendios;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    Button sig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        sig = (Button) findViewById(R.id.sigNin);

        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Activity2.this, juegosActivity.class);
                Bundle b = ActivityOptions.makeSceneTransitionAnimation(Activity2.this).toBundle();
                startActivity(i,b);
            }
        });
    }
}