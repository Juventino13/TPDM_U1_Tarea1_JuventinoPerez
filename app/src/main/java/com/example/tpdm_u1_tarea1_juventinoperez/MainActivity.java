package com.example.tpdm_u1_tarea1_juventinoperez;


import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usuario,apellido,correo,num,contrasena;
    String mensaje ="";
    TextView registro;
    TextView texto;
    CheckBox seleccion;
    String mensajeCasilla="";
    Switch simpleSwitch1;
Spinner repo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario=findViewById(R.id.nombre);
        apellido=findViewById(R.id.apellido);
        correo=findViewById(R.id.correo);
        num=findViewById(R.id.num);
        contrasena=findViewById(R.id.contrasena);
        simpleSwitch1 = (Switch) findViewById(R.id.simpleSwitch1);
        registro=findViewById(R.id.registrotext);
        seleccion=findViewById(R.id.check);
        repo=findViewById(R.id.tipo);
    }
    public void validar (View datos){
        mensaje="REGISTRADO!";
        if(usuario.getText().toString().equals("") || contrasena.getText().toString().equals("")
         || correo.getText().toString().equals("") || num.getText().toString().equals("")){
            mensaje="Completa los campos faltantes";

        }

        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setTitle("¡Aviso!");
        alerta.setMessage(mensaje);
        alerta.setPositiveButton("Aceptar", null);
        alerta.show();


    }

    public void seleccion(View n ){
        String mensaje = "Usuario recordado "+seleccion.isChecked();
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }
    public void cambioHombre (View color){
        registro.setTextColor(Color.parseColor("#000000"));
        registro.setBackgroundColor(Color.parseColor("#FFD700"));
    }
    public void cambioMujer (View color){
        registro.setTextColor(Color.parseColor("#ffffff"));
        registro.setBackgroundColor(Color.parseColor("#000000"));
    }

    public void combo(View v){
        texto.setText("GITHUB: "+repo.getSelectedItem().toString());
    }
    public void toggle(View m) {
        String statusSwitch1;
        if (simpleSwitch1.isChecked())
            statusSwitch1 = simpleSwitch1.getTextOn().toString();
    }

    }