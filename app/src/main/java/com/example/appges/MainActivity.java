package com.example.appges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        TextView miTexto = new TextView(this);
        miTexto.setText("Hola Alumnos!! Que tal estáis");
        setContentView(miTexto); //que vista visualizará la actividad
*/

        setContentView(R.layout.activity_main);
    }
}