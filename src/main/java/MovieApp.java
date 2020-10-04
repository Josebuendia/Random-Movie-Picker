import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.util.*;
public class MovieApp{
    
   /*  public static String movieInputPrompt (){
        Scanner input = new Scanner(System.in);
        input = new Scanner  (System.in);
        Movie movie;
        movie = new Movie();

        System.out.println("Enter the name of the movie:");
        String title = input.nextLine();
        movie.setTitle(title);
        System.out.println("Enter the year it was released:");
        int year = input.nextInt();
        movie.setYear(year);
        System.out.println("Enter the name of the director:");
        String director = input.nextLine();
        movie.setDirector(director);
        System.out.println("Enter the main actors:");
        String actors = input.nextLine();
        movie.setActors(actors);
        System.out.println("Enter a sysnopis of the plot:");
        String plot = input.nextLine();
        movie.setPlot(plot);
        System.out.println("The movie:" + movie.getTitle() + " " +
        " " + movie.getYear() + " " + movie.getDirector() + " " +
        movie.getActors() + " " + movie.getPlot() + " " + movie.getPlot());
    } */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input = new Scanner  (System.in);

        Movie movie;
        movie = new Movie();

        String response = "";
        System.out.println("Hello, welcome to the movie selector.");
        //while(response != "C"){
        System.out.println("What would you like to do?");
        System.out.println("A. Pick a movie");
        System.out.println("or B. Add a movie to the database:");
        response = input.nextLine();
        if(response.equalsIgnoreCase("A")){
            System.out.println("Your movie is...");
        }
        else if (response.equalsIgnoreCase("B")){
           // movieInputPrompt();
           System.out.println("Enter the name of the movie:");
           String title = input.nextLine();
           movie.setTitle(title);
            System.out.println("Enter the genre:");
            String genre = input.nextLine();
            movie.setGenre(genre);
           System.out.println("Enter the year it was released:");
           int year = input.nextInt();
           movie.setYear(year);
           System.out.println("Enter the name of the director:");
           String director = input.nextLine();
           movie.setDirector(director);
           System.out.println("Enter the main actors:");
           String actors = input.nextLine();
           movie.setActors(actors);
           System.out.println("Enter a synopis of the plot:");
           String plot = input.nextLine();
           movie.setPlot(plot);
           System.out.println(movie);
        //    "Title: "  + movie.getTitle() + " " +
        //    " " + movie.getYear() + " " + movie.getDirector() + " " +
        //    movie.getActors() + " " + movie.getPlot() + " " + movie.getPlot());
        }
        else if(response.equalsIgnoreCase("C")){
           // break;
                  //  System.out.println("Bye!");

        }
    }
   // }

}