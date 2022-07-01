package com.example.customadapterusingbaseadapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private final Activity context;
    private final String[] favAnimal;
    private final Integer[] imageId;
    private final String[] description;

    public CustomAdapter(Activity context, String[] district, Integer[] imageId, String[] description) {
        this.context = context;
        this.favAnimal = district;
        this.imageId = imageId;
        this.description = description;
    }

    @Override
    public int getCount() {
        return favAnimal.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder vh = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_layout, parent, false);
            vh = new ViewHolder(convertView);

            convertView.setTag(vh);
        }
//        LayoutInflater inflater = context.getLayoutInflater();
//        View rowview = inflater.inflate(R.layout.custom_layout,null,true);

//        ImageView img = (ImageView) rowview.findViewById(R.id.imageViewId);
//        TextView tv = (TextView) rowview.findViewById(R.id.tvId);
//        TextView tv2 = (TextView) rowview.findViewById(R.id.tv2Id);

//
        else {
            vh.img.setImageResource(imageId[position]);
            vh.txt.setText(favAnimal[position]);
//       tv2.setText(description[position]);
            //
        }
        return convertView;
    }

    private class ViewHolder {
        TextView txt;
        ImageView img;

        public ViewHolder(View view) {
            txt = (TextView) view.findViewById(R.id.tvId);
            img = (ImageView) view.findViewById(R.id.imageViewId);

        }
    }
}