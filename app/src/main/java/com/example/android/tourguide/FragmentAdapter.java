package com.example.android.tourguide;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        }
         else if (position == 1){
            return new MonumentsFragment();
        }
//         else if (position == 2) {
//            return new WednesdayFragment();
//        } else if (position == 3) {
//            return new ThursdayFragment();
//        } else {
//            return new FridayFragment();
//        }
//        return new RestaurantsFragment();
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
