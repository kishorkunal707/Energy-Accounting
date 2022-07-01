package com.example.android.energyaccounting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Asset_UI_ArrayAdapter extends ArrayAdapter<AssetUIClass> {



    public Asset_UI_ArrayAdapter(@NonNull Context context, ArrayList<AssetUIClass> uiItem) {
        super(context,0, uiItem);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View asset_root_view = convertView;

        // check whether convertView is NULL

        if(asset_root_view == null){

            asset_root_view = LayoutInflater.from(getContext()).inflate(R.layout.item_layout, parent, false);
        }

        // get the item at the position
            AssetUIClass currentItem = getItem(position);

        // dynamically assign image on to Imageview from current item
        ImageView curImageView = (ImageView) asset_root_view.findViewById(R.id.item_image);
        curImageView.setImageResource(currentItem.getImageID());

        // dynamically assign name on to TextView from current item

        TextView curTextView = (TextView) asset_root_view.findViewById(R.id.item_name);
        curTextView.setText(currentItem.getImageName());


        return asset_root_view;
    }
}
