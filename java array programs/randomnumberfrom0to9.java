package week7;
import java.util.Random;
public class lab15 {
    public static void main(String[] args) {
        int[] counts = new int[10]; // Initialize an array to store counts

        // Generate 100 random integers between 0 and 9
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(10); // Generates a random number between 0 and 9
            counts[randomNumber]++; // Increment the count for the generated number
        }

        // Display the counts for each number
        for (int i = 0; i < 10; i++) {
            System.out.println("Count of " + i + "s: " + counts[i]);
        }


    }
}
