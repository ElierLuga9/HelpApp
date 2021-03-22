package com.example.familialugogalindo.helpapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    ImageButton btna,btnc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btna = (ImageButton) findViewById(R.id.imageButton3);
        btnc= (ImageButton) findViewById(R.id.imageButton2);

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();
                Intent btna = new Intent(MainActivity.this, Accidentes.class);
                startActivity(btna);


            }
        });
        //btnc.setOnClickListener(new View.OnClickListener() {
          //  @Override
          //      public void onClick(View v) {
//
  //              Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();
    //            Intent btnc = new Intent(MainActivity.this, Informacion.class);
      //          startActivity(btnc);

        //    }
        //});
    }
}
