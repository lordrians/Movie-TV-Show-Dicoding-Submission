package com.example.submision2.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.submision2.BuildConfig;
import com.example.submision2.R;
import com.example.submision2.object.Movie;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerView;

public class detailMovie extends AppCompatActivity implements YouTubePlayer.OnInitializedListener {
    public static final String EXTRA_MOVIE = "extra_movie";
    private static final int RECOVERY_DIALOG_REQUEST = 1;

    private TextView tvJudul, tvDurasi, tvGenre,
            tvRilis, tvRate, tvRatecount, tvShortdesc, tvSinopsis;
    private ImageView ivPoster;

    private String apiYoutube = BuildConfig.YOUTUBE_API;
    public String VIDEO_ID;
    YouTubePlayerFragment youTubePlayerFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);
        movedData(movie);

        youTubePlayerFragment = (YouTubePlayerFragment) getFragmentManager().findFragmentById(R.id.youtubePlayerView);
        youTubePlayerFragment.initialize(apiYoutube, this);
    }

    private void movedData(Movie movie) {
        tvJudul = findViewById(R.id.tvDetailJudul);
        tvDurasi = findViewById(R.id.tvDetailDurasi);
        tvGenre = findViewById(R.id.tvDetailGenre);
        tvRilis = findViewById(R.id.tvDetailRilis);
        tvRate = findViewById(R.id.tvDetailRate);
        tvRatecount = findViewById(R.id.tvDetailRateCount);
        tvShortdesc = findViewById(R.id.tvDetailShortDesc);
        tvSinopsis = findViewById(R.id.tvDetailSinopsis);
        ivPoster = findViewById(R.id.ivDetailPoster);

        Glide.with(getApplicationContext())
                .load(movie.getPoster())
                .apply(new RequestOptions().centerCrop())
                .into(ivPoster);
        tvJudul.setText(movie.getJudul());
        tvDurasi.setText(movie.getDurasi());
        tvGenre.setText(movie.getGenre());
        tvRilis.setText(movie.getRilis());
        tvRate.setText(movie.getRate());
        tvRatecount.setText(movie.getRatecount());
        tvShortdesc.setText(movie.getShortdesc());
        tvSinopsis.setText(movie.getSinopsis());
        VIDEO_ID = movie.getTrailer();
    }


    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                        YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_DIALOG_REQUEST).show();
        } else {
            String errorMessage = String.format(
                    "There was an error initializing the YouTubePlayer (%1$s)",
                    errorReason.toString());
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
        }
    }

    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player,
                                        boolean wasRestored) {
        if (!wasRestored) {
            player.cueVideo(VIDEO_ID);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_DIALOG_REQUEST) {
            // Retry initialization if user performed a recovery action
            getYouTubePlayerProvider().initialize(apiYoutube, this);
        }
    }
    protected YouTubePlayer.Provider getYouTubePlayerProvider() {
        return (YouTubePlayerView)findViewById(R.id.youtubePlayerView);
    }
}
