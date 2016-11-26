package edu.ggc.it.mainscreen;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import edu.ggc.it.R;
import edu.ggc.it.about.AboutMainActivity;
import edu.ggc.it.calendar.CalendarActivity;
import edu.ggc.it.degrees.DegreesMainActivity;
import edu.ggc.it.campushours.CampusHoursActivity;
import edu.ggc.it.gpacalc.GPACalcActivity;
import edu.ggc.it.library.LibraryActivity;

/**
 * INSTRUCTIONS FOR ADDING YOUR FEATURE TO THE MAIN SCREEN
 * <p/>
 * 1. Find the button assigned to you and substitute it with an extremely descriptive name.
 * <p/>
 * The name of the button should describe the activity it is launching.
 * Be sure to substitute the name everywhere your assigned button occurs.
 * <p/>
 * 2. Find the dummy button id that identifies your button and substitute it with a new
 * extremely descriptive id for your button.
 * <p/>
 * Be sure to replace every occurrence of the old id in res/layout/main_screen_view_two
 * with the new id name you decide on.
 * <p/>
 * 3. Find the textview in res/layout/main_screen_view_two that belongs to your button
 * and set the android property ' android:text="Your Feature Name" ' to your feature name.
 * <p/>
 * BE AWARE: The margin will get out of sink depending on the length of your text.
 * You can adjust the margin by adjusting the android property
 * ' android:layout_marginLeft="10dp" '
 * <p/>
 * 4. Find the if block in the onClick(View view) method that is contingent upon your id and
 * substitute 'YourActivity.class' with your activity, and remove the '//' so the new Intent
 * line is not commented out.
 * <p/>
 * REFERENCE: MainScreenViewOne can serve as an example of what the class will look like when
 * complete.
 * <p/>
 * Created by gregwesterfield on 10/13/13.
 */
public class MainScreenViewTwo extends RelativeLayout implements View.OnClickListener {
    private Context context;

    public MainScreenViewTwo(Context context) {
        super(context);
        init(context);
    }

    public MainScreenViewTwo(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        this.context = context;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.main_screen_view_two, this, true);

        Button aboutGGCButton = getListenedButton(R.id.view_two_about_ggc_btn);
        Button departmentButton = getListenedButton(R.id.view_two_department_hours_btn);
        Button gpaCalcButton = getListenedButton(R.id.gpa_calc_button);
        Button calendarButton = getListenedButton(R.id.calendar_btn);
        Button degreesButton = getListenedButton(R.id.degrees_button);
        Button libraryButton = getListenedButton(R.id.library_button);
    }

    private Button getListenedButton(final int resource) {
        Button temp = (Button) findViewById(resource);
        temp.setOnClickListener(this);
        return temp;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.view_two_about_ggc_btn) {
            context.startActivity(new Intent(context, AboutMainActivity.class));
        } else if (view.getId() == R.id.view_two_department_hours_btn) {
            context.startActivity(new Intent(context, CampusHoursActivity.class));
        } else if (view.getId() == R.id.gpa_calc_button) {
            context.startActivity(new Intent(context, GPACalcActivity.class));
        } else if (view.getId() == R.id.calendar_btn) {
            context.startActivity(new Intent(context, CalendarActivity.class));
        } else if (view.getId() == R.id.degrees_button) {
            context.startActivity(new Intent(context, DegreesMainActivity.class));
        } else if (view.getId() == R.id.library_button) {
            context.startActivity(new Intent(context, LibraryActivity.class));
        }
    }
}
