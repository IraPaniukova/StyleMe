package com.example.styleme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class List_categories extends AppCompatActivity {
    String styleItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list_products);

        Intent intent = getIntent();

        styleItem = intent.getStringExtra("category");

        if(styleItem.equals("hats")){
            showHats();
            getSupportActionBar().setTitle("HATS");

        }
        if(styleItem.equals("sglasses")){
            showSglasses();
            getSupportActionBar().setTitle("SUNGLASSES");
        }
        if(styleItem.equals("bags")){
            showBags();
            getSupportActionBar().setTitle("BAGS");
        }
    }
    private void showHats(){
        final ArrayList<Product> hatList = new ArrayList<>();
        hatList.add(new Product("Ribbon Adorn","1001","$100", R.string.hat1_description, R.drawable.hat1));
        hatList.add(new Product("Ivory Majesty", "1002","$130", R.string.hat2_description, R.drawable.hat2));
        hatList.add(new Product("Veiled Elegance", "1003","$170", R.string.hat3_description, R.drawable.hat3));
        hatList.add(new Product("Chic Bow", "1004","$100", R.string.hat4_description, R.drawable.hat4));
        hatList.add(new Product("Noir Glamour", "1005","$150", R.string.hat5_description, R.drawable.hat5));
        hatList.add(new Product("Hepburn Floral", "1006","$180", R.string.hat6_description, R.drawable.hat6));
        hatList.add(new Product("Feathered Grace", "1007","$120", R.string.hat7_description, R.drawable.hat7));
        hatList.add(new Product("Velvet Noir", "1008","$170", R.string.hat8_description, R.drawable.hat8));
        hatList.add(new Product("Black Majesty", "1009","$200", R.string.hat9_description, R.drawable.hat9));
        hatList.add(new Product("Beige Delight", "1010","$180", R.string.hat10_description, R.drawable.hat10));

        List_adapter l_adapter = new List_adapter(this, hatList);
        ListView listView = findViewById(R.id.productList);  //id from the  activity_list_products.xml
        listView.setAdapter(l_adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Product prdct = hatList.get(position);
                Intent i = new Intent(getBaseContext(), Description.class);
                i.putExtra("name",prdct.getName()+" HAT");
                i.putExtra("image",prdct.getImage());
                i.putExtra("info", prdct.getDescription());
                i.putExtra("price",prdct.getPrice());
                startActivity(i);
            }
        });
    }
    private void showSglasses(){
        final ArrayList<Product> glassesList = new ArrayList<>();
        glassesList.add(new Product("PRADA","2001","$650", R.string.sglasses1_description, R.drawable.sglasses1));
        glassesList.add(new Product("VERSACE", "2002","$430", R.string.sglasses2_description, R.drawable.sglasses2));
        glassesList.add(new Product("TIFFANY", "2003","$470", R.string.sglasses3_description, R.drawable.sglasses3));
        glassesList.add(new Product("VERSACE", "2004","$550", R.string.sglasses4_description, R.drawable.sglasses4));
        glassesList.add(new Product("RAY-BAN", "2005","$370", R.string.sglasses5_description, R.drawable.sglasses5));
        glassesList.add(new Product("PRADA", "2006","$420", R.string.sglasses6_description, R.drawable.sglasses6));
        glassesList.add(new Product("TIFFANY", "2007","$410", R.string.sglasses7_description, R.drawable.sglasses7));
        glassesList.add(new Product("VERSACE", "2008","$490", R.string.sglasses8_description, R.drawable.sglasses8));
        glassesList.add(new Product("GUCCI", "2009","$480", R.string.sglasses9_description, R.drawable.sglasses9));
        glassesList.add(new Product("GUCCI", "2010","$510", R.string.sglasses10_description, R.drawable.sglasses10));


        List_adapter l_adapter = new List_adapter(this, glassesList);
        ListView listView = findViewById(R.id.productList);  //id from the  activity_list_products.xml
        listView.setAdapter(l_adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Product prdct = glassesList.get(position);
                Intent i = new Intent(getBaseContext(), Description.class);
                i.putExtra("name",prdct.getName()+" SUNGLASSES");
                i.putExtra("image",prdct.getImage());
                i.putExtra("info", prdct.getDescription());
                i.putExtra("price",prdct.getPrice());
                startActivity(i);
            }
        });
    }
    private void showBags(){
        final ArrayList<Product> bagList = new ArrayList<>();
        bagList.add(new Product("Kate Spade","3001","$700", R.string.bag1_description, R.drawable.bag1));
        bagList.add(new Product("Gucci", "3002","$930", R.string.bag2_description, R.drawable.bag2));
        bagList.add(new Product("JW Anderson", "3003","$610", R.string.bag3_description, R.drawable.bag3));
        bagList.add(new Product("Michael Kors", "3004","$730", R.string.bag4_description, R.drawable.bag4));
        bagList.add(new Product("Givenchy", "3005","$990", R.string.bag5_description, R.drawable.bag5));
        bagList.add(new Product("Ferragamo", "3006","$810", R.string.bag6_description, R.drawable.bag6));
        bagList.add(new Product("Coach", "3007","$570", R.string.bag7_description, R.drawable.bag7));
        bagList.add(new Product("Ferragamo", "3008","$780", R.string.bag8_description, R.drawable.bag8));
        bagList.add(new Product("Fossil ", "3009","$510", R.string.bag9_description, R.drawable.bag9));
        bagList.add(new Product("Prada", "3010","$830", R.string.bag10_description, R.drawable.bag10));


        List_adapter l_adapter = new List_adapter(this, bagList);
        ListView listView = findViewById(R.id.productList);  //id from the  activity_list_products.xml
        listView.setAdapter(l_adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Product prdct = bagList.get(position);
                Intent i = new Intent(getBaseContext(), Description.class);
                i.putExtra("name",prdct.getName()+" BAG");
                i.putExtra("image",prdct.getImage());
                i.putExtra("info", prdct.getDescription());
                i.putExtra("price",prdct.getPrice());
                startActivity(i);
            }
        });
    }
}
