package edu.ggc.it.banner_web;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import edu.ggc.it.R;

/*
 * Activity that logs in and displays Banner in a WebView
 * 
 */
public class BannerWebActivity extends Activity {
    public static final String GGC_BANNER_URL = "https://ggc.gabest.usg.edu/pls/B400/twbkwbis.P_WWWLogin";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setSupportZoom(true);
        webView.setWebViewClient(new BannerWebViewClient());
        webView.loadUrl(GGC_BANNER_URL);
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
            return;
        } else {
            super.onBackPressed();
        }
    }

    public void onBackClicked(View view) {
        if (webView.canGoBack()) {
            webView.goBack();
            return;
        } else {
            super.onBackPressed();
        }
    }

    /**
     * WebViewClient that ignores SSL errors (for some reason the GIL website returns an invalid certificate)
     */
    private class BannerWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }

    }

}