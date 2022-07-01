package com.example.android.energyaccounting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset_ui);

        // Create ArrayList of items that shall be displayed on screen
        ArrayList<AssetUIClass> itemArrayList = new ArrayList<AssetUIClass>();

        // Add items to array List

        itemArrayList.add(new AssetUIClass(R.drawable.meter, "MeterActivity"));
        itemArrayList.add(new AssetUIClass(R.drawable.transformer, "Transformer"));
        itemArrayList.add(new AssetUIClass(R.drawable.circuit_breaker, "HT Breaker"));
        itemArrayList.add(new AssetUIClass(R.drawable.fuse_ltbreaker, "LT Breaker"));
        itemArrayList.add(new AssetUIClass(R.drawable.high_voltage_tower, "HV Tower"));



// initialize Custom Array Adapter
        Asset_UI_ArrayAdapter listAdapter = new Asset_UI_ArrayAdapter(this, itemArrayList);

//get the parent view to populate the item view

        GridView asset_list_view = findViewById(R.id.asst_list_view);
        asset_list_view.setAdapter(listAdapter);

        asset_list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        startActivity(new Intent(getApplicationContext(), MeterActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), TransformerActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(), HTBreakerActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(), LTBreakerActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(), HVTowerActivity.class));
                        break;

                    default:
                        break;
                }
            }
        });
    }
}
