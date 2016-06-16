package com.example.dktique.msa;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListeProspect extends AppCompatActivity {

    static List<Prospect> listee = new ArrayList();

        ExpandableListAdapter listAdapter;
        ExpandableListView expListView;
        List<String> listDataHeader;
        HashMap<String, List<String>> listDataChild;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_prospect);
//******************************************************

       // getProspect p= new getProspect(this).execute();
       // getProspect p= new getProspect(this);

    new getProspect(this).execute();
        // p.execute();
        /*String test = null;

        getProspect  p = new getProspect(this);
        p.onPostExecute(test);*/







// get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });



        if (ListeProspect.listee.size()==0){Toast.makeText(this,"empty",Toast.LENGTH_SHORT).show();}

        else{Toast.makeText(this,"not empty",Toast.LENGTH_SHORT).show();
            for(int i=0;i<ListeProspect.listee.size();i++){

                Toast.makeText(this,ListeProspect. listee.get(i).getPrenom(), Toast.LENGTH_SHORT).show();
            }


        }
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Prospect 1");
        listDataHeader.add("Prospect 2");
        listDataHeader.add("Prospect 3");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("Age1");
        top250.add("Assuré1");
        top250.add("Type de stomie1");
        top250.add("Nombre de poche par jour");


        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("Age2");
        nowShowing.add("Assuré");
        nowShowing.add("Type de stomie");
        nowShowing.add("Nombre de poche par jour");


        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("Age");
        comingSoon.add("Assuré");
        comingSoon.add("Type de stomie");
        comingSoon.add("Nombre de poche par jour");


        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(2), top250); // Header, Child data
      //  listDataChild.put(listDataHeader.get(1), nowShowing);
       // listDataChild.put(listDataHeader.get(2), comingSoon);



    }
}