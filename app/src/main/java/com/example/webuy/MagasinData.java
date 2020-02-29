package com.example.webuy;

import java.util.ArrayList;

public class MagasinData {
    public ArrayList<String> magasins;
    String[] nombrePromo = {"9", "2", "6", "4"};

    private void MagasinData() {
        magasins = new ArrayList<String>();
        magasins.add("Carrefour");
        magasins.add("Auchan");
        magasins.add("Lidl");
        magasins.add("Leclerc");
    }
}
