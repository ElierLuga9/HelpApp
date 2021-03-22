package com.example.familialugogalindo.helpapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class explicarT extends AppCompatActivity {

    Button respirar1,respirar2,tp,pu,pop,llc,fin,llc2,ordenes,ordenes2;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicar_t);

        respirar1 = (Button) findViewById(R.id.button3);
        respirar2 = (Button) findViewById(R.id.button4);
        fin = (Button) findViewById(R.id.btnfin);
        pu = (Button) findViewById(R.id.button5);
        pop = (Button)findViewById(R.id.button6);
        tp = (Button)findViewById(R.id.button7);
        llc = (Button)findViewById(R.id.button8);
        llc2 = (Button)findViewById(R.id.button9);
        ordenes = (Button)findViewById(R.id.button10);
        ordenes2 = (Button)findViewById(R.id.button11);
        txt = (TextView)findViewById(R.id.textView13);

        respirar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }


        });

        respirar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog2();
            }


        });

        tp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog3();
            }

        });

        pu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog4();
            }

        });

        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog5();
            }

        });

        llc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog4();
            }

        });

        llc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog6();
            }

        });

        ordenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog4();
                txt.setText("La evaluacion final del paciete resulta en un estado de atencion inmediata," +
                        " favor de avisar al cuerpo medico de respuesta rapido inmediatamente en su llegada");

            }
        });

        ordenes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("La evaluacion final del paciete resulta en un estado de atencion mediata, " +
                        "favor de avisar al cuerpo medico de respuesta rapido inmediatamente en su llegada");
            }
        });
    }
            public void openDialog(){
            ExampleDialog exampleDialog = new ExampleDialog();
            exampleDialog.show(getSupportFragmentManager(), "Fallecido");
    }

            public void openDialog2(){
                ExampleVivo exampleVivo = new ExampleVivo();
                exampleVivo.show(getSupportFragmentManager(), "Vivo");
            }

            public void openDialog3(){
                ExamplePulso examplePulso = new ExamplePulso();
                examplePulso.show(getSupportFragmentManager(), "Tomar pulso caritodio");
            }

            public void openDialog4(){
                ExamplePrioridadUno examplePrioridadUno = new ExamplePrioridadUno();
                examplePrioridadUno.show(getSupportFragmentManager(),"Prioridad Uno");
            }

            public void openDialog5(){
                ExampleLlenadoCap exampleLlenadoCap = new ExampleLlenadoCap();
                exampleLlenadoCap.show(getSupportFragmentManager(),"Perfusion o pulso");
            }

            public void openDialog6(){
                ExampleOrdenes exampleOrdenes = new ExampleOrdenes();
                exampleOrdenes.show(getSupportFragmentManager(),"Ordenes sencillas");
            }
    }

