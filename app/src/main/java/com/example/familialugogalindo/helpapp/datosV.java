package com.example.familialugogalindo.helpapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class datosV extends AppCompatActivity {

    Button btnc;
    TextView her,esc;
    RadioButton t,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_v);

        btnc = (Button) findViewById(R.id.button2);
        her = (TextView) findViewById(R.id.textView2);
        esc = (TextView) findViewById(R.id.textView3);
        t = (RadioButton) findViewById(R.id.radioButton4);
        p = (RadioButton) findViewById(R.id.radioButton3);


        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (t.isChecked()) {
                    Intent btnc = new Intent(datosV.this, Informacion.class);
                    startActivity(btnc);
                }
                if (p.isChecked()) {
                    Intent btnc = new Intent(datosV.this, Participante.class);
                    startActivity(btnc);
                }
            }

        });}
    }

