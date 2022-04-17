package com.projects.experienceegypt;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SectionPagerAdapter extends FragmentStatePagerAdapter {
    private final Context context;

    public SectionPagerAdapter(Context context, FragmentManager fragmentManager){
        super(fragmentManager);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HistoricalSitesFragment();
            case 1:
                return new MuseumsFragment();
            case 2:
                return new ModernSitesFragment();
            default:
                return new HistoricalSitesFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getString(R.string.historical_title);
            case 1:
                return context.getString(R.string.museums_title);
            case 2:
                return context.getString(R.string.modern_title);
            default:
                return context.getString(R.string.historical_title);
        }
    }
}
