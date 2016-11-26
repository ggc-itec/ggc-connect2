package edu.ggc.it.gpacalc;

import android.app.Activity;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import edu.ggc.it.R;

/**
 * @author Jordan Smith
 * @author Kyle Dornblaser
 * @author Timothy McCravy
 *
 *         This activity gets the user's current GPA and total credit hours before the current semester.
 */
public class GPACalcActivity extends Activity {
    public static final String GGC_GPA_URL = "https://m.fit.edu/default/gpa_calculator";
    private WebView webView;


    /* (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView = (WebView) findViewById(R.id.calendar_webview);
        webView.getSettings().setSupportZoom(true);
        webView.setWebViewClient(new GPAWebViewClient());
        webView.loadUrl(GGC_GPA_URL);
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
    private class GPAWebViewClient extends WebViewClient {

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