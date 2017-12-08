package com.example.android.tourrapidcity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// Created by ndoor on 10/2/2016.

// Provides the appropriate {@link Fragment} for a view pager.
final public class RapidCityFragmentPagerAdapter extends FragmentPagerAdapter {
    private int pageCount = 5;
    Context context;
    private String[] mTabTitles;

    public RapidCityFragmentPagerAdapter (FragmentManager mFragmentManager, Context context,
                                          String[] tabTitles){
        super(mFragmentManager);
        mTabTitles = tabTitles;
    }

    /**
     * @param position is the current page position
     * @return the Fragment at the given position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new RapidCityFragment();
            case 1:
                return new PresidentsFragment();
            case 2:
                return new MainStreetSquareFragment();
            case 3:
                return new CityParksFragment();
            default:
                return new ThingsToDoFragment();
       }
    }

    /** @return the number of pages */
    @Override
    public int getCount() {
        return pageCount;
    }

    /**
     * Generate the title based on the item position
     * @param position is the current page position
     * @return the page title as a string
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles[position];
    }
}