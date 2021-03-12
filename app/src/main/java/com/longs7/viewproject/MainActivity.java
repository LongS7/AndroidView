package com.longs7.viewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private ListView listView;
    private ArrayList<String> products;
    private ArrayAdapter adapter;
    private ProductAdapter productAdapter;
    private ArrayList<Product> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        listView = findViewById(R.id.list_view);

        products = new ArrayList();
        products.add("Hàng điện tử");
        products.add("Hàng gia dụng");
        products.add("Hàng dễ vỡ");

        adapter = new ArrayAdapter<String> (
                this,
                R.layout.support_simple_spinner_dropdown_item,
                products
        );

        list = new ArrayList<Product>();
        list.add(new Product(R.drawable.a_teveloper_tester_can_never_be_friend, "Tester", 20));
        list.add(new Product(R.drawable.computer, "Computer", 50));
        list.add(new Product(R.drawable.worlds_best_developer, "Worlds best Developer", 30));
        list.add(new Product(R.drawable.yellow_google, "Yellow Google", 52));

        productAdapter = new ProductAdapter(this, R.layout.list_view_item, list);

        spinner.setAdapter(adapter);
        listView.setAdapter(productAdapter);
    }
}
