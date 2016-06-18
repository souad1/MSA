package com.example.dktique.msa;

import android.app.Activity;
import android.content.Intent;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Splash   extends Activity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 4000;
    int progressStatus = 0;
    TextView tx;
    ProgressBar  progressBar;
    Handler handler = new Handler();

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash);

        //***************************
        new getProspect(this).execute();

        //***************************

         progressBar=(ProgressBar)findViewById(R.id.ProgressBar01);


        tx=(TextView)findViewById(R.id.txtrere);
       // textView2 = (TextView) findViewById(R.id.load_per);
        new Thread(new Runnable() {
            public void run() {
                while (progressStatus < 100)
                {
                    progressStatus += 5;
                    handler.post(new Runnable()
                    {
                        public void run()
                        {
                            progressBar.setProgress(progressStatus);
                            tx.setText(progressStatus + "%");
                        }
                    });
                    try
                    {
                        Thread.sleep(400);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                if (progressStatus==100)
                {
                    Intent i = new Intent(Splash.this, Authentification.class);
                    startActivity(i);
                    finish();
                }
            }
        }).start();
    }}