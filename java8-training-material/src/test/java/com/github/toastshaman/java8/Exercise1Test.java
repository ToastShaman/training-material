package com.github.toastshaman.java8;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise1Test {

    private Exercise1 exercise1() {
        return new Exercise1_JDK7();
//        return new Exercise1_JDK8();
    }

    @Test
    public void getAlbumsWithAtMostThreeTracks() {
        final List<Album> albums = exercise1().getAlbumsWithAtMostThreeTracks();
        assertThat(albums).extracting("name").contains("A Love Supreme", "Sample Short Album");
    }

    @Test
    public void getArtistsLivingInTheUK() {
        final List<Artist> artists = exercise1().getArtistsLivingInTheUK();
        assertThat(artists).extracting("name").contains("George Harrison", "John Lennon", "Paul McCartney", "Ringo Starr");
    }

    @Test
    public void getSoloArtistsLivingInTheUK() {
        final List<Artist> artists = exercise1().getSoloArtistsLivingInTheUK();
        assertThat(artists).extracting("name").contains("George Harrison", "John Lennon", "Paul McCartney", "Ringo Starr");
    }

    @Test
    public void calculateRoyaltiesForTheUK() {
        final Exercise1 exercise1 = exercise1();

        double royalities = exercise1.calculateRoyalitiesForTheUK();
        assertThat(royalities).isEqualTo(60);

        if (exercise1 instanceof Exercise1_JDK8) {
            final Exercise1_JDK8 exercise1_jdk8 = (Exercise1_JDK8) exercise1;

            royalities = exercise1_jdk8.calculateRoyalities(
                    a -> a.isFrom("UK"),
                    a -> "Paul McCartney".equalsIgnoreCase(a.getName()) ? 100d : 0d);

            assertThat(royalities).isEqualTo(100);
        }
    }

    @Test
    public void matchingArtists() {
        final Exercise1 exercise1 = exercise1();
        if (exercise1 instanceof Exercise1_JDK8) {
            final Exercise1_JDK8 exercise1_jdk8 = (Exercise1_JDK8) exercise1;
            boolean exists = exercise1_jdk8.artistMatches(a -> a.getName().contains("Harris"));
            assertThat(exists).isTrue();
        }
    }

    @Test
    public void averageTrackLength() {
        double avg = exercise1().averageTrackLength();
        assertThat(avg).isEqualTo(136.125);
    }

    @Test
    public void averageAlbumLength() {
        double avg = exercise1().averageAlbumLength();
        assertThat(avg).isEqualTo(363);
    }
}
