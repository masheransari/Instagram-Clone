package com.tech.universal.instagramclone.Helper;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by asher.ansari on 7/14/2018.
 */

public class BottomNavigationViewHelper {

    private static final String TAG ="BottomNavigationViewHelper";

    public static void setupBottomNavView(BottomNavigationViewEx navigationViewEx){
        navigationViewEx.enableAnimation(false);
        navigationViewEx.enableShiftingMode(false);
        navigationViewEx.enableItemShiftingMode(false);
        navigationViewEx.setTextVisibility(false);
    }
}
