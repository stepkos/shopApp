package com.example.shopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Spinner;

public class CardActivity extends AppCompatActivity {

    ListView cardItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        findViewById(R.id.go_to_shop).setOnClickListener(x -> {
            Intent intent = new Intent(this, AddProductActivity.class);
            startActivity(intent);
        });

        String [] descriptions = {
                "Game X G100, Core i5-10400F, 16 GB, GTX 1060, 512 GB M.2 PCIe Windows 10 Home", // 3645 zl
                "Game X G300, Core i5-10400F, 16 GB, RTX 3060, 1 TB M.2 PCIe", // 5349 zl
                "Game X Powered By NZXT G700 White, Core i9-10850K, 16 GB, RTX 3080 Ti, 1 TB M.2 PCIe 1 TB HDD Windows 11 Home" // 15499
        };
        int [] pcs = {
                R.drawable.set1,
                R.drawable.set2,
                R.drawable.set3
        };

        CustomProductsAdapter customProductsAdapter = new CustomProductsAdapter(getApplicationContext(), pcs, descriptions);
        cardItems = findViewById(R.id.card_items);
        cardItems.setAdapter(customProductsAdapter);

    }
}