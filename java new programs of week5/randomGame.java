import java.util.Random;
import java.util.Scanner;

// The RandomGame class represents a number-guessing game.
public class RandomGame {
    
    // The main method is the starting point for Java programs.
    public static void main(String[] args) {
        
        // We use the Scanner class to get input from the user.
        Scanner input = new Scanner(System.in);
        
        // Here we declare and initialize various variables we'll use in the game.
        int randomNumber = 0;  // This will store the number the user needs to guess.
        int guess = 0;         // This is where we'll store the number the user guesses.
        int score = 0;         // This tracks how many times the user guesses incorrectly.
        int numberGuess = 0;   // This counts incorrect guesses in the current round.
        
        // The Random class allows us to generate random numbers.
        Random r = new Random();
        
        // This is the user's introduction to the game.
        System.out.println("Welcome to the random number game. Let's start by selecting a difficulty level:");
        System.out.println("1) Easy (1-10)\n2) Medium (1-25)\n3) Hard (1-50)");
        System.out.println("Please enter a number (1-3):");
        
        // We take the user's choice and store it.
        int choice = input.nextInt();
        
        // Now we ask the user how many rounds they'd like to play.
        System.out.println("How many rounds would you like to play?");
        int rounds = input.nextInt();

        // This loop will repeat for as many rounds as the user chose.
        for(int i = 1; i <= rounds; i++) {
            numberGuess = 0; // At the start of each round, we reset the incorrect guess counter.
            
            System.out.println("Let's begin round " + i + ".");

            // Depending on the user's chosen difficulty, we generate a random number in a certain range.
            switch (choice) {
                case 1:
                    randomNumber = r.nextInt(10) + 1; // For Easy mode: a number between 1 and 10.
                    break;
                case 2:
                    randomNumber = r.nextInt(25) + 1; // For Medium mode: a number between 1 and 25.
                    break;
                case 3:
                    randomNumber = r.nextInt(50) + 1; // For Hard mode: a number between 1 and 50.
                    break;
            }

            // The user will keep guessing until they get the number right.
            do {
                // We prompt the user to enter their guess.
                System.out.println("Guess the number:");
                
                // The user's guess is stored.
                guess = input.nextInt();
                
                // We check if the user's guess is correct.
                if (guess == randomNumber) {
                    System.out.println("Well done! That's the right number.");
                    System.out.println("You had " + numberGuess + " incorrect guesses in this round.");
                    score += numberGuess; // We add the incorrect guesses from this round to the overall score.
                } else {
                    System.out.println("Oops! That's not right. Try again.");
                    numberGuess++; // Since the guess was wrong, we increase the incorrect guess counter.
                }
            } while (guess != randomNumber); // We'll repeat this loop until the user guesses correctly.
        }
        
        // After all rounds are finished, we tell the user their overall score.
        System.out.println("Game over! You made a total of " + score + " incorrect guesses.");
        
        // Finally, we close the scanner. This is good practice to free up resources.
        input.close();
    }
}