package com.example.aplikasi_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MasukrumahActivity extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masukrumah);

        pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("doa masuk rumah.pdf")
                .load();
    }
}
