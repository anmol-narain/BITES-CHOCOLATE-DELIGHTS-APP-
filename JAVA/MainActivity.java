package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
// CREATE DATASET HERE
    ArrayList<ProductsModel> arrProducts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrProducts.add(new ProductsModel(R.drawable.bcd1,"PRODUCT 1","DELICIOUS CHOCOLATE TRUFFLES {NUTS, CARAMEL, MILK , DARK , PISTA , ALMONS}"));
        arrProducts.add(new ProductsModel(R.drawable.bcd2,"PRODUCT 2","DELICIOUS HEART CHOCOLATES With CUSTOM NAME TAGS "));
        arrProducts.add(new ProductsModel(R.drawable.bcd3,"PRODUCT 3","DELICIOUS CHOCOLATE BAR And Heart Chocolate{NUTS,ALMONS}"));
        arrProducts.add(new ProductsModel(R.drawable.bcd4,"PRODUCT 4","ASSORTED CHOCOLATE HAMPER With NAME Tag{NUTS, CARAMEL, MILK , DARK , PISTA , ALMONS}"));
        arrProducts.add(new ProductsModel(R.drawable.bcd5,"PRODUCT 5","DELICIOUS CHOCOLATE BAR {NUTS, CARAMEL, MILK , DARK , PISTA , ALMONS}"));
        arrProducts.add(new ProductsModel(R.drawable.bcd6,"PRODUCT 6","Chocolate Pouch With NAME TAG (12 PCS)"));
        arrProducts.add(new ProductsModel(R.drawable.bcd7,"PRODUCT 7","Chocolate Pouch With NAME TAG (12 PCS) AND MINI GIFT BOX"));
        arrProducts.add(new ProductsModel(R.drawable.truffles,"PRODUCT 8","DELICIOUS CHOCOLATE TRUFFLES {NUTS, CARAMEL, MILK , DARK , PISTA , ALMONS}"));


        RecyclerProductAdapter adapter = new RecyclerProductAdapter(this,arrProducts);

        recyclerView.setAdapter(adapter);

    }
}