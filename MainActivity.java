package com.huntersassociation.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView web = new WebView(this);
        setContentView(web);
        WebSettings s = web.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setDatabaseEnabled(true);
        s.setAllowFileAccess(true);
        s.setBuiltInZoomControls(false);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("file:///android_asset/hunters_association_prototype.html");
    }

    @Override public void onBackPressed() {
        WebView web = (WebView)findViewById(android.R.id.content).findViewById(android.R.id.content);
        super.onBackPressed();
    }
}
