package com.example.claseabril5;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    FrameLayout frmHome;

    BottomNavigationView btmNav;

    ImageViewFragment imageViewFragment = new ImageViewFragment();
    SpinnerFragment spinnerFragment = new SpinnerFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(imageViewFragment);

        frmHome = findViewById(R.id.frmHome);
        btmNav = findViewById(R.id.btmNav);

        btmNav.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.navHome) {
                loadFragment(imageViewFragment);
                return true;
            } else if (item.getItemId() == R.id.navChats) {
                loadFragment(spinnerFragment);
                return true;
            }

            return false;
        });
    }

    public void loadFragment(Fragment fr) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frmHome, fr);
        transaction.commit();
    }
}