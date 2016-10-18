package edu.ggc.it.catalog;

import android.app.Activity;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import edu.ggc.it.R;

public class ClassSearchActivity extends Activity {
    public static final String GGC_GIL_LIBRARY_URL = "http://www.ggc.edu/about-ggc/departments/";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        webView = (WebView) findViewById(R.id.calendar_webview);
        webView.getSettings().setSupportZoom(true);
        webView.setWebViewClient(new LibraryWebViewClient());
        webView.loadUrl(GGC_GIL_LIBRARY_URL);
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

    /**
     * WebViewClient that ignores SSL errors (for some reason the GIL website returns an invalid certificate)
     */
    private class LibraryWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }

        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed();
        }
    }

}
