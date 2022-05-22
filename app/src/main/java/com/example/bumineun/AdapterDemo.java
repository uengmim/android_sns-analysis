package com.example.bumineun;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterDemo extends FragmentStateAdapter {
    public AdapterDemo(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new TabFragment1();
        } else if (position == 1) {
            return new TabFragment2();
        } else {
            return new TabFragment3();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
