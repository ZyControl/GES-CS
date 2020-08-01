package com.example.appges;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    public void onclick(View view){
        if(view.getId()==R.id.login){
            ejecutarLogin(view);
        }


    }
    public void ejecutarLogin(View view){
        Intent i = new Intent(this,Login.class);
        startActivity(i);
    }
}