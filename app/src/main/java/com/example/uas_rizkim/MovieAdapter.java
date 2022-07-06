package com.example.uas_rizkim;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class MovieAdapter extends ArrayAdapter<MovieDetails> {


    public MovieAdapter(Activity context, ArrayList<MovieDetails> movieDetails) {
        super(context, 0, movieDetails);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        MovieDetails movieDetails = getItem(position);

        TextView ratingTextView = (TextView) listItemView.findViewById(R.id.rating);
        ratingTextView.setText(movieDetails.getmRating());

        TextView productTextView = (TextView) listItemView.findViewById(R.id.product);
        productTextView.setText(movieDetails.getmProductName());

        TextView priceTextView = (TextView) listItemView.findViewById(R.id.price);
        priceTextView.setText(movieDetails.getmPrice());


        return listItemView;
    }
}