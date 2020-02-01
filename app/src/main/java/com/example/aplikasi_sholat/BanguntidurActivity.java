package com.example.aplikasi_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;

public class BanguntidurActivity extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banguntidur);

        pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("doa bangun tidur.pdf")
                .load();
    }
}
