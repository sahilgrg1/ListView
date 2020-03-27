package com.example.listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {
    private WebView webe;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (webe.canGoBack())
        {
            webe.goBack();
        }
        else
        {
            super.onBackPressed();
        }

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
        webe = findViewById(R.id.web);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        if(url != null)
        {
            webe.setWebViewClient(new WebViewClient());
            webe.loadUrl(url);
            webe.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        }
        WebSettings webSettings = webe.getSettings();
        webSettings.getJavaScriptEnabled();
        webSettings.getLoadsImagesAutomatically();


    }
}
