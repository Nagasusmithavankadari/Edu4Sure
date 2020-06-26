package com.edu4sure.edu4sure;

import android.os.Bundle;
import android.widget.TableLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG= "MainActivity tab fragment";
    private SectionsPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager=(ViewPager)findViewById(R.id.view_pager);
        setUpViewPager(mViewPager);

        TabLayout tab=(TabLayout)findViewById(R.id.tabs);
        tab.setupWithViewPager(mViewPager);
    }//onCreate ends

    public void setUpViewPager(ViewPager viewPager)
    {
        SectionsPageAdapter adapter=new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new DiscoverFragment(),"Discover");
        adapter.addFragment(new BlogFragment(),"Blog");

        viewPager.setAdapter(adapter);
    }
}//class ends