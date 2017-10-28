package com.example.zizo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.zizo.myapplication.DataModel.placemodel;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        Intent getDetails;
        placemodel placeModel;


//still 3yzaaaa dataaaa

        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        TextView text_name = (TextView) findViewById(R.id.text_name);
        TextView text_category = (TextView) findViewById(R.id.text_category);
        TextView text_rating = (TextView) findViewById(R.id.text_rating);

        RatingBar RatingBar = (RatingBar) findViewById(R.id.ratingBar);

    }

    //  public void onimageView12Click (View view)
    {

        // Intent intent = new Intent(details.this , MainActivity.class);
        //  startActivity(intent);
    }//


//https://stackoverflow.com/questions/35810229/how-to-display-and-set-click-event-on-back-arrow-on-toolbar


}