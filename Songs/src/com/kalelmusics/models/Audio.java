package com.kalelmusics.models;

public class Audio {
    private int volume;
    private String title;
    private double duration;
    private int likes;
    private int classification;

    // Getters & Setters

    public int getVolume(){
        return volume;
    }

    public void setVolume(Integer volume){
        this.volume = volume; 
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title; 
    }

    public double getDuration(){
        return duration;
    }

    public void setDuration(Double duration){
        this.duration = duration; 
    }

    public int getLikes(){
        return likes;
    }


    public int getClassification(){
        return classification;
    }

    public void setClassification(Integer classification){
        this.classification = classification;
    }

    // Methods

    public void like(){
        likes++;
    }

    public void showClassificatiton(){
        System.out.println("Classification");
    }
}
