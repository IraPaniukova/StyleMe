package com.example.styleme;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickHats(View view) {
        Intent categoryListActivity = new Intent(this, List_categories.class);
        categoryListActivity.putExtra("category", "hats");
        startActivity(categoryListActivity, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void onClickSglasses(View view) {
        Intent categoryListActivity = new Intent(this, List_categories.class);
        categoryListActivity.putExtra("category", "sglasses");
        startActivity(categoryListActivity, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    public void onClickBags(View view) {
        Intent categoryListActivity = new Intent(this, List_categories.class);
        categoryListActivity.putExtra("category", "bags");
        startActivity(categoryListActivity, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
}