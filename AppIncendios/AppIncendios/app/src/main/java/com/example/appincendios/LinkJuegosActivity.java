package com.example.appincendios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LinkJuegosActivity extends AppCompatActivity {
    Button primerJuego;
    Button segundoJuego;
    Button tercerJuego;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_juegos);
        primerJuego=findViewById(R.id.prjuego);
        segundoJuego=findViewById(R.id.sgjuego);
        tercerJuego= findViewById(R.id.trcjuego);
        primerJuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://wordwall.net/es-ar/community/prevenci%C3%B3n-de-incendios");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        segundoJuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://smokeybear.com/es/smokey-for-kids/design-a-coloring-book");
                Intent i = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
        tercerJuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.mak.org.mx/");
                Intent i = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
    }


}