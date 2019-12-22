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

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<Item> parks= new ArrayList<Item>();

        parks.add(new Item("test park","park img"));

        View rootView= inflater.inflate(R.layout.list,container,false);

        ItemAdapter parksAdapter = new ItemAdapter(getActivity(),parks);

        ListView listView= rootView.findViewById(R.id.list);
        listView.setAdapter(parksAdapter);

        return rootView;
    }

}
