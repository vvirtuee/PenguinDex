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
            case 0 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.emperor), activity.getBaseContext().getString(R.string.emperorHeight), activity.getBaseContext().getString(R.string.emperorWeight), activity.getBaseContext().getString(R.string.emperorDescription), 0);
            case 1 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.adelie),activity.getBaseContext().getString(R.string.emperorHeight), activity.getBaseContext().getString(R.string.emperorWeight),  activity.getBaseContext().getString(R.string.adelieDescription), 0);
            case 2 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.african),activity.getBaseContext().getString(R.string.emperorHeight), activity.getBaseContext().getString(R.string.emperorWeight), activity.getBaseContext().getString(R.string.africanDescription), 0);
            case 3 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.macaroni),activity.getBaseContext().getString(R.string.emperorHeight), activity.getBaseContext().getString(R.string.emperorWeight),  activity.getBaseContext().getString(R.string.macaroniDescription), 0);
            case 4 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.chinstrap),activity.getBaseContext().getString(R.string.emperorHeight), activity.getBaseContext().getString(R.string.emperorWeight),  activity.getBaseContext().getString(R.string.chinstrapDescription), 0);
            case 5 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.gentoo),activity.getBaseContext().getString(R.string.emperorHeight), activity.getBaseContext().getString(R.string.emperorWeight),  activity.getBaseContext().getString(R.string.gentooDescription), 0);
            case 6 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.magellanic),activity.getBaseContext().getString(R.string.emperorHeight), activity.getBaseContext().getString(R.string.emperorWeight), activity.getBaseContext().getString(R.string.magellanicDescription), 0);
            case 7 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.rockhopper), activity.getBaseContext().getString(R.string.emperorHeight), activity.getBaseContext().getString(R.string.emperorWeight), activity.getBaseContext().getString(R.string.rockhopperDescription), 0);
            case 8 : return FactFragment.newInstance(activity.getBaseContext().getString(R.string.king),activity.getBaseContext().getString(R.string.emperorHeight), activity.getBaseContext().getString(R.string.emperorWeight),  activity.getBaseContext().getString(R.string.kingDescription), 0);
            default : return FactFragment.newInstance("404: Fragment not found", "Sorry!!","","", R.drawable.ic_menu_camera);
        }
    }

    @Override
    public int getItemCount() {
       // return Integer.MAX_VALUE;
        return 7;
    }
}
