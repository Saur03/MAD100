import java.util.Random;
import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {
        int randomNumber;
        Scanner input = new Scanner(System.in);
        int guess = 1;
        Random r = new Random();
        randomNumber = r.nextInt(1)+1;
        //undetermined amount of time
        //post-check loop
        do {
            System.out.println("Please guess a number:");
            guess = input.nextInt();
        } while(guess != randomNumber);
        input.close();
    }
}
