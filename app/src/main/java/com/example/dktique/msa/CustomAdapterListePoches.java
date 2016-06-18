package com.example.dktique.msa;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DKTIQUE on 03/05/2016.
 */
public class CustomAdapterListePoches extends BaseAdapter  {

    private Context context;
    private List<Poche> ListePoches;

    public CustomAdapterListePoches(Context context, List<Poche> ListePoches) {
        this.context = context;
        this.ListePoches = ListePoches;
    }

    @Override
    public int getCount() {
        return ListePoches.size();
    }

    @Override
    public Object getItem(int position) {return ListePoches.get(position);}

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // mettre le layout une seule fois lorsque convertView est null
        if (convertView == null) {convertView = parent.inflate(context, R.layout.list_items, null);}

        TextView nom = (TextView) convertView.findViewById(R.id.nom);
        TextView description = (TextView) convertView.findViewById(R.id.description);
        TextView diametre= (TextView) convertView.findViewById(R.id.diametre);
        TextView prix= (TextView) convertView.findViewById(R.id.prix);

        nom.setText(ListePoches.get(position).getNom());
        description.setText("Description : "+ListePoches.get(position).getDescription());
        diametre.setText("Diamètre : "+ListePoches.get(position).getDiametre());
        prix.setText(ListePoches.get(position).getPrix());

        ImageView poche= (ImageView)convertView.findViewById(R.id.coverIcon);
        poche.setImageResource(ListePoches.get(position).getCover());

        return convertView;
    }
}

