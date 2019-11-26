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
import com.example.submision2.activity.detailTvShow;
import com.example.submision2.object.TvShow;

import java.util.ArrayList;

public class TvShowAdapter extends RecyclerView.Adapter<TvShowAdapter.ListViewHolder> {
    private ArrayList<TvShow> listTvShow;
    Context mContext;

    public TvShowAdapter(ArrayList<TvShow> list, Context context) {
        this.listTvShow = list;
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
        final TvShow tvShow = listTvShow.get(position);
        Glide.with(holder.itemView.getContext())
                .load(tvShow.getPoster())
                .apply(new RequestOptions().centerCrop())
                .into(holder.ivPoster);
        holder.tvJudul.setText(tvShow.getJudul());
        holder.tvEpisode.setText(tvShow.getEpisode());
        holder.tvGenre.setText(tvShow.getGenre());
        holder.tvRilis.setText(tvShow.getRilis());
        holder.tvRate.setText(tvShow.getRate());
        holder.tvRatecount.setText(tvShow.getRatecount());
        holder.tvShortdesc.setText(tvShow.getShortdesc());
        holder.itemMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveData = new Intent(view.getContext(), detailTvShow.class);
                TvShow tvShow = new TvShow();
                tvShow.setPoster((listTvShow.get(position).getPoster()));
                tvShow.setJudul((listTvShow.get(position).getJudul()));
                tvShow.setEpisode((listTvShow.get(position).getEpisode()));
                tvShow.setGenre((listTvShow.get(position).getGenre()));
                tvShow.setRilis((listTvShow.get(position).getRilis()));
                tvShow.setRate((listTvShow.get(position).getRate()));
                tvShow.setRatecount((listTvShow.get(position).getRatecount()));
                tvShow.setShortdesc((listTvShow.get(position).getShortdesc()));
                tvShow.setSinopsis((listTvShow.get(position).getSinopsis()));
                tvShow.setTrailer((listTvShow.get(position).getTrailer()));
                moveData.putExtra(detailTvShow.EXTRA_TV, tvShow);
                view.getContext().startActivity(moveData);
            }
        });
        return;
    }

    @Override
    public int getItemCount() {
        return listTvShow.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        private TextView tvJudul, tvEpisode, tvGenre,
                tvRilis, tvRate, tvRatecount, tvShortdesc, tvSinopsis;
        private ImageView ivPoster;
        private LinearLayout itemMovie;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tvItemJudul);
            tvEpisode = itemView.findViewById(R.id.tvItemDurasi);
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

