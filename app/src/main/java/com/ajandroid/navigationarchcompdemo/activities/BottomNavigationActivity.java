package com.ajandroid.navigationarchcompdemo.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.ajandroid.navigationarchcompdemo.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        NavHost navHost = (NavHost) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);

        if (navHost != null) {
            NavController navController = navHost.getNavController();
            BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
            NavigationUI.setupWithNavController(bottomNavigationView, navController);
        }
    }
}