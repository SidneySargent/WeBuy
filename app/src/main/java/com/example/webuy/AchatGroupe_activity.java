package com.example.webuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class AchatGroupe_activity extends AppCompatActivity {

    RelativeLayout premierArticle;

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achat_groupe);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        premierArticle = (RelativeLayout)findViewById(R.id.premierArticle);

        premierArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AchatGroupe_activity.this, AchatGroupeDetail.class);
                startActivity(i);
            }
        });


        logo = (ImageView)findViewById(R.id.logo);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AchatGroupe_activity.this, Accueil_activity.class);
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

        if (id == R.id.profil) {
            Intent i = new Intent(AchatGroupe_activity.this, Profil_activity.class);
            startActivity(i);
        }
        else if(id == R.id.deconnexion) {
            Intent i = new Intent(AchatGroupe_activity.this, Login_activity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

}
