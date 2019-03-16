package com.nytimes.alex.mynews.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.nytimes.alex.mynews.Controllers.Fragments.BusinessFragment;
import com.nytimes.alex.mynews.Controllers.Fragments.MostPopularFragment;
import com.nytimes.alex.mynews.Controllers.Fragments.TopStoriesFragment;



public class PageAdapter extends FragmentPagerAdapter {

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: // Page number 1
                return TopStoriesFragment.newInstance();
            case 1: // Page number 2
                return MostPopularFragment.newInstance();
            case 2:
                return BusinessFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String page = new String();
        switch (position){
            case 0:
                page = "TOP STORIES";
                break;
            case 1:
                page = "MOST POPULAR";
                break;
            case 2:
                page = "BUSINESS";
                break;
            default:
                page = "COUCOU !";
                break;
        }
        return page;
    }
}
