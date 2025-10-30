package com.kalel.models;

public class Title {
    private boolean subscribedToPlan;
    private int releaseDate;
    private String name;
    private int duration;
    private double ratingTotal;
    private int numberOfRatings;

    public boolean isSubscribedToPlan (){
        return this.subscribedToPlan;
    }

   public int getReleaseDate (){
        return this.releaseDate;
    }

    public String getName (){
        return this.name;
    }

    public int getDuration (){
        return this.duration;
    }

    public Double getRatingTotal (){
        return this.ratingTotal;
    }

    public void setSubscribedToPlan (Boolean subscribedToPlan){
         this.subscribedToPlan = subscribedToPlan;
    }

    public void setReleaseDate (Integer releaseDate){
        this.releaseDate = releaseDate;
    }

    public void setDuration (Integer duration){
        this.duration = duration;
    }

    public void setName (String name){
        this.name = name;
    }

    public void showTecnicalSheet(){
        System.out.println("Movie name: " + name);
        System.out.println("Release date: " + releaseDate);
        
    }

    public void rate(double rating){
        ratingTotal += rating;
        numberOfRatings++;
    }

    public double showAverageRating(){
        return ratingTotal / numberOfRatings;
    }
}
