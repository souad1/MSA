package com.example.dktique.msa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dktique.msa.MainActivity;
import com.example.dktique.msa.R;

public class Authentification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);
    }
    public void Connecter (View view){
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);

    }


    public void Annuler (View view){
        finish();

    }
}
