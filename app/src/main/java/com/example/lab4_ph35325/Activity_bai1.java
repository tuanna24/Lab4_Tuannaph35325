package com.example.lab4_ph35325;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.lab4_ph35325.Fragment.Fragment1;
import com.example.lab4_ph35325.Fragment.Fragment2;

public class Activity_bai1 extends AppCompatActivity {
    FrameLayout frameLayout;
    Button btnfragment1, btnfragment2;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);

        frameLayout = findViewById(R.id.fragmentConten);
        btnfragment1 = findViewById(R.id.btn_fragment1);
        btnfragment2 = findViewById(R.id.btn_fragment2);

        fragmentManager = getSupportFragmentManager();

        btnfragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment1 fragment1 = new Fragment1();
                fragmentManager.beginTransaction().replace(R.id.fragmentConten, fragment1).commit();
            }
        });

        btnfragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment2 fragment2 = new Fragment2();
                fragmentManager.beginTransaction().replace(R.id.fragmentConten, fragment2).commit();
            }
        });
    }
}