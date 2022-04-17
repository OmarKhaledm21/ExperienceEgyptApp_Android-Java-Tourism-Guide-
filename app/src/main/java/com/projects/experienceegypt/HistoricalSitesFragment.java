package com.projects.experienceegypt;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class HistoricalSitesFragment extends Fragment {

    public HistoricalSitesFragment() {}

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
                "https://en.wikipedia.org/wiki/Egyptian_pyramids"));

        sites.add(new SiteInformation("Pyramids","Al Haram, Nazlet El-Semman, Al Giza Desert, Giza Governorate",
                "https://en.wikipedia.org/wiki/Egyptian_pyramids"));

        sites.add(new SiteInformation("Pyramids","Al Haram, Nazlet El-Semman, Al Giza Desert, Giza Governorate",
                "https://en.wikipedia.org/wiki/Egyptian_pyramids"));

        ListView listView = (ListView) rootView.findViewById(R.id.item_list_view);
        ListItemAdapter adapter = new ListItemAdapter(getActivity(),0,sites);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                try {
                    String url = sites.get(position).getInformation_link();
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        return rootView;
    }
}