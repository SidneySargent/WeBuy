package com.example.webuy;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Thread.sleep;

public class SplashScreen extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //try {
            //sleep(2000);
            startActivity(new Intent(this, Login_activity.class));
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
    }
}
