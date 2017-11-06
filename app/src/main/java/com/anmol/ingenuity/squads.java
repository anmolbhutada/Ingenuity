package com.anmol.ingenuity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class squads extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squads);


        Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScMnE-1Vq82igDOp3CcF3ysrosxHF9rHd-Ty3W_hwBaM8TcDg/viewform"));
        startActivity(facebookIntent);

        /*
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScMnE-1Vq82igDOp3CcF3ysrosxHF9rHd-Ty3W_hwBaM8TcDg/viewform");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        */
    }
}
