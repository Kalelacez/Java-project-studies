package com.kalel.models;

import com.kalel.calc.Classifiable;

public class Movie extends Title implements Classifiable{

    private String director;

    public String getDirector(){
        return director;
    }

    public void setDirector(String director){
        this.director = director;

    }

    @Override
    public int getClassifcation() {
        return (int)showAverageRating() / 2;
    }

}
