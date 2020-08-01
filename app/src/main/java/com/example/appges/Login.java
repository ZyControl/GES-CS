package com.example.appges;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Login extends AppCompatActivity {
    RadioButton usuario,tecnico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario=(RadioButton) findViewById(R.id.usuario);
        tecnico=(RadioButton) findViewById(R.id.tecnico);


    }
    public void ejecutarLoginCliTec(View view){

        if(usuario.isChecked()){
            Intent i = new Intent(this,Cliente.class);
            startActivity(i);
        }

        if(tecnico.isChecked()){
            Intent i = new Intent(this,TecnicoDat.class);
            startActivity(i);
        }

    }
}