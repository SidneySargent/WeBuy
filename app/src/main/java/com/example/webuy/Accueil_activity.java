package com.example.webuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Accueil_activity extends AppCompatActivity {

    Button magasinbtn;
    Button soumbtn;
    Button forumbtn;
    Button planbtn;
    Button promobtn;
    Button optionbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        //getActionBar().setDisplayHomeAsUpEnabled(true);

        magasinbtn = (Button)findViewById(R.id.magasinbtn);
        soumbtn = (Button)findViewById(R.id.soumbtn);
        forumbtn = (Button)findViewById(R.id.forumbtn);
        planbtn = (Button)findViewById(R.id.planbtn);
        promobtn = (Button)findViewById(R.id.promobtn);
        optionbtn = (Button)findViewById(R.id.optionbtn);


        magasinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Accueil_activity.this, Magasins_activity.class);
                startActivity(i);
            }
        });

        soumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Accueil_activity.this, Magasins_activity.class);
                startActivity(i);
                //overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        forumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Accueil_activity.this, Magasins_activity.class);
                startActivity(i);
            }
        });

        planbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Accueil_activity.this, Magasins_activity.class);
                startActivity(i);
            }
        });

        promobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Accueil_activity.this, Magasins_activity.class);
                startActivity(i);
            }
        });

        optionbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Accueil_activity.this, Magasins_activity.class);
                startActivity(i);
            }
        });
    }



}
