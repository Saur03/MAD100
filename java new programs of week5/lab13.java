package Week5;

import java.util.Scanner;
public class lab13 {
    public static void displayPattern(int n){
        for(int i = 1; i <= n; i++){
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print numbers in decreasing order from i to 1
            for (int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n =  in.nextInt();

        displayPattern(n);

    }
}
