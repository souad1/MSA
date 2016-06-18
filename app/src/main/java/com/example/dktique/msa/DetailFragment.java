package com.example.dktique.msa;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by DKTIQUE on 17/06/2016.
 */
public class DetailFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.detail_fragment, null);
        Bundle bundle = getArguments();
        if (bundle != null) {
            Poche poche = (Poche) bundle.getSerializable("poche");
            ImageView coverImage = (ImageView) v.findViewById(R.id.coverImage);
            TextView nom = (TextView) v.findViewById(R.id.nom1);
            TextView marque = (TextView) v.findViewById(R.id.marque1);
            TextView taille = (TextView) v.findViewById(R.id.taille1);
            TextView prix = (TextView) v.findViewById(R.id.prix1);

            coverImage.setImageResource(poche.getCover());

            nom.setText("Nom : " + poche.getNom());

            prix.setText("Prix :" + poche.getPrix());
            taille.setText("Diamètre: " + poche.getDiametre());



        }
        return v;

    }

}
