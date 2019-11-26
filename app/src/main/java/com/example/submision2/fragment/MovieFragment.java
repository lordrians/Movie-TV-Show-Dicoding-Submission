package com.example.submision2.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.submision2.R;
import com.example.submision2.activity.MainActivity;
import com.example.submision2.adapter.MovieAdapter;
import com.example.submision2.object.Movie;
import com.example.submision2.object.dtMovie;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {

    private ArrayList<Movie> listMovie = new ArrayList<>();
    RecyclerView adapter;
    ViewHolder holder;
    public MovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_movie, container, false);
        // Inflate the layout for this fragment
        adapter = view.findViewById(R.id.rvMovie);
        adapter.setHasFixedSize(true);

        listMovie.addAll(dtMovie.getData());
        adapter.setLayoutManager(new LinearLayoutManager(getContext()));
        MovieAdapter movieAdapter = new MovieAdapter(listMovie, getActivity().getApplicationContext());
        adapter.setAdapter(movieAdapter);
        return view;

    }



    static class ViewHolder {
        private RecyclerView rvMovie;
        void ViewHolder(View view){
            rvMovie = view.findViewById(R.id.rvMovie);
        }
    }
}
