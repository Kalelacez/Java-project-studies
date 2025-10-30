package com.kalel.models;

import com.kalel.calc.Classifiable;

public class Episode implements Classifiable{
    private int number;
    private String name;
    private Series series;
    private int totalViews;

    public int getNumber(){
        return number;
    }

     public String getName(){
        return name;
    }

     public Series getSeries(){
        return series;
    }

    public int totalViews(){
        return totalViews;
    }

    public void setNumber(Integer number){
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSeries(Series series){
        this.series = series;
    }

    public void setTotalViews (Integer totalViews){
        this.totalViews = totalViews;
    }

    @Override
    public int getClassifcation() {
        if(totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
}
}
