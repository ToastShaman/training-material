package com.github.toastshaman.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.github.toastshaman.java8.SampleData.*;

public class Exercise1_JDK7 implements Exercise1 {

    public List<Album> albums = Arrays.asList(aLoveSupreme, manyTrackAlbum, sampleShortAlbum);
    public List<Artist> artists = Arrays.asList(SampleData.theBeatles, georgeHarrison, johnColtrane, johnLennon, paulMcCartney, ringoStarr);

    public Exercise1_JDK7() {
    }

    @Override
    public List<Album> getAlbumsWithAtMostThreeTracks() {
        final List<Album> matches = new ArrayList<>();
        for (Album a : albums) {
            if (a.getTrackList().size() <= 3) {
                matches.add(a);
            }
        }
        return matches;
    }

    @Override
    public List<Artist> getArtistsLivingInTheUK() {
        final List<Artist> matches = new ArrayList<>();
        for (Artist a : artists) {
            if (a.isFrom("UK")) {
                matches.add(a);
            }
        }
        return matches;
    }

    @Override
    public List<Artist> getSoloArtistsLivingInTheUK() {
        final List<Artist> matches = getArtistsLivingInTheUK();
        for (Artist a : artists) {
            if (a.isSolo()) {
                matches.add(a);
            }
        }
        return matches;
    }

    @Override
    public double calculateRoyalitiesForTheUK() {
        final List<Artist> matches = getArtistsLivingInTheUK();
        double result = 0;

        for (Artist a : matches) {
            if (a.isSolo()) {
                result += soloRoyalitiesUK(a);
            } else {
                result += memberRoyalitiesUK(a);
            }
        }

        return result;
    }

    private double memberRoyalitiesUK(Artist a) {
        if (a.getMembersAsList().size() > 2) {
            return 20;
        }
        return 50;
    }

    private double soloRoyalitiesUK(Artist a) {
        return 10;
    }

    @Override
    public double averageTrackLength() {
        double sum = 0;
        double count = 0;
        for (Album a : albums) {
            count += a.getTrackList().size();
            for (Track t : a.getTrackList()) {
                sum += t.getLength();
            }
        }
        return sum / count;
    }

    @Override
    public double averageAlbumLength() {
        double sum = 0;
        double count = albums.size();
        for (Album a : albums) {
            for (Track t : a.getTrackList()) {
                sum += t.getLength();
            }
        }
        return sum / count;
    }
}
