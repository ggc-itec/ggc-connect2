package edu.ggc.it.social_media;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import edu.ggc.it.R;

/**
 * Created by Ethan on 11/30/2016.
 */

public class Facebook extends Activity {
    public static final String GGC_FACEBOOK_URL = "https://m.facebook.com/georgiagwinnett/";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setSupportZoom(true);
        webView.setWebViewClient(new FacebookWebViewClient());
        webView.loadUrl(GGC_FACEBOOK_URL);
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
    private class FacebookWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }

    }

}