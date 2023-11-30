package Week10;
import java.util.List;
import java.util.ArrayList;

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
            System.out.println(actor);
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Rating: " + rating + ", Description: " + description;
    }
}
    class Top10Movies {
        private List<Movie> movies;

        public Top10Movies() {
            this.movies = new ArrayList<>();
        }

        public void addMovie(Movie movie) {
            if (movies.size() < 10) {
                movies.add(movie);
            } else {
                System.out.println("Top 10 movie list is full. Cannot add more movies.");
            }
        }
        public void displayTop10Movies() {
            for (int i = 0; i < movies.size(); i++) {
                System.out.println((i + 1) + ". " + movies.get(i));
            }
        }



    public static void main(String[] args) {

        Top10Movies top10Movies = new Top10Movies();

        Genre actionGenre = new Genre("Action", "Exciting and fast-paced");
        Genre dramaGenre = new Genre("Drama", "Emotionally intense and character-driven");

        Actor actor1 = new Actor("John", "Doe", 30, "Talented actor");
        Actor actor2 = new Actor("Jane", "Smith", 25, "Versatile performer");

        Movie movie1 = new Movie(List.of(actionGenre, dramaGenre), 2023, "The Adventure", "An epic journey", List.of(actor1, actor2), 8.5);
        Movie movie2 = new Movie(List.of(actionGenre), 2022, "Fast & Furious", "High-speed action", List.of(actor2), 7.8);

        top10Movies.addMovie(movie1);
        top10Movies.addMovie(movie2);

        top10Movies.displayTop10Movies();

    }
}


