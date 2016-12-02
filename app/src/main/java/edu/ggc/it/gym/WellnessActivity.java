package edu.ggc.it.gym;

import android.app.Activity;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import edu.ggc.it.R;

/**
 * This class is an activity class
 *
 * @author
 */
public class WellnessActivity extends Activity {
    public static final String GGC_WELLNESS_URL = "http://www.ggc.edu/student-life/student-services/wellness-and-recreation/";
    private WebView webView;


    /* (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setSupportZoom(true);
        webView.setWebViewClient(new WellnessWebViewClient());
        webView.loadUrl(GGC_WELLNESS_URL);
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
    private class WellnessWebViewClient extends WebViewClient {

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