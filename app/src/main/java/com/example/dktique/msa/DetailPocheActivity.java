package com.example.dktique.msa;

import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;

public class DetailPocheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_poche);
        Configuration config = getResources().getConfiguration();
        if ((config.orientation ==
                Configuration.ORIENTATION_LANDSCAPE)
                && (config.smallestScreenWidthDp >= 600)) {
            finish();
        } else {
            setContentView(R.layout.activity_detail_poche);
            Poche poche = (Poche) getIntent().getSerializableExtra("poche");
            DetailFragment detailFragment = new DetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("poche", poche);
            detailFragment.setArguments(bundle);
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.frameLayout, detailFragment);
            ft.commit();
        }
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


    }

}
