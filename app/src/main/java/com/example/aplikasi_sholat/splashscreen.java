package com.example.aplikasi_sholat;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.WindowManager;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import androidx.appcompat.app.AppCompatActivity;


public class splashscreen extends AppCompatActivity {
    private static int SPLASH_TIME = 3000; //loading selama 3 detik
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    Intent i = new Intent(splashscreen.this, MainActivity.class);
                    startActivity(i);
                    //jeda selesai
                    this.finish();
                }else {
                    //Do any action here. Now we are moving to next page
                    Intent i = new Intent(splashscreen.this, RegisterActivity.class);
                    startActivity(i);
                    //jeda selesai
                    this.finish();
                }
            }

            private void finish(){

            }
        }, SPLASH_TIME);

    };
}


