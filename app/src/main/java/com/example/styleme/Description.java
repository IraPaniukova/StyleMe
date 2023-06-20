package com.example.styleme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Description extends AppCompatActivity {
    String name,price;
    int image;
    int description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        TextView nameTextView = (TextView) findViewById(R.id.TitleForDescription);
        ImageView imageView = (ImageView) findViewById(R.id.ImageForDescription);
        TextView descriptionTextView = (TextView) findViewById(R.id.TextForDescription);
        TextView priceTextView=(TextView)findViewById(R.id.PriceForDescription);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        image = intent.getIntExtra("image", 0);
        description = intent.getIntExtra("info", 0);
        price=intent.getStringExtra("price");

        nameTextView.setText(name);
        imageView.setImageResource(image);
        descriptionTextView.setText(description);
        priceTextView.setText(price);
    }
}
