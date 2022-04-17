package com.projects.experienceegypt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.List;

public class ListItemAdapter extends ArrayAdapter<SiteInformation> {
    private final Context context;
    public ListItemAdapter(@NonNull Context context, int resource, @NonNull List<SiteInformation> sites) {
        super(context, resource, sites);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_item, parent, false);
        }

        SiteInformation currentSite = getItem(position);

        TextView siteName = (TextView) listItemView.findViewById(R.id.site_name);
        siteName.setText(currentSite.getName());

        TextView siteAddress = (TextView) listItemView.findViewById(R.id.site_address);
        siteAddress.setText(currentSite.getAddress());


        return listItemView;
    }
}
