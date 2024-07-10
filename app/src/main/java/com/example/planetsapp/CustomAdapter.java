package com.example.planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Planet> {
    private List<Planet> planetList;
    Context context;

    public CustomAdapter(List<Planet> planetList, Context context) {
        super(context , R.layout.item_list_layout, planetList);
        this.planetList = planetList;
        this.context = context;
    }
    private static class ViewHolder {

        private ImageView planetImage;
        private TextView planetName;
        private TextView planetMoons;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planet planet = getItem(position);
        ViewHolder viewHolder;
        final View result;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_layout, parent, false);
            viewHolder.planetImage =(ImageView) convertView.findViewById(R.id.planetImage);
            viewHolder.planetName =(TextView) convertView.findViewById(R.id.planetName);
            viewHolder.planetMoons =(TextView) convertView.findViewById(R.id.moonsName);
            result =convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        if (planet != null) {
            viewHolder.planetImage.setImageResource(planet.getPlanetImage());
            viewHolder.planetName.setText(planet.getPlanetName());
            viewHolder.planetMoons.setText(planet.getMoons());
            return result;
        }
        return super.getView(position, convertView, parent);

    }
}
