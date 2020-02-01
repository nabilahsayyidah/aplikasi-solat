package com.example.aplikasi_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DoaharianActivity extends AppCompatActivity {
ImageView pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doaharian);

        pindah = (ImageView) findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(DoaharianActivity.this, MainActivity.class);
                startActivity(Intenpindah);
            }

            });

        pindah = (ImageView) findViewById(R.id.bangun);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(DoaharianActivity.this, BanguntidurActivity.class);
                startActivity(Intenpindah);
            }

        });

        pindah = (ImageView) findViewById(R.id.sebelumtidur);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(DoaharianActivity.this, SebelumtidurActivity.class);
                startActivity(Intenpindah);
            }

        });

        pindah = (ImageView) findViewById(R.id.bercermin);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(DoaharianActivity.this, BercerminActivity.class);
                startActivity(Intenpindah);
            }

        });

        pindah = (ImageView) findViewById(R.id.sebelummakan);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(DoaharianActivity.this, SebelummakanActivity.class);
                startActivity(Intenpindah);
            }

        });

        pindah = (ImageView) findViewById(R.id.sesudahmakan);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(DoaharianActivity.this, SesudahmakanActivity.class);
                startActivity(Intenpindah);
            }

        });

        pindah = (ImageView) findViewById(R.id.keluarrumah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(DoaharianActivity.this, KeluarrumahActivity.class);
                startActivity(Intenpindah);
            }

        });

        pindah = (ImageView) findViewById(R.id.masukrumah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(DoaharianActivity.this, MasukrumahActivity.class);
                startActivity(Intenpindah);
            }

        });
        }}