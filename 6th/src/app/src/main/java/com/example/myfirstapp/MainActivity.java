package com.example.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    private long lastTimeBackPressed = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://kjmin622.github.io/");
        myWebView.getSettings().setUseWideViewPort(true);
        myWebView.getSettings().setLoadWithOverviewMode(true);
    }

    @Override
    public void onBackPressed() {
        if (myWebView.canGoBack()) myWebView.goBack();
        else{
            if(System.currentTimeMillis() - lastTimeBackPressed < 1500){
                finish();
                return;
            }
            this.lastTimeBackPressed = System.currentTimeMillis();
            Toast.makeText(this,"뒤로가기 버튼을 한 번 더 누르시면 종료됩니다.",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()) {
            case R.id.menu0:
                myWebView.loadUrl("https://kjmin622.github.io/");
                break;
            case R.id.menu1:
                myWebView.loadUrl("https://huskycat1202.github.io/intro.html");
                break;
            case R.id.menu2:
                myWebView.loadUrl("https://iopopoi.github.io/");
                break;
            case R.id.menu3:
                myWebView.loadUrl("https://lee-sungmin.github.io/");
                break;
        }

        return true;
    }
}
