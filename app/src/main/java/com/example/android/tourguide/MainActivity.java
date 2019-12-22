package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        FragmentAdapter adapter = new FragmentAdapter(this,getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

//        TextView restaurants = (TextView) findViewById(R.id.restaurants);
//
//
//        restaurants.setOnClickListener(new onClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link NumbersActivity}
//                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
//
//                // Start the new activity
//                startActivity(restaurantsIntent);
//            }
//        });

    }
}
