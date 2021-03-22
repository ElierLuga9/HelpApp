package com.example.familialugogalindo.helpapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by Familia Lugo Galindo on 05/12/2018.
 */

public class Accidentes extends AppCompatActivity {

    String elemento[] = {"Seleccione Accidennte","Accidente Automovilistico","Riña","Tiroteo","Enfermo","Incendio"};

        Button btnc;
        Spinner sp;
        ImageView img;
        public boolean f = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accidentes);

        btnc = (Button)findViewById(R.id.button);
        sp =  (Spinner)findViewById(R.id.spinner);
        img = (ImageView)findViewById(R.id.imageView2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,elemento);
        sp.setAdapter(adapter);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (f) {
                    f = false;
                } else {
                    Toast.makeText(getApplicationContext(), elemento[position], Toast.LENGTH_LONG).show();
                    if(position==1)
                    {
                        img.setImageResource(R.drawable.choque);
                    }
                    if(position==2)
                    {
                        img.setImageResource(R.drawable.rina);
                    }
                    if(position==3)
                    {
                        img.setImageResource(R.drawable.tiroteo);
                    }
                    if(position==4)
                    {
                        img.setImageResource(R.drawable.enfermo);
                    }
                    if(position==5)
                    {
                        img.setImageResource(R.drawable.incendio);
                    }
            }}

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(sp.getSelectedItem().equals("Accidente Automovilistico"))
                {
                    Intent btna = new Intent(Accidentes.this, datosV.class);
                    startActivity(btna);
                }
                if(sp.getSelectedItem().equals("Riña"))
                {
                    Intent btna = new Intent(Accidentes.this, datosV.class);
                    startActivity(btna);
                }
                if(sp.getSelectedItem().equals("Tiroteo"))
                {
                    Intent btna = new Intent(Accidentes.this, datosV.class);
                    startActivity(btna);
                }
                if(sp.getSelectedItem().equals("Enfermo"))
                {
                    Intent btna = new Intent(Accidentes.this, datosV.class);
                    startActivity(btna);
                }
                if(sp.getSelectedItem().equals("Incendio"))
                {
                    Intent btna = new Intent(Accidentes.this, DatosIncendio.class);
                    startActivity(btna);
                }
            }
        });

    }
}
