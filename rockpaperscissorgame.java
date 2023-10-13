import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame
{

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    int userWins = 0;
    int computerWins = 0;

    // Continue playing while neither player has more than double the wins of the other
    while (!((userWins > 2 * computerWins && userWins >= 3) || (computerWins > 2 * userWins && computerWins >= 3))) {
      // Computer generates a number 0, 1, or 2
      int computer = rand.nextInt(3);

      int user = -1; // initialize to an invalid value
      while (user < 0 || user > 2) {
        System.out.print("scissor (0), rock (1), paper (2): ");
        if (input.hasNextInt()) {
          user = input.nextInt();
          if (user < 0 || user > 2) {
            System.out.println("Invalid choice. Please enter 0, 1, or 2.");
          }
        } else {
          System.out.println("Invalid input. Please enter a number.");
          input.next(); // clear invalid input
        }
      }

      // Display the pick of computer and user
      String computerChoice;
      if (computer == 0) {
        computerChoice = "scissor";
      } else if (computer == 1) {
        computerChoice = "rock";
      } else {
        computerChoice = "paper";
      }

      String userChoice;
      if (user == 0) {
        userChoice = "scissor";
      } else if (user == 1) {
        userChoice = "rock";
      } else {
        userChoice = "paper";
      }

      if (user == computer) {
        System.out.println("The computer is " + computerChoice + ". You are " + userChoice + " too.");
      } else {
        System.out.println("The computer is " + computerChoice + ". You are " + userChoice + ".");
      }

      // Determine and display the winner
      if (computer == user) {
        System.out.println("It is a draw");
      } else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
        System.out.println("You won");
        userWins++;
      } else {
        System.out.println("Computer won");
        computerWins++;
      }

      System.out.println("User Wins: " + userWins + ", Computer Wins: " + computerWins);
    }
  }
}

