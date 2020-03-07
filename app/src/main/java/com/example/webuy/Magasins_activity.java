package com.example.webuy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Magasins_activity extends AppCompatActivity {

    ListView listview;

    String mag[] = {"Carrefour", "Lidl", "Leclerc", "Auchan"};

    String ad[] = {"12 allée des pruniers 37000 TOURS", "16 rue des érables 37000 Tours", "16 rue" +
            " des érables 37000 Tours", "16 rue des érables 37000 Tours"};

    String nbPromo[] = {"12 promotions", "1 promotion", "5 promotions", "4 promotions"};

    int images[] = {R.drawable.carrefour, R.drawable.lidl, R.drawable.leclerc, R.drawable.auchan};

    //ConstraintLayout caConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magasins);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listview = findViewById(R.id.listview);

        MyAdapter adapter = new MyAdapter(this, mag, ad, nbPromo, images);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(Magasins_activity.this, AchatGroupeDetail.class);
                    startActivity(i);
                }
                if (position == 1) {

                }
            }
        });

        //caConstraintLayout = (ConstraintLayout) findViewById(R.id.clCarrefour);

        //caConstraintLayout.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        Intent i = new Intent(Magasins_activity.this, AchatGroupeDetail.class);
        //        startActivity(i);
        //    }
        //});

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String mag[];
        String ad[];
        String nbPromo[];
        int image[];

        MyAdapter (Context c, String magasin[], String adresse[], String nbPromotions[],int images[]){
            super(c, R.layout.rowmag, R.id.magasin, magasin);
            this.context = c;
            this.mag = magasin;
            this.ad = adresse;
            this.nbPromo = nbPromotions;
            this.image = images;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.rowmag, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView magasins = row.findViewById(R.id.magasin);
            TextView adresses = row.findViewById(R.id.adresse);
            TextView nbpromotions = row.findViewById(R.id.nbpromotions);


            images.setImageResource(image[position]);
            magasins.setText(mag[position]);
            adresses.setText(ad[position]);
            nbpromotions.setText(nbPromo[position]);


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
        if (id == R.id.logo) {
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
