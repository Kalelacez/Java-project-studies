package com.kalel.calc;

public class RecomendationFilter {

    public void filter(Classifiable classifiable){
        if(classifiable.getClassifcation() >= 4){
            System.out.println("It's among the top movies at the moment");
        } else if (classifiable.getClassifcation() >= 2){
            System.out.println("It's a good pick at the moment");
        } else {
            System.out.println("Add to your 'watch later' list");
        }
    }
}
