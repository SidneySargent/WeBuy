package com.example.webuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
        //getActionBar().setLogo(R.drawable.logo2);
        //getSupportActionBar().setLogo(R.drawable.logo2);

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
        if (id == R.id.action_settings) {
            Intent i = new Intent(Accueil_activity.this, Login_activity.class);
            startActivity(i);
            return true;
        } else if (id == R.id.logo) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
