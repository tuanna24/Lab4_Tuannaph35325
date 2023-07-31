package com.example.lab4_ph35325;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.lab4_ph35325.Fragment.ViewPager2Fragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TabLayout tabLayout = findViewById(R.id.tabLayoutb3);
        ViewPager2 viewPager2 = findViewById(R.id.viewPager2);

        ViewPager2Fragment viewPager2Fragment = new ViewPager2Fragment(this);
        viewPager2.setAdapter(viewPager2Fragment);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText("Tab " +( position + 1));
            }
        }).attach();
    }
}