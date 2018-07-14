package com.tech.universal.instagramclone.Likes;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.tech.universal.instagramclone.Helper.BottomNavigationViewHelper;
import com.tech.universal.instagramclone.R;

/**
 * Created by asher.ansari on 7/14/2018.
 */

public class LikesActivity extends AppCompatActivity{
    private static final String TAG = "LikesActivity";
    private static final int ACTIVITY_NUM = 3;
    private Context mContext = LikesActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupBottomNavigationView();
    }

    /**
     * Bottom Naviation View Config Method
     */
    private void setupBottomNavigationView() {
        BottomNavigationViewEx navigationViewEx=(BottomNavigationViewEx) findViewById(R.id.botttomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavView(navigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, navigationViewEx);
        Menu menu = navigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }

}
