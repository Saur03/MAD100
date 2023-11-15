package Week10;

public class Genre {
    private String name;
    private String description;

    // No-args constructor
    public Genre() {
    }

    // Constructor with all information
    public Genre(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getter and setter methods for all fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Custom toString method to represent the genre as a string (returns the name)
    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        // Example usage
        Genre genre1 = new Genre();
        genre1.setName("Action");
        genre1.setDescription("Exciting and fast-paced");

        Genre genre2 = new Genre("Drama", "Emotionally intense and character-driven");

        System.out.println(genre1); // This will print: Action
        System.out.println(genre2); // This will print: Drama
    }
}

