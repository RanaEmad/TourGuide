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

public class MonumentsFragment extends Fragment {

    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<Item> monuments= new ArrayList<Item>();

        monuments.add(new Item("test monument","mon img"));

        View rootView= inflater.inflate(R.layout.list,container,false);

        ItemAdapter monumentsAdapter = new ItemAdapter(getActivity(),monuments);

        ListView listView= rootView.findViewById(R.id.list);
        listView.setAdapter(monumentsAdapter);

        return rootView;
    }

}
