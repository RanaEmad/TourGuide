package com.example.android.tourguide;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    private Context cont;
    public FragmentAdapter(Context cont,FragmentManager fm){
        super(fm);
        this.cont=cont;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        }
         else if (position == 1){
            return new MonumentsFragment();
        }
         else if (position == 2) {
            return new ParksFragment();
        }
        else if (position == 3) {
            return new ShopsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = cont.getString(R.string.tab1) ;
        }
        else if (position == 1)
        {
            title = cont.getString(R.string.tab2) ;
        }
        else if (position == 2)
        {
            title = cont.getString(R.string.tab3) ;
        }
        else if (position == 3)
        {
            title = cont.getString(R.string.tab4) ;
        }
        return title;
    }
}
