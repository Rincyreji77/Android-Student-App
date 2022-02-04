package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        web=(WebView)findViewById(R.id.myweb);
        web.loadUrl("https://www.mzce.ac.in/");
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());

    }
}