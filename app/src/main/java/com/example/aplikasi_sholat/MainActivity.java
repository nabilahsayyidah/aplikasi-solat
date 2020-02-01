package com.example.aplikasi_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pindah = (ImageView) findViewById(R.id.aboutus);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(MainActivity.this,AboutusActivity.class);
                startActivity(Intenpindah);
            }
        });
        pindah = (ImageView) findViewById(R.id.kiblat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(MainActivity.this,KiblatActivity.class);
                startActivity(Intenpindah);
            }
        });

        pindah = (ImageView) findViewById(R.id.jadwalsholat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(MainActivity.this,JadwalSholat.class);
                startActivity(Intenpindah);
            }
        });

        pindah = (ImageView) findViewById(R.id.ibadah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(MainActivity.this,IbadahActivity.class);
                startActivity(Intenpindah);
            }
        });

        pindah = (ImageView) findViewById(R.id.doaharian);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(MainActivity.this,DoaharianActivity.class);
                startActivity(Intenpindah);
            }
        });

        pindah = (ImageView) findViewById(R.id.hitungzakat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(MainActivity.this,HitungzakatActivity.class);
                startActivity(Intenpindah);
            }
        });

        pindah = (ImageView) findViewById(R.id.kajianislami);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(MainActivity.this,KajianislamiActivity.class);
                startActivity(Intenpindah);
            }
        });

        pindah = (ImageView) findViewById(R.id.mengaji);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(MainActivity.this,MengajiActivity.class);
                startActivity(Intenpindah);
            }
        });

        pindah = (ImageView) findViewById(R.id.profile);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(Intenpindah);
            }
        });

    }
}
