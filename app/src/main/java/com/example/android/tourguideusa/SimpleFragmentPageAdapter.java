package com.example.android.tourguideusa;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Tudor on 21.03.2017.
 */

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {

    // Context of the app.
    private Context mContext;

    /**
     * Create a new SimpleFragmentPageAdapter object.
     *
     * @param context         is the name of the app.
     * @param fragmentManager it will keep each fragment's state in the adapter across swipes.
     */
    public SimpleFragmentPageAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }


    //Returning the Fragment that should be displayed for the given page number.
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new InnFragment();
        } else if (position == 1) {
            return new StadiumsFragment();
        } else if (position == 2) {
            return new MuseumsFragment();
        } else {
            return new MustVisitFragment();
        }
    }

    // Returning the total number of pages.
    @Override
    public int getCount() {
        return 4;
    }

    // Getting the String description for each activity.
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.inn);
        } else if (position == 1) {
            return mContext.getString(R.string.stadiums);
        } else if (position == 2) {
            return mContext.getString(R.string.museums);
        } else {
            return mContext.getString(R.string.must_see);
        }
    }
}
