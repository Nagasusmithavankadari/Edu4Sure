package com.edu4sure.edu4sure;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionsPageAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> mFragmentList=new ArrayList<>();
    private final List<String> mFragmentTitleList=new ArrayList<>();


    public SectionsPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }//constructor ends

    public void addFragment(Fragment fragment,String title)
    {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }//getPageTitle ends

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }//getItem ends

    @Override
    public int getCount() {
        return mFragmentList.size();
    }//getCount ends

    @Override
    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }//getItemPosition ends

}//class ends
