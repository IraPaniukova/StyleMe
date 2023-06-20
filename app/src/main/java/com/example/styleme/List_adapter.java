package com.example.styleme;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class List_adapter extends ArrayAdapter<Product> {
    public List_adapter(Activity context, ArrayList<Product> products){
        super(context,0,products);
    }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
        View productView = convertView;
        if(productView == null){
            productView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list_product_view,parent,false);
        }

        Product currentItem = getItem(position);

        TextView name = productView.findViewById(R.id.list_product_name);
        name.setText(currentItem.getName());

        TextView price = productView.findViewById(R.id.list_product_price);
        price.setText(currentItem.getPrice());

        TextView code = productView.findViewById(R.id.list_product_code);
        code.setText(currentItem.getCode());

        ImageView image = productView.findViewById(R.id.list_image);
        image.setImageResource(currentItem.getImage());

        return productView;
    }
}
