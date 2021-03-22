package com.example.familialugogalindo.helpapp;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class IncendioForestal extends AppCompatActivity {

    Button btncomenzar,btnborde,btnfrente,btncola,btnflancos,btnfocos,btnlenguas,btnt;
    EditText txti;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incendio_forestal2);

        Intent intent = new Intent(this, IncendioForestal.class);

        txti = (EditText)findViewById(R.id.editText3);
        btncomenzar = (Button) findViewById(R.id.button25);
        btnborde = (Button) findViewById(R.id.button16);
        btnfrente = (Button) findViewById(R.id.button17);
        btncola = (Button) findViewById(R.id.button18);
        btnflancos = (Button)findViewById(R.id.button19);
        btnfocos = (Button)findViewById(R.id.button20);
        btnlenguas = (Button)findViewById(R.id.button24);
        btnt = (Button)findViewById(R.id.button26);

        btncomenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogC();
            }
        });

        btnborde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogBorde();
            }
        });

        btnfrente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogFrente();
            }
        });

        btncola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogCola();
            }
        });

        btnflancos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogFlancos();
            }
        });

        btnfocos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogFocos();
            }
        });

        btnlenguas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogLenguas();
            }
        });

        btnt.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Gracias!, Se ha enviado la informacion a las autoridades correspondientes", Toast.LENGTH_LONG).show();
            }
        });
    }

    public static String CheckAnswer(String string) {
        String Tincendios[] = {"palos", "borde", "frente", "cola", "flancos", "focos", "lengua"};
        String answer = null;
        for (int i = 0; i <= Tincendios.length - 1; i++) {
            if (string.equals(Tincendios[i])) {
                answer = "si";
                break;
            } else answer = "no";
        }
        return answer;
    }

    public  void openDialogC()
    {
        ExampleComenzarIF exampleDialog = new ExampleComenzarIF();
        exampleDialog.show(getSupportFragmentManager(), "Atencion!");
    }

    public void openDialogBorde(){

        ExampleBorde exampleDialog = new ExampleBorde();
        exampleDialog.show(getSupportFragmentManager(), "Borde!");
    }

    public void openDialogFrente(){

        ExampleFrente exampleDialog = new ExampleFrente();
        exampleDialog.show(getSupportFragmentManager(), "Frente!");
    }

    public void openDialogCola(){

        ExampleCola exampleDialog = new ExampleCola();
        exampleDialog.show(getSupportFragmentManager(), "Cola!");
    }
    public void openDialogFlancos(){

        ExampleFlancos exampleDialog = new ExampleFlancos();
        exampleDialog.show(getSupportFragmentManager(), "Flancos!");
    }
    public void openDialogFocos(){

        ExampleFocos exampleDialog = new ExampleFocos();
        exampleDialog.show(getSupportFragmentManager(), "Focos!");
    }
    public void openDialogLenguas(){

        ExampleLenguas exampleDialog = new ExampleLenguas();
        exampleDialog.show(getSupportFragmentManager(), "Lenguas!");
    }

}
