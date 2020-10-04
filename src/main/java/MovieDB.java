import java.util.*;
//import Movie;


public class MovieDB {
    //Movie movie;
    //movie = new Movie();
   public static List<Movie> moviesDB = new ArrayList<Movie>();
    //public static List<Movie> movies = new ArrayList<>();
   // private Movie movie;
    //for (int i = 0; i < moviesDB; i++){

    public Movie getMovie() {
        return movie;
    }

    public Movie setMovie(){
        this.movie = movie;
    }

    Movie movie = new Movie();
        moviesDB.add(movie);
    //}
   /* public static boolean init = true;

    // constructor for the class
    static {
        if (init) {

            //Start of Movie DB
            //movie movie1 = new movie("String", 1945, "String", "String", "String");
           // movies.add(movie1);
            //End of Movie  DBd

            
            
            //End of Movie DB data

            init = false;
        }*/
   // }

}