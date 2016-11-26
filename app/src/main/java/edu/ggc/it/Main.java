package edu.ggc.it;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/*
 * ggc-connect is an app designed for the GGC community
 * @author ggc-itec
 *
 */
public class Main extends Activity {
    public Context myContext;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myContext = this;
    }

    /**
     * Called when user presses Menu key
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main, menu);
        return true;
    }


    /**
     * Called when an option from the menu is selected.
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.welcome:
                new AlertDialog.Builder(this)
                        .setTitle("Welcome")
                        .setMessage(
                                "GGC Link is an app for the Georgia Gwinnett College community")
                        .setNeutralButton("Close",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int which) {

                                    }
                                }).show();
                return true;
            case R.id.credits:
                startActivity(new Intent(Main.this, Credits.class));
                return true;
            case R.id.links:
                startActivity(new Intent(Main.this, News.class));
                return true;
            case R.id.feedback:
                String feedbackURL = "https://docs.google.com/forms/d/1_6-2W088X8q2RNziskqiGIRYGelE-d0YvLYpd7hcNI0/viewform";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(feedbackURL)));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}