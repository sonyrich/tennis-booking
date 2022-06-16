package com.example.tennis_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class NavigatorActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    MapsFragment mapsFragment = new MapsFragment();
    NotificationFragment notificationFragment = new NotificationFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_bottom);

        bottomNavigationView  = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

        BadgeDrawable badgeDrawable = bottomNavigationView.getOrCreateBadge(R.id.ic_notifications);
        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(8);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container,homeFragment)
                                .commit();
                        return true;
                    case R.id.ic_map:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container, mapsFragment)
                                .commit();
                        return true;
                    case R.id.ic_notifications:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container,notificationFragment)
                                .commit();
                        return true;
                }
                return false;
            }
        });
    }
}