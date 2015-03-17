package com.troussos.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] mockArray = {
            "Today - Sunny - 85/73",
            "Tomorrow - Cloudy - 78/65",
            "Weds - Foggy - 73/65",
            "Thurs - Sunny - 82/72",
            "Fri - Cloudy - 80/72",
            "Sat - Rainy - 71/62",
            "Sun - Sunny - 76/63"
        };

        List<String> mockForecast = new ArrayList<String>(
                Arrays.asList(mockArray)
        );

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(
                        getActivity(),
                        R.layout.list_item_forecast,
                        R.id.list_item_forecast_textview,
                        mockForecast
                );

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(arrayAdapter);

        return rootView;
    }
}
