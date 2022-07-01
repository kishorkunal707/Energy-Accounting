package com.example.android.energyaccounting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class AssetUIActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset_ui);

/*
// Create ArrayList of items that shall be displayed on screen
        ArrayList<AssetUIClass> itemArrayList = new ArrayList<AssetUIClass>();

        // Add items to array List

        itemArrayList.add(new AssetUIClass(R.drawable.meter, "MeterActivity"));
        itemArrayList.add(new AssetUIClass(R.drawable.circuit_breaker, "HT Breaker"));
        itemArrayList.add(new AssetUIClass(R.drawable.fuse_ltbreaker, "LT Breaker"));
        itemArrayList.add(new AssetUIClass(R.drawable.high_voltage_tower, "HV Tower"));
        itemArrayList.add(new AssetUIClass(R.drawable.transformer, "Transformer"));


// initialize Custom Array Adapter
Asset_UI_ArrayAdapter listAdapter = new Asset_UI_ArrayAdapter(this, itemArrayList);

//get the parent view to populate the item view

        GridView asset_list_view = findViewById(R.id.asst_list_view);
        asset_list_view.setAdapter(listAdapter);


*/



    }
}
