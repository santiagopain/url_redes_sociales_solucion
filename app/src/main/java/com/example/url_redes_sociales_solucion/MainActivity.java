package com.example.url_redes_sociales_solucion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    Button google, what, insta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        google = findViewById(R.id.google);


        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink("https://www.facebook.com");
            }
        });






        what = findViewById(R.id.wat);


        what.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink("https://www.whatsapp.com/?lang=es");
            }
        });




        insta = findViewById(R.id.insta);


        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink("https://www.instagram.com/");
            }
        });




    }

    private void golink(String s) {

        Uri uri = Uri.parse(s);

        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}