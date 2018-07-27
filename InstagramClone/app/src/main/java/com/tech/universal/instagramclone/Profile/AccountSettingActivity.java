package com.tech.universal.instagramclone.Profile;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.tech.universal.instagramclone.Helper.BottomNavigationViewHelper;
import com.tech.universal.instagramclone.R;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 7/15/2018.
 */

public class AccountSettingActivity extends AppCompatActivity {

    private static final String TAG = "AccountSettingActivity";
    private static final int ACTIVITY_NUM = 4;
    private Context mContext;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actiivty_accountsettings);
        mContext = AccountSettingActivity.this;
        setupBottomNavigationView();
        setupSettingList();

        //setup the backarrow navigation to profile activity
        ImageView imageView = (ImageView) findViewById(R.id.backArrow);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setupSettingList() {
        ListView listView = (ListView) findViewById(R.id.lvAccountSettings);
        ArrayList<String> strings = new ArrayList<>();
        strings.add(getString(R.string.edit_profile));
        strings.add(getString(R.string.signout));
        ArrayAdapter arrayAdapter = new ArrayAdapter(mContext, android.R.layout.simple_list_item_1, strings);
        listView.setAdapter(arrayAdapter);
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
