package com.example.familialugogalindo.helpapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Informacion extends AppCompatActivity {

    Button btnc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        btnc = (Button)findViewById(R.id.button2);

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnc = new Intent(Informacion.this, explicarT.class);
                startActivity(btnc);
            }
        });
    }
}
