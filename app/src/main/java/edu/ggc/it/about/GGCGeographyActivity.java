package edu.ggc.it.about;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import edu.ggc.it.R;

/**
 * Class: GGCGeographyActivity
 * <p/>
 * Provides a link to GGC campus maps for the user.
 */
public class GGCGeographyActivity extends Activity {
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // sets the content view to the ggc geography layout
        setContentView(R.layout.activity_ggc_geography);

        //adds a link to the geographyLink TextView in activity_ggc_geography.xml layout
        TextView geogLink = (TextView) findViewById(R.id.geographyLink);
        geogLink.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "�	<a href='http://www.ggc.edu/admissions/visit-ggc/maps-and-directions/index.html'> Maps and Directions </a>";
        geogLink.setText(Html.fromHtml(text));
        geogLink.setClickable(true);

        backButton = (Button) findViewById(R.id.back_button);
        setButtonListeners();
    }

    public void setButtonListeners() {
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
