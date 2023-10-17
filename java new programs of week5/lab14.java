package Week5;
import java.util.Random;
public class lab14 {
    public static int rollDice() {
        // Creates a Random object to generate random numbers.
        Random random = new Random();
        // Rolls two dice by generating random numbers between 1 and 6 for each die.
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        // Adds the values of both dice and returns the sum.
        return die1 + die2;
    }

    public static void main(String[] args) {
        //  It continues to roll dice, display the results, and determine whether you win or lose based on the game rules. The game loop keeps running until a win or lose condition is met.
        playCraps();
    }

    public static void playCraps() {
        // to track the point value if the game progresses to that stage.
        int point = 0;
        // until a win or lose condition is met.
        while (true) {
            int sum = rollDice();
            System.out.println("You rolled " + sum);

            if (point == 0) {
                if (sum == 2 || sum == 3 || sum == 12) {
                    System.out.println("You lose");
                    break;
                } else if (sum == 7 || sum == 11) {
                    System.out.println("You win");
                    break;
                } else {
                    point = sum;
                    System.out.println("Point is " + point);
                }
            } else {
                if (sum == 7) {
                    System.out.println("You lose");
                    break;
                } else if (sum == point) {
                    System.out.println("You win");
                    break;
                }
            }
        }
    }
}






