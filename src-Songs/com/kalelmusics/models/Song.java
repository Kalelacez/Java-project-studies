package com.kalelmusics.models;

public class Song extends Audio{

    public String songWriter;

    public String getSongWriter(){
        return songWriter;
    }

    public void getSongWriter(String songWriter){
        this.songWriter = songWriter;
    }

    @Override
    public void showClassificatiton(){
        if(getLikes() < 1000){
            System.out.println("*");
        } else if (getLikes() < 1500){
            System.out.println("**");
        } else if (getLikes() < 2000){
            System.out.println("***");
        } else if (getLikes() < 5000){
            System.out.println("****");
        } else if (getLikes() < 15000){
            System.out.println("*****");
        } else {
            System.out.println("This song is REALLY popular.");
        }
    }

}
