package com.example.dktique.msa;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.dktique.msa.R;
import com.google.gson.Gson;

public class AjouterProspect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_prospect);


      Spinner spinner = (Spinner) findViewById(R.id.assurance1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Assurance, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


    }


    public void AddProspect (View view){

        EditText nom =(EditText)findViewById(R.id.Nom);
        EditText prenom =(EditText)findViewById(R.id.Prenom);
        EditText age =(EditText)findViewById(R.id.age);

       // Prospect prospect =new Prospect(title.getText().toString(),autor.getText().toString());
        //Prospect prospect =new Prospect(nom.getText().toString(),prenom.getText().toString());

        Prospect prospect =new Prospect();
        prospect.setNom(nom.getText().toString());
        prospect.setPrenom(prenom.getText().toString());

     //   Prospect prospect =new Prospect("muName","testNae","1487",7);







        Gson gson =new Gson();
        new AddProspect(this).execute(gson.toJson(prospect));

    }

    public void annuler (View view){
        Intent inte=new Intent(this,MainActivity.class);
        startActivity(inte);
    }



}
