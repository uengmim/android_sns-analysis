package com.example.bumineun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    private static final int NUM_PAGES = 3;

    private ViewPager2 viewPager;

    private FragmentStateAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tab CODE
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.pager);
        pagerAdapter = new AdapterDemo(getSupportFragmentManager(), getLifecycle());
        viewPager.setAdapter(pagerAdapter);

        viewPager.setPageTransformer(new ZoomOutPagerTransformer());

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            if (position == 0) {
                tab.setText("실시간");
            } else if (position == 1) {
                tab.setText("단어별");
            } else {
                tab.setText("통계");
            }
        }).attach();

        // Search Button
        ImageView search = (ImageView) findViewById(R.id.search_img);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Search_empty.class);
                startActivity(intent);
            }
        });

        // Link Button
        Button link = (Button) findViewById(R.id.link_button);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Crime_screen.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }
}