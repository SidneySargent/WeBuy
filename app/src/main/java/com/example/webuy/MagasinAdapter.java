package com.example.webuy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MagasinAdapter extends BaseAdapter {
    private ArrayList<String> magasins;
    private LayoutInflater MainActivity;
    public Context mContext;
    public MagasinData data;

    public MagasinAdapter(ArrayList<String> planetes) {
        this.magasins =planetes;
    }

    public MagasinAdapter(LayoutInflater MainActivity, Context Mcontext) {
        this.MainActivity = MainActivity;
        this.mContext = mContext;
        data = new MagasinData();
        magasins =data.magasins;
    }

    @Override
    public int getCount() {
        return magasins.size();
    }

    @Override
    public Object getItem(int arg0) {
        return magasins.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)   mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = inflater.inflate(R.layout.listmag, null);
        }

        TextView nomPlanete = (TextView) itemView.findViewById(R.id.textView);

        nomPlanete.setText(magasins.get(position));


        return itemView;
    }

}
