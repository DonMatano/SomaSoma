package com.matano.somasoma.Model;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.matano.somasoma.View.UnitFragment;

/**
 * Created by matano on 28/11/16.
 */

public class Pager extends FragmentPagerAdapter
{
    //integer to count number of tabs
    int tabCount;

    //Constructor to the class

    public Pager(FragmentManager fm, int tabCount)
    {
        super(fm);
        //Initializing tab count
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position)
    {
        //Return the current tabs
        switch (position)
        {
            case 0:
                UnitFragment unitFragment = UnitFragment.newInstance();
                return unitFragment;

            default:
                return null;

        }
    }

    @Override
    public int getCount()
    {
        return tabCount;
    }
}
