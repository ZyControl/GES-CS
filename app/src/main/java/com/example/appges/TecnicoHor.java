package com.example.appges;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TecnicoHor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tecnico_hor);
    }
    public void ejecutarTecnicoDat(View v){
        Intent i = new Intent(this,TecnicoDat.class);
        startActivity(i);
    }
    public void ejecutarTecnicoHor(View v){
        Intent i = new Intent(this,TecnicoHor.class);
        startActivity(i);
    }
    public void ejecutarTecnicoCont(View v){
        Intent i = new Intent(this,TecnicoCont.class);
        startActivity(i);
    }
}