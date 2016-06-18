package com.example.dktique.msa;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListePochesStomie extends AppCompatActivity {
    CustomAdapterListePoches customAdapterListePoches;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_poches_stomie);
          customAdapterListePoches= new CustomAdapterListePoches (this,getPocheList());
        ListView listView1 = (ListView) findViewById(R.id.listView);
        listView1.setAdapter(customAdapterListePoches);
        customAdapterListePoches.notifyDataSetChanged();



     /*   listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showView((Poche) customAdapterListePoches.getItem(position));
            }
        });
*/


    }


    public List<Poche> getPocheList() {

        List<Poche> listeoches = new ArrayList<Poche>();
        Poche poche1 =new Poche("Poche iléostomie monobloc ALTERNA 13870", "Poche iléostomie monobloc avec système de fermeture, ouverte, opaque, et maxi ", "--", "240,00 DZD", R.drawable.ic_13870, R.drawable.ic_13870);
        listeoches.add(poche1);

        Poche poche2 =new Poche("Poche iléostomie monobloc ALTERNA 5885", "Poche iléostomie monobloc, ouverte, maxi, opaque", "--", "240,00 DZD", R.drawable.ic_5885, R.drawable.ic_5885);
        listeoches.add(poche2);


        Poche poche3 =new Poche("Poche colostomie monobloc ALTERNA 5787", "Poche colostomie fermé monobloc", "--", "240,00 DZD", R.drawable.ic_71diqadxqxl, R.drawable.ic_71diqadxqxl);
        listeoches.add(poche3);

        Poche poche4 =new Poche("Poche urostomie COLOPLAST", "Poche urostomie COLOPLAST", "--", "290,00 DZD", R.drawable.ic_alterna_14226_1, R.drawable.ic_alterna_14226_1);
        listeoches.add(poche4);

        Poche poche5 =new Poche("Poche colostomie COLOPLAST", "Poche colostomie COLOPLAST", "40/60 mm", "190,00 DZD", R.drawable.ic_sans_titre_2_4, R.drawable.ic_sans_titre_2_4);
        listeoches.add(poche5);

        Poche poche6 =new Poche("Poche iléostomie avec système de fermeture COLOPLAST", "Poche iléostomie avec système de fermeture COLOPLAST", "60 mm", "190,00 DZD", R.drawable.ic_sans_titre_6, R.drawable.ic_sans_titre_6);
        listeoches.add(poche6);

        Poche poche7 =new Poche("Poche iléostomie sans système de fermeture COLOPLAST", "Poche iléostomie sans système de fermeture COLOPLAST", "40/50 mm", "190,00 DZD", R.drawable.ic_1_coloplast, R.drawable.ic_1_coloplast);
        listeoches.add(poche7);

        Poche poche8 =new Poche("Poche iléostomie CONVATEC ", "Poche iléostomie CONVATEC", "45/70 mm", "190,00 DZD", R.drawable.ic_natura, R.drawable.ic_natura);
        listeoches.add(poche8);


        Poche poche9 =new Poche("Poche urostomie CONVATEC ", "Poche urostomie CONVATEC", "45 mm", "190,00 DZD", R.drawable.ic_3cc5e5c4, R.drawable.ic_3cc5e5c4);
        listeoches.add(poche9);



        return  listeoches;
    }

    public boolean isTwoPane() {

        View v  = this.findViewById(R.id.frameLayout);
        return (v!=null);

    }

    public void showView (Poche produit) {
        if (isTwoPane()) {
            DetailFragment detailFragment = new DetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("produit", produit);
            detailFragment.setArguments(bundle);
            FragmentTransaction ft = this.getFragmentManager().beginTransaction();
            ft.replace(R.id.frameLayout, detailFragment);

            ft.commit();

        } else {
            Intent intent = new Intent(this, DetailPocheActivity.class);
            intent.putExtra("produit", produit);
            startActivity(intent);
        }

    }

}



