package com.example.aplikasi_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IbadahActivity extends AppCompatActivity {
ImageView pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibadah);

        pindah = (ImageView) findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(IbadahActivity.this,MainActivity.class);
                startActivity(Intenpindah);
            }
        });

        pindah = (ImageView) findViewById(R.id.sholat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(IbadahActivity.this,sholat_ibadah.class);
                startActivity(Intenpindah);
            }
        });

        pindah = (ImageView) findViewById(R.id.puasa);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(IbadahActivity.this,Puasa_Ibadah.class);
                startActivity(Intenpindah);
            }
        });

        pindah = (ImageView) findViewById(R.id.membacaquran);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(IbadahActivity.this,Bacaquran_ibadah.class);
                startActivity(Intenpindah);
            }
        });

        pindah = (ImageView) findViewById(R.id.sedekah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(IbadahActivity.this,Zakat_ibadah.class);
                startActivity(Intenpindah);
            }
        });



        pindah = (ImageView) findViewById(R.id.haji);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(IbadahActivity.this,Haji_ibadah.class);
                startActivity(Intenpindah);
            }
        });
    }
}
