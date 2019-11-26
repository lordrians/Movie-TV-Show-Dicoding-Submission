package com.example.submision2.object;

import android.os.Parcel;
import android.os.Parcelable;

public class TvShow implements Parcelable {
    private String judul;
    private String episode;
    private String genre;
    private String rilis;
    private String rate;
    private String ratecount;
    private String shortdesc;
    private String sinopsis;
    private String poster;
    private String trailer;

    public TvShow() {

    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String durasi) {
        this.episode = durasi;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRilis() {
        return rilis;
    }

    public void setRilis(String rilis) {
        this.rilis = rilis;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRatecount() {
        return ratecount;
    }

    public void setRatecount(String ratecount) {
        this.ratecount = ratecount;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public static Creator<TvShow> getCREATOR() {
        return CREATOR;
    }

    protected TvShow(Parcel in) {
        judul = in.readString();
        episode = in.readString();
        genre = in.readString();
        rilis = in.readString();
        rate = in.readString();
        ratecount = in.readString();
        shortdesc = in.readString();
        sinopsis = in.readString();
        poster = in.readString();
        trailer = in.readString();
    }

    public static final Creator<TvShow> CREATOR = new Creator<TvShow>() {
        @Override
        public TvShow createFromParcel(Parcel in) {
            return new TvShow(in);
        }

        @Override
        public TvShow[] newArray(int size) {
            return new TvShow[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(judul);
        parcel.writeString(episode);
        parcel.writeString(genre);
        parcel.writeString(rilis);
        parcel.writeString(rate);
        parcel.writeString(ratecount);
        parcel.writeString(shortdesc);
        parcel.writeString(sinopsis);
        parcel.writeString(poster);
        parcel.writeString(trailer);
    }
}
