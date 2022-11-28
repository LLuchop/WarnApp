package com.example.appincendios;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Test extends AppCompatActivity implements View.OnClickListener{

    TextView TextoPreguntaView;
    TextView TotalPreguntasView;
    Button Boton1, Boton2, Boton3;
    Button Enviar;

    int Puntos = 0;
    int TotalPreguntas = PreguntasyRespuestas.Preguntas.length;
    int PreguntaActualIndex =0;
    String RespuestaElegida ="";
    int PreguntasRestantes = (TotalPreguntas - PreguntaActualIndex);

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TotalPreguntasView = findViewById(R.id.TextoPregunta);
        TextoPreguntaView = findViewById(R.id.CantPreguntas);
        Boton1 = findViewById(R.id.Boton_1);
        Boton2 = findViewById(R.id.Boton_2);
        Boton3 = findViewById(R.id.Boton_3);
        Enviar = findViewById(R.id.Enviar_bt);

        Boton1.setOnClickListener(this);
        Boton2.setOnClickListener(this);
        Boton3.setOnClickListener(this);
        Enviar.setOnClickListener(this);

        TextoPreguntaView.setText("Preguntas Restantes: "+ TotalPreguntas);

        CargarNuevaPregunta();
    }

    @Override
    public void onClick(View view) {

        Boton1.setBackgroundColor(Color.rgb(192,192,192));
        Boton2.setBackgroundColor(Color.rgb(192,192,192));
        Boton3.setBackgroundColor(Color.rgb(192,192,192));

        Button clickedButton = (Button) view;
        if (clickedButton.getId()==R.id.Enviar_bt){

            if(RespuestaElegida.equals(PreguntasyRespuestas.OpcionCorrecta[PreguntaActualIndex])){
                Puntos++;
            }
            PreguntaActualIndex++;
            CargarNuevaPregunta();

            PreguntasRestantes = (TotalPreguntas - PreguntaActualIndex);
            TextoPreguntaView.setText("Preguntas Restantes: "+ PreguntasRestantes);

        }else{
            RespuestaElegida = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.rgb(155,165,100));
        }
    }

    void CargarNuevaPregunta() {

        if(PreguntaActualIndex == TotalPreguntas) {
            TerminarChoise();
            return;
        }

        TotalPreguntasView.setText(PreguntasyRespuestas.Preguntas[PreguntaActualIndex]);
        Boton1.setText((PreguntasyRespuestas.Respuestas[PreguntaActualIndex][0]));
        Boton2.setText((PreguntasyRespuestas.Respuestas[PreguntaActualIndex][1]));
        Boton3.setText((PreguntasyRespuestas.Respuestas[PreguntaActualIndex][2]));

    }
    void TerminarChoise(){
        String PassStatus;
        if (Puntos == TotalPreguntas){
            PassStatus = "Aprobaste";
        }else{
            PassStatus = "Respuesta incorrecta";
        }

        new AlertDialog.Builder(this)
                .setTitle(PassStatus)
                .setMessage(Puntos + " de " + TotalPreguntas + " correctas")
                .setPositiveButton("Reintentar",(dialogInterface, i) -> restartchoise())
                .setCancelable(false)
                .show();
        Puntos = 0;
    }

    void restartchoise(){
        Puntos = 0;
        PreguntaActualIndex=0;
        CargarNuevaPregunta();
        TextoPreguntaView.setText("Preguntas Restantes: "+ TotalPreguntas);
    }
}
