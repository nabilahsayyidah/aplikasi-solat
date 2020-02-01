package com.example.aplikasi_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MengajiActivity extends AppCompatActivity {
ImageView pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengaji);

        pindah = (ImageView) findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intenpindah = new Intent(MengajiActivity.this,MainActivity.class);
                startActivity(Intenpindah);
            }
        });
    }
}
