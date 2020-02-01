package com.example.aplikasi_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class KeluarrumahActivity extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keluarrumah);

        pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("doa keluar rumah.pdf")
                .load();
    }
}
