package com.example.penguindexapp.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.penguindexapp.R;

public class CustomViewPagerAdapter extends FragmentStateAdapter {

    public CustomViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
      //  position = position % 5;
        switch (position){
            case 0 : return FactFragment.newInstance("Ghost", "A spooky phantom creature.", 0);
            case 1 : return FactFragment.newInstance("Mummy", "A dead human wrapped in tissue from ancient Egypt.", 0);
            case 2 : return FactFragment.newInstance("Pumpkin", "A festive vegetable that grows in the Fall.", 0);
            case 3 : return FactFragment.newInstance("Skeleton", "The first layer of most living species on Earth.", 0);
            case 4 : return FactFragment.newInstance("Vampire", "A transformed human that lurks for human blood, derived from Romania.", 0);
            default : return FactFragment.newInstance("404: Fragment not found", "Sorry!!", R.drawable.ic_menu_camera);
        }
    }

    @Override
    public int getItemCount() {
       // return Integer.MAX_VALUE;
        return 5;
    }
}
