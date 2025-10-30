package com.kalel.models;

public class Series extends Title {
    private int seasons;
    private int epsPerSeason;
    private boolean seasonOnGoing;
    private int minutesPerEp;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpsPerSeason() {
        return epsPerSeason;
    }

    public void setEpsPerSeason(int epsPerSeason) {
        this.epsPerSeason = epsPerSeason;
    }

    public boolean isSeasonOnGoing() {
        return seasonOnGoing;
    }

    public void setSeasonOnGoing(boolean seasonOnGoing) {
        this.seasonOnGoing = seasonOnGoing;
    }

    public int getMinutesPerEp() {
        return minutesPerEp;
    }

    public void setMinutesPerEp(int minutesPerEp) {
        this.minutesPerEp = minutesPerEp;
    }

    public int getDuration (){
        return seasons * epsPerSeason * minutesPerEp;
    }
    
}
