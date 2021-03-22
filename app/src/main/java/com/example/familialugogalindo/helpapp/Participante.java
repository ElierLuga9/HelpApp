package com.example.familialugogalindo.helpapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Participante extends AppCompatActivity {


    Button btns, sigue, salir,c;
    RadioButton s, n;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participante);

        openDialog3();

        c = (Button) findViewById(R.id.button12);
        salir = (Button) findViewById(R.id.button13);
        sigue = (Button) findViewById(R.id.button14);
        btns = (Button) findViewById(R.id.button15);
        s = (RadioButton) findViewById(R.id.radioButton5);
        n = (RadioButton) findViewById(R.id.radioButton6);

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s.isChecked()) {
                    openDialog();
                    Intent btnc = new Intent(Participante.this, Accidentes.class);
                    startActivity(btnc);
                }
                if (n.isChecked()) {

                    Intent btnc = new Intent(Participante.this, Informacion.class);
                    startActivity(btnc);
                }
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog2();
            }
        });
    }

    public void openDialog() {
        ExampleAuxilio exampleAuxilio = new ExampleAuxilio();
        exampleAuxilio.show(getSupportFragmentManager(), "Grave");
    }

    public void openDialog2(){
        ExamplePulso examplePulso = new ExamplePulso();
        examplePulso.show(getSupportFragmentManager(), "Pulso");
    }

    public void openDialog3(){
        ExampleParticipante exampleParticipante = new ExampleParticipante();
        exampleParticipante.show(getSupportFragmentManager(), "Participante");
    }
}
