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
import com.example.submision2.object.TvShow;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerView;

public class detailTvShow extends AppCompatActivity implements YouTubePlayer.OnInitializedListener {
    public static final String EXTRA_TV = "extra_tv";
    private static final int RECOVERY_DIALOG_REQUEST = 1;

    private TextView tvJudul, tvEpisode, tvGenre,
            tvRilis, tvRate, tvRatecount, tvShortdesc, tvSinopsis;
    private ImageView ivPoster;

    private String apiYoutube = BuildConfig.YOUTUBE_API;
    public String VIDEO_ID;
    YouTubePlayerFragment TSyouTubePlayerFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tvshow);

        TvShow tvShow = getIntent().getParcelableExtra(EXTRA_TV);
        movedData(tvShow);

        TSyouTubePlayerFragment = (YouTubePlayerFragment) getFragmentManager().findFragmentById(R.id.TSyoutubePlayerView);
        TSyouTubePlayerFragment.initialize(apiYoutube, this);
    }

    private void movedData(TvShow tvShow) {
        tvJudul = findViewById(R.id.TStvDetailJudul);
        tvEpisode = findViewById(R.id.TStvItemEps);
        tvGenre = findViewById(R.id.TStvDetailGenre);
        tvRilis = findViewById(R.id.TStvDetailRilis);
        tvRate = findViewById(R.id.TStvDetailRate);
        tvRatecount = findViewById(R.id.TStvDetailRateCount);
        tvShortdesc = findViewById(R.id.TStvDetailShortDesc);
        tvSinopsis = findViewById(R.id.TStvDetailSinopsis);
        ivPoster = findViewById(R.id.TSivDetailPoster);

        Glide.with(getApplicationContext())
                .load(tvShow.getPoster())
                .apply(new RequestOptions().centerCrop())
                .into(ivPoster);
        tvJudul.setText(tvShow.getJudul());
        tvGenre.setText(tvShow.getGenre());
        tvRilis.setText(tvShow.getRilis());
        tvRate.setText(tvShow.getRate());
        tvRatecount.setText(tvShow.getRatecount());
        tvShortdesc.setText(tvShow.getShortdesc());
        tvSinopsis.setText(tvShow.getSinopsis());
        VIDEO_ID = tvShow.getTrailer();
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
        return (YouTubePlayerView)findViewById(R.id.TSyoutubePlayerView);
    }
}