package com.prabesh.bl;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomNavigationView = findViewById(R.id.bottomNavigationView);

        // set default
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.Frame_layout, new tab_home())
                .commit();


        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:

                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.Frame_layout, new tab_home())
                                .commit();

                        break;

                    case R.id.store:

                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.Frame_layout, new Tab_Store())
                                .commit();

                        break;

                    case R.id.setting:

                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.Frame_layout, new tab_setting())
                                .commit();
                }

                return true;
            }
        });


    }
}



