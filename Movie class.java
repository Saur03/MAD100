package Week10;
import java.util.List;

public class Movie {
    private List<Genre> genres;
    private int year;
    private String title;
    private String description;
    private List<Actor> actors;
    private double rating;

    public Movie() {

    }
    public Movie(List<Genre> genres, int year, String title, String description, List<Actor> actors, double rating) {
        this.genres = genres;
        this.year = year;
        this.title = title;
        this.description = description;
        this.actors = actors;
        this.rating = rating;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void listAllActors() {
        System.out.println("Actors in " + title + ":");
        for (Actor actor : actors) {
            System.out.println(actor.getFirstName() + " " + actor.getLastName());
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nRating: " + rating + "\nDescription: " + description;
    }

    public static void main(String[] args) {
        Genre actionGenre = new Genre("Action", "Exciting and fast-paced");
        Genre dramaGenre = new Genre("Drama", "Emotionally intense and character-driven");

        Actor actor1 = new Actor("John", "Doe", 30, "Talented actor");
        Actor actor2 = new Actor("Jane", "Smith", 25, "Versatile performer");

        Movie movie = new Movie(List.of(actionGenre, dramaGenre), 2023, "The Adventure", "An epic journey", List.of(actor1, actor2), 8.5);

        System.out.println(movie);
        movie.listAllActors();
    }
}


