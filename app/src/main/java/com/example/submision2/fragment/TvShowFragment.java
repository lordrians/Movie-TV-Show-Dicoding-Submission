package com.example.submision2.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.submision2.R;
import com.example.submision2.adapter.TvShowAdapter;
import com.example.submision2.object.TvShow;
import com.example.submision2.object.dtTvShow;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowFragment extends Fragment {
    private ArrayList<TvShow> listTvShow = new ArrayList<>();
    RecyclerView adapter;

    public TvShowFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tv_show, container, false);
        // Inflate the layout for this fragment
        adapter = view.findViewById(R.id.rvTvShow);
        adapter.setHasFixedSize(true);

        listTvShow.addAll(dtTvShow.getData());
        adapter.setLayoutManager(new LinearLayoutManager(getContext()));
        TvShowAdapter tvShowAdapter = new TvShowAdapter(listTvShow, getActivity().getApplicationContext());
        adapter.setAdapter(tvShowAdapter);
        return view;

    }

//    static class ViewHolder {
//        private RecyclerView rvTvShow;
//        void ViewHolder(View view){
//            rvTvShow = view.findViewById(R.id.rvMovie);
//        }
//    }


}
