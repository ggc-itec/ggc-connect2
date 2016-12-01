package edu.ggc.it.map;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.ggc.it.R;

/**
 * @author Andrew F. Lynch
 *         <p/>
 *         This class is intended to show the location of the device on GGC Campus.
 *         This class works by getting the GPS data then passing it to a {@link MapActivity}
 *         that has a background image and current location redDot icon the show where the
 *         phone is on campus.
 */

public class MapActivity extends Activity {
    public Activity backView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        //initialize buttons
        Button buildingA = (Button) findViewById(R.id.buildingA);
        buildingA.setOnClickListener(new ButtonListener());
        Button buildingB = (Button) findViewById(R.id.buildingB);
        buildingB.setOnClickListener(new ButtonListener());
        Button buildingC = (Button) findViewById(R.id.buildingC);
        buildingC.setOnClickListener(new ButtonListener());
        Button buildingD = (Button) findViewById(R.id.buildingD);
        buildingD.setOnClickListener(new ButtonListener());
        Button buildingE = (Button) findViewById(R.id.buildingE);
        buildingE.setOnClickListener(new ButtonListener());
        Button buildingF = (Button) findViewById(R.id.buildingF);
        buildingF.setOnClickListener(new ButtonListener());
        Button buildingH = (Button) findViewById(R.id.buildingH);
        buildingH.setOnClickListener(new ButtonListener());
        Button buildingI = (Button) findViewById(R.id.buildingI);
        buildingI.setOnClickListener(new ButtonListener());
        Button buildingL = (Button) findViewById(R.id.buildingL);
        buildingL.setOnClickListener(new ButtonListener());
        Button backButton = (Button) findViewById(R.id.back_button);
        backButton.setOnClickListener(new ButtonListener());
    }


    /**
     * Creates the listeners for all of the buttons individually
     */
    public class ButtonListener implements View.OnClickListener {
        public void onClick(View view) {
            if (view.getId() == R.id.buildingA) {
                String url = "https://drive.google.com/viewerng/viewer?embedded=true&url=http://www.ggc.edu/admissions/visit-ggc/maps-and-directions/docs/building-a.pdf";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            }
            else if (view.getId() == R.id.buildingB) {
                String url = "https://drive.google.com/viewerng/viewer?embedded=true&url=http://www.ggc.edu/admissions/visit-ggc/maps-and-directions/docs/building-b-map.pdf";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            } else if (view.getId() == R.id.buildingC) {
                String url = "https://drive.google.com/viewerng/viewer?embedded=true&url=http://www.ggc.edu/admissions/visit-ggc/maps-and-directions/docs/building-c-map.pdf";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            }
            else if (view.getId() == R.id.buildingD) {
                String url = "https://drive.google.com/viewerng/viewer?embedded=true&url=http://www.ggc.edu/admissions/visit-ggc/maps-and-directions/docs/building-d.pdf";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            } else if (view.getId() == R.id.buildingE) {
                String url = "https://drive.google.com/viewerng/viewer?embedded=true&url=http://www.ggc.edu/admissions/visit-ggc/maps-and-directions/docs/student-center-map.pdf";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            }
            else if (view.getId() == R.id.buildingF) {
                String url = "https://drive.google.com/viewerng/viewer?embedded=true&url=http://www.ggc.edu/admissions/visit-ggc/maps-and-directions/docs/building-f-map.pdf";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            } else if (view.getId() == R.id.buildingH) {
                String url = "https://drive.google.com/viewerng/viewer?embedded=true&url=http://www.ggc.edu/admissions/visit-ggc/maps-and-directions/docs/building-h-map.pdf";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            }
            else if (view.getId() == R.id.buildingI) {
                String url = "https://drive.google.com/viewerng/viewer?embedded=true&url=http://www.ggc.edu/admissions/visit-ggc/maps-and-directions/docs/building-i-map.pdf";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            } else if (view.getId() == R.id.buildingL) {
                String url = "https://drive.google.com/viewerng/viewer?embedded=true&url=http://www.ggc.edu/admissions/visit-ggc/maps-and-directions/docs/library-map.pdf";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            } else if (view.getId() == R.id.back_button) {
                finish();
            }
        }
    }
}