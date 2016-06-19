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


       Spinner spinner1 = (Spinner) findViewById(R.id.nbroperations1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.nombreOperation, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        Spinner spinner2 = (Spinner) findViewById(R.id.maladieschroniques1);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.maladieChronoque, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);



        Spinner spinner3 = (Spinner) findViewById(R.id.causestomie1);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.CauseStomie, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        Spinner spinner4 = (Spinner) findViewById(R.id.typestomie1);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.TypeStomie, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);


        Spinner spinner5 = (Spinner) findViewById(R.id.durabilitestomie1);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this, R.array.DurabilitéStomie, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);

        Spinner spinner6 = (Spinner) findViewById(R.id.nbrPoche1);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this, R.array.nbrPoche, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);



    }


    public void AddProspect (View view){

        EditText nom =(EditText)findViewById(R.id.Nom);
        EditText prenom =(EditText)findViewById(R.id.Prenom);
        EditText age =(EditText)findViewById(R.id.age);

       // Prospect prospect =new Prospect(title.getText().toString(),autor.getText().toString());


        Prospect prospect =new Prospect(nom.getText().toString(),prenom.getText().toString());
      //  Prospect prospect =new Prospect("1",nom.getText().toString(),prenom.getText().toString(),"14","01255","4");

      //  Log.v("String",prospect.getTitle());
      //  Log.v("String",prospect.getAuthor());


        Gson gson =new Gson();
        new AddProspect(this).execute(gson.toJson(prospect));

    }

    public void annuler (View view){
        Intent inte=new Intent(this,MainActivity.class);
        startActivity(inte);
    }



}
