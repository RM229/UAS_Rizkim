package com.example.uas_rizkim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        ArrayList<MovieDetails> movieDetails = QueryUtils.extractMovieDetails();

        ListView movieListView = (ListView) findViewById(R.id.list);

        MovieAdapter adapter = new MovieAdapter(this, movieDetails);

        movieListView.setAdapter(adapter);

        // App successfully parsed JSON from QueryUtils class...
    }
}