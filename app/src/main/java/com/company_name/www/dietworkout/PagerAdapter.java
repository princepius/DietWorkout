package com.company_name.www.dietworkout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by user on 4/24/2018.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private static final String[] PAGES = {"Diet", "Workouts"};
    private DietFragment dietFragment;
    private WorkoutsFragment workoutsFragment;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                if (dietFragment == null)
                    dietFragment = new DietFragment();

                return dietFragment;

            case 1:
                if (workoutsFragment == null)
                    workoutsFragment = new WorkoutsFragment();

                return workoutsFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGES.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return PAGES[position];
    }
}
