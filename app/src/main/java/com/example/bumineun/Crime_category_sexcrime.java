package com.example.bumineun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Crime_category_sexcrime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crime_category_sexcrime);

        // Search Button
        ImageView search = (ImageView) findViewById(R.id.search_img);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Crime_category_sexcrime.this, Search_empty.class);
                startActivity(intent);
            }
        });

        // Back button
        ImageView back = (ImageView) findViewById(R.id.back_img);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Crime_category_sexcrime.this, Crime_screen.class);
                startActivity(intent);
            }
        });

        // Main Button
        ImageView main = (ImageView) findViewById(R.id.logo_img);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Crime_category_sexcrime.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}