package com.example.aplikasi_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class KiblatActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiblat);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://qiblafinder.withgoogle.com/intl/en/desktop/finder");
    }
}
