package com.example.submision2.adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.submision2.R;
import com.example.submision2.fragment.MovieFragment;
import com.example.submision2.fragment.TvShowFragment;

public class SectionPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public SectionPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new MovieFragment();
                break;
            case 1:
                fragment = new TvShowFragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @StringRes
    private final int[] tab_titles = new int[]{
            R.string.tittle_tab1,
            R.string.tittle_tab2
    };

    @Nullable
    public CharSequence getPageTitle(int position){
        return mContext.getResources().getString(tab_titles[position]);
    }
}
