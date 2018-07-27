package com.tech.universal.instagramclone.Profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.tech.universal.instagramclone.Helper.BottomNavigationViewHelper;
import com.tech.universal.instagramclone.R;

/**
 * Created by asher.ansari on 7/14/2018.
 */

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "ProfileActivity";
    private static final int ACTIVITY_NUM = 4;
    private Context mContext = ProfileActivity.this;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        progressBar = (ProgressBar) findViewById(R.id.profileProgresBar);
        progressBar.setVisibility(View.GONE);
        setupBottomNavigationView();
        setUpToolbar();
    }

    private void setUpToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.profileToolbar);
        setSupportActionBar(toolbar);
        ImageView ivSetting = (ImageView) toolbar.findViewById(R.id.profileMenu);
        ivSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, AccountSettingActivity.class);
                startActivity(i);
            }
        });

    }

    /**
     * Bottom Naviation View Config Method
     */
    private void setupBottomNavigationView() {
        BottomNavigationViewEx navigationViewEx = (BottomNavigationViewEx) findViewById(R.id.botttomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavView(navigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, navigationViewEx);
        Menu menu = navigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);

    }

}
