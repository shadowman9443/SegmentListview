package com.example.shadwo.segmentlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shadwo on 7/17/2017.
 */

public class CountryAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Item> item;
    private ArrayList<Item> originalItem;

    public CountryAdapter() {
        super();
    }

    public CountryAdapter(Context context, ArrayList<Item> item) {
        this.context = context;
        this.item = item;
        //this.originalItem = item;
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int position) {
        return item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (item.get(position).isSection()) {
            // if section header
            convertView = inflater.inflate(R.layout.section_item, parent, false);
            TextView tvSectionTitle = (TextView) convertView.findViewById(R.id.tvSectionTitle);
            tvSectionTitle.setText(((SectionItem) item.get(position)).getTitle());
        } else {
            // if item
            convertView = inflater.inflate(R.layout.layout_item, parent, false);
            TextView tvItemTitle = (TextView) convertView.findViewById(R.id.tvItemTitle);
            TextView tvsubItemTitle = (TextView) convertView.findViewById(R.id.tvsubItemTitle);

            tvItemTitle.setText(((EntryItem) item.get(position)).getTitle());
            tvsubItemTitle.setText(((EntryItem) item.get(position)).getSubtitle());
        }

        return convertView;
    }
}