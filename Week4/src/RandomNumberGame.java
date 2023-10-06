import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int randomNumber = 0;
        int choice;
        int rounds;
        int guess = 0;
        int totalGuess = 0;
        //Welcome the user to the game
        System.out.println("Welcome to the random number game\n" +
                "Select a game difficulty:\n" +
                "1) Easy\n" +
                "2) Medium\n" +
                "3) Hard\n" +
                "Please enter a number (1-3):");
        //Allow the user to select a game difficulty
        choice = input.nextInt();
        //Allow the user to select the number of rounds
        System.out.println("Please enter the number of rounds you would like to play:");
        rounds = input.nextInt();
        //Run the game the desired number of rounds
        for(int i = 1; i <= rounds; i++) {
            System.out.println("Round: " + i); //Round: 1
            //The game will generate a random number
            switch (choice) {
                case 1:
                    randomNumber = r.nextInt(10) + 1; //0-9 -> +1 -> 1-10
                    break;
                case 2:
                    randomNumber = r.nextInt(25) + 1;
                    break;
                case 3:
                    randomNumber = r.nextInt(50) + 1;
                    break;
            }
            do {
                switch (choice) {
                    case 1:
                        System.out.println("Enter a number between 1 and 10:");
                        break;
                    case 2:
                        System.out.println("Enter a number between 1 and 25:");
                        break;
                    case 3:
                        System.out.println("Enter a number between 1 and 50:");
                        break;
                }
                //Ask the user to enter a number until the correct one is guessed
                guess = input.nextInt();
                //Keep track of the number of times the user has guessed
                totalGuess++;
                //            if (guess == randomNumber){
                //                System.out.println("Correct!");
                //            }
                //            else{
                //                System.out.println("Incorrect");
                //            }
                System.out.println(guess == randomNumber ? "Correct" : "Incorrect");
            } while (guess != randomNumber);
        }
        //output the score
        System.out.println("Your score is: " + totalGuess);
        input.close();
    }


}
