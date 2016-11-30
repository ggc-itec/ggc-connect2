package edu.ggc.it.mainscreen;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import edu.ggc.it.R;
import edu.ggc.it.athletics.Athletics;
import edu.ggc.it.banner_web.BannerWebActivity;
import edu.ggc.it.d2l_web.D2LWebActivity;
import edu.ggc.it.social_media.Facebook;
import edu.ggc.it.social_media.Instagram;
import edu.ggc.it.social_media.Twitter;

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
 * Be sure to replace every occurrence of the old id in res/layout/main_screen_view_three
 * with the new id name you decide on.
 * <p/>
 * 3. Find the textview in res/layout/main_screen_view_three that belongs to your button
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
public class MainScreenViewThree extends RelativeLayout implements View.OnClickListener {
    private Context context;

    public MainScreenViewThree(Context context) {
        super(context);
        init(context);
    }

    public MainScreenViewThree(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        this.context = context;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.main_screen_view_three, this, true);

        Button buttonBannerWebLogin = getListenedButton(R.id.button_banner_web);
        Button buttonD2LWebLogin = getListenedButton(R.id.button_d2l_web);
        Button buttonFacebook = getListenedButton(R.id.facebook_button);
        Button buttonInstagram = getListenedButton(R.id.instagram_button);
        Button buttonTwitter = getListenedButton(R.id.twitter_button);
        Button buttonAthletics = getListenedButton(R.id.athletics_button);
    }

    private Button getListenedButton(final int resource) {
        Button temp = (Button) findViewById(resource);
        temp.setOnClickListener(this);
        return temp;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button_banner_web) {
            context.startActivity(new Intent(context, BannerWebActivity.class));
        } else if (view.getId() == R.id.button_d2l_web) {
            context.startActivity(new Intent(context, D2LWebActivity.class));
        } else if (view.getId() == R.id.facebook_button) {
            context.startActivity(new Intent(context, Facebook.class));
        } else if (view.getId() == R.id.instagram_button) {
            context.startActivity(new Intent(context, Instagram.class));
        } else if (view.getId() == R.id.twitter_button) {
            context.startActivity(new Intent(context, Twitter.class));
        } else if (view.getId() == R.id.athletics_button) {
            context.startActivity(new Intent(context, Athletics.class));
        }
    }
}
