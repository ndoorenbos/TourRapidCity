package com.example.android.tourrapidcity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

// Displays a {@link ViewPager} where each page shows a different aspect of Rapid City.
public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private String tabHome;
    private String tabPres;
    private String tabMSS;
    private String tabCP;
    private String tabTTD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the ViewPager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        // Get the Strings for the tab titles
        tabHome = getString(R.string.tab_home);
        tabPres = getString(R.string.tab_pres);
        tabMSS = getString(R.string.tab_mss);
        tabCP = getString(R.string.tab_cp);
        tabTTD = getString(R.string.tab_ttd);

        // Create a new String Array and populate it with the words for the tabs
        String[] mTabTitles = new String[] {tabHome, tabPres, tabMSS, tabCP, tabTTD};

        // Create an adapter that knows which fragment should be shown on each page and takes in
        // the tab titles String Array
        RapidCityFragmentPagerAdapter adapter =
                new RapidCityFragmentPagerAdapter(getSupportFragmentManager(), MainActivity.this,
                        mTabTitles);

        // Set the adapter onto the ViewPager
        viewPager.setAdapter(adapter);

        // Find the TabLayout that will show the user the categories
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);

        // Set up the TabLayout, give it the ViewPager
        tabLayout.setupWithViewPager(viewPager);

        // Set the text color for the Tabs
        tabLayout.setTabTextColors(Color.LTGRAY, Color.WHITE);
    }
}