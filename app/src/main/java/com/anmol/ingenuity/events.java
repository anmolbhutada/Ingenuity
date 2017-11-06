package com.anmol.ingenuity;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class events extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        viewPager =(ViewPager) findViewById(R.id.viewPager);


        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);
    }
}
