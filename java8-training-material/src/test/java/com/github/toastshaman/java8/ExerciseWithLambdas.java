package com.github.toastshaman.java8;

import java.util.Arrays;
import java.util.List;

import static com.github.toastshaman.java8.SampleData.*;
import static com.github.toastshaman.java8.SampleData.ringoStarr;

public class ExerciseWithLambdas implements Exercise1 {

    public List<Album> albums = Arrays.asList(aLoveSupreme, manyTrackAlbum, sampleShortAlbum);
    public List<Artist> artists = Arrays.asList(SampleData.theBeatles, georgeHarrison, johnColtrane, johnLennon, paulMcCartney, ringoStarr);

    @Override
    public List<Album> getAlbumsWithAtMostThreeTracks() {
        return null;
    }

    @Override
    public List<Artist> getArtistsLivingInTheUK() {
        return null;
    }

    @Override
    public List<Artist> getSoloArtistsLivingInTheUK() {
        return null;
    }

    @Override
    public double calculateRoyalitiesForTheUK() {
        return 0;
    }

    @Override
    public double averageTrackLength() {
        return 0;
    }

    @Override
    public double averageAlbumLength() {
        return 0;
    }
}
