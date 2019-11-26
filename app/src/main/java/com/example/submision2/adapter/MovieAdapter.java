package com.example.submision2.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.submision2.R;
import com.example.submision2.activity.detailMovie;
import com.example.submision2.object.Movie;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ListViewHolder> {
    private ArrayList<Movie> listMovie;
    Context mContext;

    public MovieAdapter(ArrayList<Movie> list, Context context) {
        this.listMovie = list;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_movie, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        final Movie movie = listMovie.get(position);
        Glide.with(holder.itemView.getContext())
                .load(movie.getPoster())
                .apply(new RequestOptions().centerCrop())
                .into(holder.ivPoster);
        holder.tvJudul.setText(movie.getJudul());
        holder.tvDurasi.setText(movie.getDurasi());
        holder.tvGenre.setText(movie.getGenre());
        holder.tvRilis.setText(movie.getRilis());
        holder.tvRate.setText(movie.getRate());
        holder.tvRatecount.setText(movie.getRatecount());
        holder.tvShortdesc.setText(movie.getShortdesc());
        holder.itemMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveData = new Intent(view.getContext(), detailMovie.class);
                Movie movie = new Movie();
                movie.setPoster((listMovie.get(position).getPoster()));
                movie.setJudul((listMovie.get(position).getJudul()));
                movie.setDurasi((listMovie.get(position).getDurasi()));
                movie.setGenre((listMovie.get(position).getGenre()));
                movie.setRilis((listMovie.get(position).getRilis()));
                movie.setRate((listMovie.get(position).getRate()));
                movie.setRatecount((listMovie.get(position).getRatecount()));
                movie.setShortdesc((listMovie.get(position).getShortdesc()));
                movie.setSinopsis((listMovie.get(position).getSinopsis()));
                movie.setTrailer((listMovie.get(position).getTrailer()));
                moveData.putExtra(detailMovie.EXTRA_MOVIE, movie);
                view.getContext().startActivity(moveData);
            }
        });
        return;
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        private TextView tvJudul, tvDurasi, tvGenre,
                tvRilis, tvRate, tvRatecount, tvShortdesc, tvSinopsis;
        private ImageView ivPoster;
        private LinearLayout itemMovie;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tvItemJudul);
            tvDurasi = itemView.findViewById(R.id.tvItemDurasi);
            tvGenre = itemView.findViewById(R.id.tvItemGenre);
            tvRilis = itemView.findViewById(R.id.tvItemRilis);
            tvRate = itemView.findViewById(R.id.tvItemRate);
            tvRatecount = itemView.findViewById(R.id.tvItemRateCount);
            tvShortdesc = itemView.findViewById(R.id.tvItemShortDesc);
            ivPoster = itemView.findViewById(R.id.ivPItemPoster);
            itemMovie = itemView.findViewById(R.id.ItemMovie);
        }
    }
}
