package edu.ggc.it.department_numbers;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import edu.ggc.it.R;

public class DepartmentNumbersActivity extends Activity {
    public static final String GGC_DEPARTMENT_NUMBERS_URL = "http://www.ggc.edu/about-ggc/departments/";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setSupportZoom(true);
        webView.setWebViewClient(new LibraryWebViewClient());
        webView.loadUrl(GGC_DEPARTMENT_NUMBERS_URL);
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
    private class LibraryWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }

    }

}
