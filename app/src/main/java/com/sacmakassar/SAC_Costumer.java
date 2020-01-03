package com.sacmakassar;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewParent;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;

public class SAC_Costumer extends AppCompatActivity {
    private static final String TAG = "SAC_Costumer";
    private SectionsPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sac__costumer);

        Log.d(TAG, "onCreate : Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter (getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById (R.id.container);
        setupViewPager (mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById (R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
    private  void setupViewPager (ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter (getSupportFragmentManager());
        adapter.addFragment(new tab1_costumer(),"TAB1");
        adapter.addFragment(new tab2_costumer(), "TAB2");
        adapter.addFragment(new tab3_costumer(), "TAB3");
        adapter.addFragment(new tab4_costumer(), "TAB4");
        viewPager.setAdapter(adapter);
    }
}