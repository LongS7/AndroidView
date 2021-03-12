package com.longs7.viewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Product> list;

    public ProductAdapter(Context context, int layout, ArrayList<Product> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(layout, parent, false);

        ImageView img = convertView.findViewById(R.id.img);
        TextView tvName = convertView.findViewById(R.id.name);
        TextView tvPrice = convertView.findViewById(R.id.price);

        img.setImageResource(list.get(position).getImageResource());
        tvName.setText(list.get(position).getName());
        tvPrice.setText("$" + list.get(position).getPrice());

        return convertView;
    }
}
