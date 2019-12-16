package com.example.android.tourguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ArrayList<Item> restaurants = new ArrayList<Item>();

        restaurants.add(new Item("test rest","img"));


        View rootView = inflater.inflate(R.layout.list, container, false);

        ItemAdapter restaurantsAdapter = new ItemAdapter(getActivity(), restaurants);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(restaurantsAdapter);

        return rootView;
    }

}
