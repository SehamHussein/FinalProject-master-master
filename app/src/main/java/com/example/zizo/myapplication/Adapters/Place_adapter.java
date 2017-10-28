package com.example.zizo.myapplication.Adapters;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.zizo.myapplication.DataModel.placemodel;
import com.example.zizo.myapplication.R;
import com.squareup.picasso.Picasso;
//Not yet ..
public class Place_adapter extends ArrayAdapter<placemodel> {

    public Place_adapter(@NonNull Context context, @NonNull placemodel[] objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.row_placemodel_,parent,false);
        }
        placemodel placemodel = getItem(position);

        ImageView image = (ImageView) convertView.findViewById(R.id.imageView);
        //Picasso.with(context).load(src).into(imageView );
       // Picasso.with(getContext()).load("maps.googleapis.com/maps/api/place/photo?maxwidth=400&photoreference=CnRtAAAATLZNl354RwP_9UKbQ_5Psy40texXePv4oAlgP4qNEkdIrkyse7rPXYGd9D_Uj1rVsQdWT4oRz4QrYAJNpFX7rzqqMlZw2h2E2y5IKMUZ7ouD_SlcHxYq1yL4KbKUv3qtWgTK0A6QbGh87GB3sscrHRIQiG2RrmU_jF4tENr9wGS_YxoUSSDrYjWmrNfeEHSGSc3FyhNLlBU&key=AIzaSyB3eBGcB57xsUEM9zrpblxU-KvEhEKE1EA" + placemodel.getFormat(format)).into(image);
       // TextView mapType = (TextView) convertView.findViewById(R.id.textView);
  //      RatingBar ratingBarPlaceRate = (RatingBar) convertView.findViewById(R.id.ratingBar);
        TextView Name = (TextView) convertView.findViewById(R.id.textView);

        Name.setText(placemodel.getName());
     //   TextView = (TextView) convertView.findViewById(R.id.);

        //"http://maps.google.com/maps/api/staticmap?center=" + latEiffelTower + "," + lngEiffelTower + "&zoom=15&size=200x200&sensor=true";


        return convertView;
    }
}
//https://stackoverflow.com/questions/41012640/android-how-to-handle-ratingbar-in-custom-adapter