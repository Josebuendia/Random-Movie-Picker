public class Movie{
    private String title;
    private String genre;
    private int year;
    private String director;
    //private String [] actors;
    private String actors;
    private String plot;

    //private image?
    public Movie(){
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return this.genre;
    }


    public void setGenre(String Genre) {
        this.genre = genre;
    }


    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return this.actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return this.plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String toString() {

        return "The movie:" + "Title: "  + this.getTitle() + " " +
        this.getGenre()+ " " +
        this.getYear() + " " + this.getDirector() + " " +
        this.getActors() + " " + this.getPlot() + " " +
        this.getPlot();
      }
  
}
