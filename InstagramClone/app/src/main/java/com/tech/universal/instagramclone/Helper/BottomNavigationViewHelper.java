package com.tech.universal.instagramclone.Helper;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.tech.universal.instagramclone.Likes.LikesActivity;
import com.tech.universal.instagramclone.Profile.ProfileActivity;
import com.tech.universal.instagramclone.Search.SearchActivity;
import com.tech.universal.instagramclone.Shares.SharesActivity;
import com.tech.universal.instagramclone.Home.HomeActivity;
import com.tech.universal.instagramclone.R;

/**
 * Created by asher.ansari on 7/14/2018.
 */

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHelper";

    public static void setupBottomNavView(BottomNavigationViewEx navigationViewEx) {
        navigationViewEx.enableAnimation(false);
        navigationViewEx.enableShiftingMode(false);
        navigationViewEx.enableItemShiftingMode(false);
        navigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx navigationViewEx) {
        navigationViewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_house:
                        Intent i1 = new Intent(context, HomeActivity.class);//ACTIVITY_NUM = 0
                        context.startActivity(i1);
                        break;
                    case R.id.ic_search:
                        Intent i2 = new Intent(context, SearchActivity.class);//ACTIVITY_NUM = 1
                        context.startActivity(i2);
                        break;
                    case R.id.ic_circe:
                        Intent i3 = new Intent(context, SharesActivity.class);//ACTIVITY_NUM = 2
                        context.startActivity(i3);
                        break;
                    case R.id.ic_alert:
                        Intent i4 = new Intent(context, LikesActivity.class);//ACTIVITY_NUM = 3
                        context.startActivity(i4);
                        break;
                    case R.id.ic_android:
                        Intent i5 = new Intent(context, ProfileActivity.class);//ACTIVITY_NUM = 4
                        context.startActivity(i5);
                        break;
                }
                return false;
            }
        });
    }
}
