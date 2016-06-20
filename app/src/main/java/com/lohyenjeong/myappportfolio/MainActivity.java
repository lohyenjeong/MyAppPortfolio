package com.lohyenjeong.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bPopularMovies = (Button) findViewById(R.id.popular_movies);
        bPopularMovies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String msg = "This button will launch my " + getString(R.string.popular_movies).toLowerCase() + " project";
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();

            }
        });

        Button bHawk = (Button) findViewById(R.id.stock_hawk);
        bHawk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String msg = "This button will launch my " + getString(R.string.stock_hawk).toLowerCase() + " project";
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();

            }
        });


        Button bBigger = (Button) findViewById(R.id.build_it_bigger);
        bBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String msg = "This button will launch my " + getString(R.string.build_it_bigger).toLowerCase() + " project";
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();

            }
        });


        Button bMaterial = (Button) findViewById(R.id.material);
        bMaterial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String msg = "This button will launch my " + getString(R.string.material).toLowerCase() + " project";
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();

            }
        });


        Button bUbi = (Button) findViewById(R.id.go_ubiquitous);
        bUbi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String msg = "This button will launch my " + getString(R.string.go_ubiquitous).toLowerCase() + " project";
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();

            }
        });


        Button bCapstone = (Button) findViewById(R.id.capstone);
        bCapstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String msg = "This button will launch my " + getString(R.string.capstone).toLowerCase() + " project";
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();

            }
        });


    }


}
