package com.example.webuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Magasins_activity extends AppCompatActivity {

    private ArrayList<String> planetes;
    ListView listview;
    MagasinAdapter adapter;

    Button envoyer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magasins);
        listview = (ListView) findViewById(R.id.listView);
        adapter = new MagasinAdapter((LayoutInflater) Magasins_activity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE), Magasins_activity.this);
        listview.setAdapter(adapter);
        envoyer = (Button) findViewById(R.id.button2);
        envoyer.setOnClickListener(checkedListener);
    }

    private View.OnClickListener checkedListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(adapter.Verification()) {
                popUp("Ok");
            }
            else {
                popUp("Pas ok");
            }
        }
    };
    public void popUp(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
