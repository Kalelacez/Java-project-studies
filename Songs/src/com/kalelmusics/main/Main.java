package com.kalelmusics.main;

import com.kalelmusics.models.*;;

public class Main {
    public static void main(String[] args) {

        Song song = new Song();
        for (int i = 0; i < 14999; i++) {
            song.like();
        }
        Podcast podcast = new Podcast();
        for (int i = 0; i < 49999; i++) {
            podcast.like();
        }

        System.out.println(song.getLikes());
        System.out.println(podcast.getLikes());
        song.showClassificatiton();
        podcast.showClassificatiton();

    }
}
