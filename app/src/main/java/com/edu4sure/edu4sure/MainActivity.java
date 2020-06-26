package com.edu4sure.edu4sure;

import android.os.Bundle;
import android.widget.TableLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG= "MainActivity tab fragment";
    private ViewPager mViewPager;
    protected static SectionsPageAdapter adapter;
    protected static TabLayout tab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager=(ViewPager)findViewById(R.id.view_pager);
        setUpViewPager(mViewPager);

         tab=(TabLayout)findViewById(R.id.tabs);
        tab.setupWithViewPager(mViewPager);
    }//onCreate ends

    public void setUpViewPager(ViewPager viewPager)
    {
         adapter=new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new DiscoverFragment(),"Discover",0);
        adapter.addFragment(new BlogFragment(),"Blog",1);

        viewPager.setOffscreenPageLimit(2);

        viewPager.setAdapter(adapter);
    }

   /* protected static void addTab()
    {

        adapter.add(new fragment4(),"TAB4",1);
        adapter.notifyDataSetChanged();

    }

    protected static void removeTab()
    {
        adapter.remove(1);
        adapter.notifyDataSetChanged();
    }*/
}//class ends