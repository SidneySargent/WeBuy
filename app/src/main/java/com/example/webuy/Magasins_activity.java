package com.example.webuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Magasins_activity extends AppCompatActivity {

    ListView listview;
    MagasinAdapter adapter;

    Button envoyer = null;

    ConstraintLayout caConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magasins);

        caConstraintLayout = (ConstraintLayout) findViewById(R.id.clCarrefour);

        caConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Magasins_activity.this, AchatGroupeDetail.class);
                startActivity(i);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //listview = (ListView) findViewById(R.id.listView);
        //adapter = new MagasinAdapter((LayoutInflater) Magasins_activity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE), Magasins_activity.this);
        //listview.setAdapter(adapter);
        //envoyer = (Button) findViewById(R.id.soumbtn);
        //envoyer.setOnClickListener(checkedListener);
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
            Intent i = new Intent(Magasins_activity.this, Login_activity.class);
            startActivity(i);
            return true;
        } else if (id == R.id.logo) {
            Intent i = new Intent(Magasins_activity.this, Accueil_activity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


/*
    private View.OnClickListener checkedListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //if(adapter.Verification()) {
                popUp("Ok");
            //}
            //else {
                popUp("Pas ok");
            //}
        }
    };
    public void popUp(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
 */
}
