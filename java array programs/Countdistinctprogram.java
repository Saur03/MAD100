package week7;
import java.util.Scanner;
public class lab16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] distinctNumbers = new int[10]; // Assuming there are no more than 10 distinct numbers
        int distinctCount = 0;

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();

            // Check if the number is distinct
            boolean isDistinct = true;
            for (int j = 0; j < distinctCount; j++) {
                if (num == distinctNumbers[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                distinctNumbers[distinctCount] = num;
                distinctCount++;
            }

            numbers[i] = num;
        }

        System.out.println("The number of distinct numbers is " + distinctCount);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctCount; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }

    }
}









