package com.example.penguindexapp.ViewPager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.penguindexapp.R;

public class CustomViewPagerAdapter extends FragmentStateAdapter {
    FragmentActivity activity;
    public CustomViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.activity = fragmentActivity;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
      //  position = position % 5;
        switch (position){
            case 0 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.emperor), activity.getBaseContext().getString(R.string.emperorHeight), activity.getBaseContext().getString(R.string.emperorWeight), activity.getBaseContext().getString(R.string.emperorDescription), R.drawable.emperor);
            case 1 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.adelie),activity.getBaseContext().getString(R.string.adelieHeight), activity.getBaseContext().getString(R.string.adelieWeight),  activity.getBaseContext().getString(R.string.adelieDescription), R.drawable.adelie);
            case 2 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.african),activity.getBaseContext().getString(R.string.africanHeight), activity.getBaseContext().getString(R.string.africanWeight), activity.getBaseContext().getString(R.string.africanDescription), R.drawable.african);
            case 3 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.macaroni),activity.getBaseContext().getString(R.string.macaroniHeight), activity.getBaseContext().getString(R.string.macaroniWeight),  activity.getBaseContext().getString(R.string.macaroniDescription), R.drawable.macaroni);
            case 4 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.chinstrap),activity.getBaseContext().getString(R.string.chinstrapHeight), activity.getBaseContext().getString(R.string.chinstrapWeight),  activity.getBaseContext().getString(R.string.chinstrapDescription), R.drawable.chinstrap);
            case 5 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.gentoo),activity.getBaseContext().getString(R.string.gentooHeight), activity.getBaseContext().getString(R.string.gentooWeight),  activity.getBaseContext().getString(R.string.gentooDescription), R.drawable.gentoo);
            case 6 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.magellanic),activity.getBaseContext().getString(R.string.magellanicHeight), activity.getBaseContext().getString(R.string.magellanicWeight), activity.getBaseContext().getString(R.string.magellanicDescription), R.drawable.magellanic);
            case 7 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.rockhopper), activity.getBaseContext().getString(R.string.rockhopperHeight), activity.getBaseContext().getString(R.string.rockhopperWeight), activity.getBaseContext().getString(R.string.rockhopperDescription), R.drawable.rockhopper);
            case 8 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.king),activity.getBaseContext().getString(R.string.kingHeight), activity.getBaseContext().getString(R.string.kingWeight),  activity.getBaseContext().getString(R.string.kingDescription), 0);
            default : return FactFragment.newInstance("404: Fragment not found", "Sorry!!","","", R.drawable.ic_menu_camera);
        }
    }

    @Override
    public int getItemCount() {
       // return Integer.MAX_VALUE;
        return 7;
    }
}
