package com.example.webuy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Profil_activity extends AppCompatActivity {

    ImageView logo;

    ListView listviewAmis;

    int PhotosProfil[] = {R.drawable.barilla, R.drawable.lidl, R.drawable.tresor, R.drawable.auchan};

    String Pseudos[] = {"Sidney", "Adam", "JeanMich", "Rob"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        listviewAmis = findViewById(R.id.listviewAmis);

        MyAdapter adapter = new MyAdapter(this, Pseudos, PhotosProfil);
        listviewAmis.setAdapter(adapter);

/*
        listviewAmis.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(Profil_activity.this, AchatGroupe_activity.class);
                    startActivity(i);
                }
                if (position == 1) {

                }
                if (position == 2) {

                }
                if (position == 3) {

                }

            }
        });

 */


        logo = (ImageView)findViewById(R.id.logo);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Profil_activity.this, Accueil_activity.class);
                startActivity(i);
            }
        });

    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String Pseudo[];
        int PP[];

        MyAdapter (Context c, String pseudo[],int pp[]){
            super(c, R.layout.rowamis, R.id.PseudoAmi, pseudo);
            this.context = c;
            this.Pseudo = pseudo;
            this.PP = pp;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.rowamis, parent, false);
            ImageView pp = row.findViewById(R.id.ami);
            TextView pseudo = row.findViewById(R.id.PseudoAmi);

            pp.setImageResource(PP[position]);
            pseudo.setText(Pseudo[position]);

            return row;
        }
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
            return true;
        }
        else if(id == R.id.deconnexion) {
            Intent i = new Intent(Profil_activity.this, Login_activity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
