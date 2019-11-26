package com.example.submision2.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.submision2.R;
import com.example.submision2.object.Movie;
import com.example.submision2.object.dtMovie;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowFragment extends Fragment {


    public TvShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false);




    }

}
