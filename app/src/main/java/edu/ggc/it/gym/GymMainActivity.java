package edu.ggc.it.gym;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import edu.ggc.it.R;

public class GymMainActivity extends Activity {


    /**
     * This method creates all of the buttons according to their names and
     * locations of the button
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_main);


        Button wellness = (Button) findViewById(R.id.wellness);
        wellness.setOnClickListener(new ButtonListener());
        Button schedule = (Button) findViewById(R.id.gymSchedule);
        schedule.setOnClickListener(new ButtonListener());
        Button magazine = (Button) findViewById(R.id.healthMagazine);
        magazine.setOnClickListener(new ButtonListener());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_gym_main, menu);
        return true;
    }

    /**
     * Creates the listeners for all of the buttons individually
     */
    public class ButtonListener implements OnClickListener {
        public void onClick(View view) {
            if (view.getId() == R.id.wellness) {
                String url = "http://www.ggc.edu/student-life/student-services/wellness-and-recreation/";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            }
            else if (view.getId() == R.id.gymSchedule) {
                String url = "http://www.ggc.edu/student-life/student-services/wellness-and-recreation/wellness-and-recreation-center/";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            } else if (view.getId() == R.id.healthMagazine) {
                String url = "http://readsh101.com/ggc.html";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            }
        }
    }
}