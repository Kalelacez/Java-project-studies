package com.kalelmusics.models;

public class Podcast extends Audio{

    private String creator;

    public String getCreator(){
        return creator;
    }

    public void setCreator(String creator){
        this.creator = creator;
    }

    @Override
    public void showClassificatiton(){
        if(getLikes() < 1000){
            System.out.println("*");
        } else if (getLikes() < 2000){
            System.out.println("**");
        } else if (getLikes() < 5000){
            System.out.println("**");
        } else if (getLikes() < 20000){
            System.out.println("****");
        } else if (getLikes() < 50000){
            System.out.println("*****");
        } else {
            System.out.println("This podcast is REALLY popular.");
        }

    }
    
    //add interface para song e podcast (pilimorfismo tambem)

}
