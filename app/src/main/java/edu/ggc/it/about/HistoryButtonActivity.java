package edu.ggc.it.about;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.ggc.it.R;

/**
 * Class: HistoryButtonActivity
 * <p/>
 * Provide some historical facts about GGC.
 */
public class HistoryButtonActivity extends Activity {
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // sets the content view to the history layout
        setContentView(R.layout.activity_ggc_history);

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
