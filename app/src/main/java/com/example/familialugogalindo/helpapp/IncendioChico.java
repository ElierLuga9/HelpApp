package com.example.familialugogalindo.helpapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IncendioChico extends AppCompatActivity {

    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incendio_chico);

        btn1 = (Button) findViewById(R.id.button21);
        btn2 = (Button) findViewById(R.id.button22);
        btn3 = (Button) findViewById(R.id.button23);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog2();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog3();
            }
        });


    }

    public void openDialog(){

        ExamplePaso1 examplePaso1 = new ExamplePaso1();
        examplePaso1.show(getSupportFragmentManager(), "Paso 1");
    }

    public void openDialog2(){

        ExamplePaso2 examplePaso2 = new ExamplePaso2();
        examplePaso2.show(getSupportFragmentManager(), "Paso 2");

    }

    public void openDialog3(){

        ExamplePaso3 examplePaso3 = new ExamplePaso3();
        examplePaso3.show(getSupportFragmentManager(), "Paso 3");
    }
}
