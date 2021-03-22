package com.example.familialugogalindo.helpapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class DatosIncendio extends AppCompatActivity {

    String elemento[] = {"Seleccione tipo de incendio","Incendio pequeño","Incendio residencial","Incendio forestal"};

    Button btnc;
    Spinner sp;
    ImageView img;
    public boolean f = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_incendio);


        btnc = (Button)findViewById(R.id.btnc);
        sp =  (Spinner)findViewById(R.id.sp);
        img = (ImageView)findViewById(R.id.img);

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
                    if (position == 1) {
                        img.setImageResource(R.drawable.incendiopeq);
                    }
                    if (position == 2) {
                        img.setImageResource(R.drawable.incendiocasa);
                    }
                    if (position == 3) {
                        img.setImageResource(R.drawable.incendiofores);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sp.getSelectedItem().equals("Incendio pequeño"))
                {
                    Intent btna = new Intent(DatosIncendio.this, IncendioChico.class);
                    startActivity(btna);
                }
                if(sp.getSelectedItem().equals("Incendio residencial"))
                {
                    Intent btna = new Intent(DatosIncendio.this, IncendioChico.class);
                    startActivity(btna);
                }
                if(sp.getSelectedItem().equals("Tiroteo"))
                {
                    Intent btna = new Intent(DatosIncendio.this, datosV.class);
                    startActivity(btna);
                }
                if(sp.getSelectedItem().equals("Incendio forestal"))
                {
                    Intent btna = new Intent(DatosIncendio.this, IncendioForestal.class);
                    startActivity(btna);
                }
            }
        });
    }
}
