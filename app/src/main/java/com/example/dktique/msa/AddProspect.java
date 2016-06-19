package com.example.dktique.msa;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by DKTIQUE on 19/05/2016.
 */
public class AddProspect extends AsyncTask<String,Void,String> {


    private Context context;

    public AddProspect(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... params) {
        String result="" ;

      //  Log.v("access 125","it'ssss  workingggg");
        try {
         // URL url = new URL("http://192.168.43.249:8080/addProspect");  // modifier l'adresse 10.0.2.163/Prospects/GET     ADD
          //  URL url = new URL("http://192.168.1.104:8080/Prospects/addProspect"); //mon pc with internet
          //  URL url = new URL ("http://192.168.1.103:8080/addProspect");
            URL url = new URL ("http://192.168.1.104:8080/Prospects/POST");
            // conecter avec internet ds le pc hadjer
            //acceder a l'adresse

          //  URL url = new URL("http://10.0.19.196:8080/Prospects/POST");
           // URL url = new URL("http://10.0.19.196:8080/Prospects/addProspect");
            //pc celia


          //  Log.v("access 125","workingggg");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(2000);
            OutputStream outputStream = conn.getOutputStream();
            outputStream.write(params[0].getBytes("UTF-8"));
            if (conn.getResponseCode() == 200) {
                InputStream is = conn.getInputStream();
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader( is, "UTF-8"));
                result = reader.readLine();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    protected void onPostExecute(String s) {
        // pd.dismiss();
        if(s.equals("1")) {
            Toast.makeText(context, "sucess", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(context, "error", Toast.LENGTH_SHORT).show();
        }
    }

}
