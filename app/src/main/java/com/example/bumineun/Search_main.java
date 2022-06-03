package com.example.bumineun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Search_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_main);

        // Back button
        ImageView back = (ImageView) findViewById(R.id.back_img);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search_main.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Main Button
        ImageView main = (ImageView) findViewById(R.id.logo_img);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search_main.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Crime
        CardView crime = (CardView) findViewById(R.id.crime_container);
        crime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search_main.this, Crime_search_screen.class);
                startActivity(intent);
            }
        });

        // Dictionary
        CardView dict = (CardView) findViewById(R.id.dict_container);
        dict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search_main.this, Dictionary_search_screen.class);
                startActivity(intent);
            }
        });

        // Static
        CardView stat = (CardView) findViewById(R.id.static_container);
        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search_main.this, Past_search_screen.class);
                startActivity(intent);
            }
        });
    }
}