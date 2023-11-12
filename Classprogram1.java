package Week10;

public class Actor {
        private String firstName;
        private String lastName;
        private int age;
        private String description;

        // No-args constructor
        public Actor() {
        }

        // Constructor with all information
        public Actor(String firstName, String lastName, int age, String description) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.description = description;
        }

        // Getter and setter methods for all fields
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        // Custom toString method to represent the actor as a string
        @Override
        public String toString() {
            return "Actor: " + firstName + " " + lastName;
        }

        public static void main(String[] args) {
            // Example usage
            Actor actor1 = new Actor();
            actor1.setFirstName("John");
            actor1.setLastName("Doe");
            actor1.setAge(30);
            actor1.setDescription("Talented actor");

            Actor actor2 = new Actor("Jane", "Smith", 25, "Versatile performer");

            System.out.println(actor1); // This will print: Actor: John Doe
            System.out.println(actor2); // This will print: Actor: Jane Smith
        }
    }


