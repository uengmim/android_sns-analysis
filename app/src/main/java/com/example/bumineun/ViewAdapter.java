package com.example.bumineun;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class ViewAdapter extends FragmentStateAdapter {
    private ArrayList<Fragment> items;
    private ArrayList<String> itext = new ArrayList<String>();

    public ViewAdapter(FragmentActivity fm) {
        super(fm);
        items = new ArrayList<Fragment>();
        items.add(new Tab1());
        items.add(new Tab2());
        items.add(new Tab3());
        itext.add("범죄");
        itext.add("사전");
        itext.add("통계");
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
