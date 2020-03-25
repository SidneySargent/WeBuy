package com.example.webuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import androidx.appcompat.widget.Toolbar;


public class Accueil_activity extends AppCompatActivity {

    Button magasinbtn;
    Button soumbtn;
    Button planbtn;
    Button optionbtn;

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);


        magasinbtn = (Button)findViewById(R.id.magasinbtn);
        soumbtn = (Button)findViewById(R.id.soumbtn);
        planbtn = (Button)findViewById(R.id.planbtn);
        optionbtn = (Button)findViewById(R.id.optionbtn);

        logo = (ImageView)findViewById(R.id.logo);

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

        planbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Accueil_activity.this, BonPlans_activity.class);
                startActivity(i);
            }
        });

        optionbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Accueil_activity.this, Options_activity.class);
                startActivity(i);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.profil) {
            Intent i = new Intent(Accueil_activity.this, Profil_activity.class);
            startActivity(i);
        }
        else if(id == R.id.deconnexion) {
            Intent i = new Intent(Accueil_activity.this, Login_activity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

}
