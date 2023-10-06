import java.util.Random;
import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        int randomNumber;
        Scanner input = new Scanner(System.in);
        int guess = 1;
        Random r = new Random();
        randomNumber = r.nextInt(5)+1;
        //undetermined amount of time
        //pre-check loop
        while(guess != randomNumber){
            System.out.println("Please guess a number:");
            guess = input.nextInt();
        }
        input.close();
    }
}
