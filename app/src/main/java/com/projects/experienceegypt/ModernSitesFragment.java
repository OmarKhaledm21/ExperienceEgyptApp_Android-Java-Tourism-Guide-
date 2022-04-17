package com.projects.experienceegypt;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ModernSitesFragment extends Fragment {
    private Context context;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
    public ModernSitesFragment() { }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_list_view, container, false);

        ArrayList<SiteInformation> sites = new ArrayList<>();
        sites.add(new SiteInformation("Pyramids","Al Haram, Nazlet El-Semman, Al Giza Desert, Giza Governorate",
                "https://en.wikipedia.org/wiki/Egyptian_pyramids",R.drawable.pyramids));

        ListView listView = (ListView) rootView.findViewById(R.id.item_list_view);
        ListItemAdapter adapter = new ListItemAdapter(getActivity(),0,sites);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

            }
        });

        return rootView;
    }
}