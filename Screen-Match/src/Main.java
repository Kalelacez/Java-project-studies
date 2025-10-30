import com.kalel.models.Episode;
import com.kalel.models.Movie;
import com.kalel.models.Series;
import com.kalel.calc.CalcWatchTime;
import com.kalel.calc.RecomendationFilter;


public class Main {
    public static void main(String[] args){

    Movie myMovie = new Movie();

    System.out.println("\n");

    myMovie.setName("El dourado");
    myMovie.setReleaseDate(2008);
    myMovie.setDuration(180);
    
    myMovie.showTecnicalSheet();
    myMovie.rate(7);
    myMovie.rate(8);
    myMovie.rate(9);

    System.out.println("The average rating for this movie is: " + myMovie.showAverageRating());
    System.out.println("The total rating for this movie is: " + myMovie.getRatingTotal());
    System.out.println("The duration of the movie is: " + myMovie.getDuration());

     Series Suits = new Series();

     System.out.println("\n");
    
     Suits.setEpsPerSeason(12);
     Suits.setMinutesPerEp(50);
     Suits.setSeasons(10);
     Suits.setName("Suits");
     Suits.setReleaseDate(2011);
     Suits.showTecnicalSheet();
     System.out.println("The duration of the series is: " + Suits.getDuration());

    CalcWatchTime watchTime = new CalcWatchTime();

    watchTime.addMovieWatchTime(Suits);
    watchTime.addMovieWatchTime(myMovie);

    System.out.println("\nYour total watch time: " +  watchTime.getWatchTime());


    RecomendationFilter filter = new RecomendationFilter();
    filter.filter(myMovie);

    Episode episode = new Episode();
    episode.setNumber(1);
    episode.setSeries(Suits);
    episode.setTotalViews(300);
    filter.filter(episode);
}
}
