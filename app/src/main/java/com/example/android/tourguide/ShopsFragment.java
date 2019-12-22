package com.example.android.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShopsFragment extends Fragment {

    public ShopsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<Item> shops= new ArrayList<Item>();

        shops.add(new Item(getString(R.string.shop1),R.drawable.khanelkhalili));
        shops.add(new Item(getString(R.string.shop2),R.drawable.citystars));

        View rootView= inflater.inflate(R.layout.list,container,false);

        ItemAdapter shopsAdapter = new ItemAdapter(getActivity(),shops);

        ListView listView= rootView.findViewById(R.id.list);
        listView.setAdapter(shopsAdapter);

        return rootView;
    }

}
