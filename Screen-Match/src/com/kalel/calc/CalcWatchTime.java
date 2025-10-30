package com.kalel.calc;

import com.kalel.models.Title;

public class CalcWatchTime {
    int watchTime;

    public void addMovieWatchTime(Title title){
        this.watchTime += title.getDuration();
    }

    public int getWatchTime(){
        return watchTime;
    }
}
