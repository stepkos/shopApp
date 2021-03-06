package com.example.shopapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class CustomProductsAdapter extends BaseAdapter {

    Context context;
    ArrayList<HashMap<String, Object>> products;

    LayoutInflater layoutInflater;
    ImageView imageView;
    TextView textView;

    public CustomProductsAdapter(Context context, ArrayList<HashMap<String, Object>> products) {
        super();
        this.context = context;
        this.products = products;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int p) {
        return null;
    }

    @Override
    public long getItemId(int p) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.spinner_item,null);
        imageView = convertView.findViewById(R.id.image_view_cart_item);
        textView = convertView.findViewById(R.id.text_view_cart_item);

        imageView.setImageResource((int) products.get(position).get("image_id"));
        textView.setText((String) products.get(position).get("name"));
        return convertView;
    }
}
