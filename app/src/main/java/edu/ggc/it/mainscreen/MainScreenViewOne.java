package edu.ggc.it.mainscreen;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import edu.ggc.it.R;
import edu.ggc.it.admissions.AdmissionsActivity;
import edu.ggc.it.department_numbers.DepartmentNumbersActivity;
import edu.ggc.it.directory.DirectoryActivity;
import edu.ggc.it.gym.GymMainActivity;
import edu.ggc.it.map.MapActivity;
import edu.ggc.it.schedule.ScheduleActivity;

/**
 * Created by gregwesterfield on 10/13/13.
 */

public class MainScreenViewOne extends RelativeLayout implements View.OnClickListener {
    private Context context;

    public MainScreenViewOne(Context context) {
        super(context);
        init(context);
    }

    public MainScreenViewOne(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        this.context = context;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.main_screen_view_one, this, true);

        Button directoryButton = getListenedButton(R.id.directory_button);
        Button directionButton = getListenedButton(R.id.admissions_button);
        Button mapButton = getListenedButton(R.id.map_button);
        Button gymButton = getListenedButton(R.id.gym_button);
        Button scheduleButton = getListenedButton(R.id.schedule_button);
        Button departmentNumberButton = getListenedButton(R.id.department_button);
    }

    private Button getListenedButton(final int resource) {
        Button temp = (Button) findViewById(resource);
        temp.setOnClickListener(this);
        return temp;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.directory_button) {
            context.startActivity(new Intent(context, DirectoryActivity.class));
        } else if (view.getId() == R.id.map_button) {
            context.startActivity(new Intent(context, MapActivity.class));
        } else if (view.getId() == R.id.admissions_button) {
            context.startActivity(new Intent(context, AdmissionsActivity.class));
        } else if (view.getId() == R.id.gym_button) {
            context.startActivity(new Intent(context, GymMainActivity.class));
        } else if (view.getId() == R.id.schedule_button) {
            context.startActivity(new Intent(context, ScheduleActivity.class));
        } else if (view.getId() == R.id.department_button) {
            context.startActivity(new Intent(context, DepartmentNumbersActivity.class));
        }
    }
}

