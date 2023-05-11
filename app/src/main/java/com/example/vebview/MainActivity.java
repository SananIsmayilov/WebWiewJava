package com.example.vebview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
WebView webView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.veb);
        webView.getSettings().getJavaScriptEnabled();
        //enter link
        webView.loadUrl("xxxxxx");
    }
}