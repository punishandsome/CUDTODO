package com.panacotta.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.content.Intent;

public class SplashScreen extends AppCompatActivity {


    public SplashScreen(Context context) {
        this.context = context;
    }

    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
        context.startActivity(intent);
        finish();
    }
}
