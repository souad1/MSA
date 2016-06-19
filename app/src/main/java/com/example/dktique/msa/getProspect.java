package com.example.dktique.msa;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DKTIQUE on 19/05/2016.
 */
public class getProspect extends AsyncTask<Void,Void,String> {
    private Context context;
    List<Prospect> liste;
    public List<Prospect> getListe() {
        return liste;
    }
    public getProspect(Context context) {
        this.context = context;
    }



    @Override
    protected String doInBackground(Void... params) {

        String data;
        StringBuilder result= new StringBuilder();

        try {
            URL url = new URL ("http://192.168.1.104:8080/Prospects/GET");
            //URL url = new URL ("http://192.168.43.249:8080/Prospects/GET");//mon telephone reseau
           // URL url = new URL ("http://192.168.1.103:8080/getProspect"); //mon pc internet home
          //  URL url = new URL ("http://10.0.19.196:8080/getProspect");
              //URL url = new URL ("http://192.168.1.104:8080/getProspect");
           // URL url = new URL ("http:// 10.0.19.196:8080/Prospects/GET");


            HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            InputStream is = httpURLConnection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            while ((data = reader.readLine()) != null) {
                result.append(data);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
      // Log.v("resut", result.toString());
        return result.toString();
    }

    @Override
    protected void onPostExecute(String s) {//afficher le resultat
                liste = new ArrayList<>();

        try {
            JSONArray jsonArray = new JSONArray(s);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Prospect prospect= new Prospect();
               /* prospect.setNum_tel_tuteur(jsonObject.get("num_tel_tuteur").toString());
                prospect.setAdresse_mail(jsonObject.get("adresse_mail").toString());
                //date
                */
                prospect.setNom(jsonObject.get("nom").toString());
                prospect.setPrenom(jsonObject.get("prenom").toString());

                prospect.setNumpoche(Integer.parseInt(jsonObject.get("numpoche").toString()));

             //   prospect.setAdresse(jsonObject.get("adresse").toString());
               // prospect.setTuteur(jsonObject.get("tuteur").toString());
              //  prospect.setType_assurance(jsonObject.get("type_assurance").toString());
                //num poche




               ListeProspect.listee.add(prospect);
               // liste.add(prospect);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


}

