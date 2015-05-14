package com.github.toastshaman.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

import static com.github.toastshaman.java8.SampleData.*;
import static java.util.stream.Collectors.toList;

public class Exercise1_JDK8 implements Exercise1 {

    public List<Album> albums = Arrays.asList(aLoveSupreme, manyTrackAlbum, sampleShortAlbum);

    public List<Artist> artists = Arrays.asList(SampleData.theBeatles, georgeHarrison, johnColtrane, johnLennon, paulMcCartney, ringoStarr);

    public Exercise1_JDK8() {
    }

    @Override
    public List<Album> getAlbumsWithAtMostThreeTracks() {
        return albums.stream()
                .filter(a -> a.getTracks().count() <= 3)
                .collect(toList());
    }

    @Override
    public List<Artist> getArtistsLivingInTheUK() {
        return artists.stream()
                .filter(a -> a.isFrom("UK"))
                .collect(toList());
    }

    @Override
    public List<Artist> getSoloArtistsLivingInTheUK() {
        return artists.stream()
                .filter(a -> a.isFrom("UK"))
                .filter(a -> a.isSolo())
                .collect(toList());
    }

    @Override
    public double calculateRoyalitiesForTheUK() {
        return artists.stream()
                .filter(a -> a.isFrom("UK"))
                .mapToDouble(this::royalitiesForUKArtists)
                .sum();
    }

    public Double royalitiesForUKArtists(Artist artist) {
        if (artist.isSolo()) return 10d;
        return artist.getMembers().count() > 2 ? 20d : 50d;
    }

    public double calculateRoyalities(Predicate<Artist> predicate, ToDoubleFunction<Artist> mapper) {
        return artists.stream()
                .filter(predicate)
                .mapToDouble(mapper)
                .sum();
    }

    public boolean artistMatches(Predicate<Artist> fn) {
        return artists.stream()
                .anyMatch(fn);
    }

    @Override
    public double averageTrackLength() {
        return albums.stream()
                .flatMap(a -> a.getTracks())
                .mapToInt(t -> t.getLength())
                .average().getAsDouble();
    }

    @Override
    public double averageAlbumLength() {
        return albums.stream()
                .mapToInt(a -> a.getTracks().mapToInt(t -> t.getLength()).sum())
                .average().getAsDouble();

    }
}
