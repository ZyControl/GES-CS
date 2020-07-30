package com.example.appges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Cliente extends AppCompatActivity {
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        spinner=(Spinner)findViewById(R.id.spinner);
        //opciones
        String[] opciones={"Seleccione Servicio"};
        //comunicación arreglo con el spinner
        ArrayAdapter <String> adapterServicio = new ArrayAdapter<>(this,R.layout.spinnercliente,opciones);
        spinner.setAdapter(adapterServicio);
    }
}