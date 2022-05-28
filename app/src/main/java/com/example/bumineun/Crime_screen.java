package com.example.bumineun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Crime_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crime_screen);

        // Search Button
        ImageView search = (ImageView) findViewById(R.id.search_img);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Crime_screen.this, Search_empty.class);
                startActivity(intent);
            }
        });

        // Back button
        ImageView back = (ImageView) findViewById(R.id.back_img);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Crime_screen.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Category Button
        Button gamb = (Button)findViewById(R.id.btn_gambling);
        Button voice = (Button)findViewById(R.id.btn_voicefishing);
        Button drug = (Button) findViewById(R.id.btn_drug);
        Button sexcrime = (Button) findViewById(R.id.btn_sexcrime);

        gamb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Crime_screen.this, Crime_category_gambling.class);
                startActivity(intent);
            }
        });
        voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Crime_screen.this, Crime_category_voicefishing.class);
                startActivity(intent);
            }
        });
        drug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Crime_screen.this, Crime_category_drug.class);
                startActivity(intent);
            }
        });
        sexcrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Crime_screen.this, Crime_category_sexcrime.class);
                startActivity(intent);
            }
        });
    }
}