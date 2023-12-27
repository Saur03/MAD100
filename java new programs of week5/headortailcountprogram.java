package Week4;
public class lab10 {
 public static void main(String[] args) {
 int numFlips = 1000000;
 int headsCount = 0;
 int tailsCount = 0;
 for (int i = 0; i < numFlips; i++) {
 // Inside the loop, we generate a random number between 0 and 1 using Math.random(), where 0 represents heads and 1 represents tails.
 int result = (int) (Math.random() * 2);
 // Update counts based on the result
if (result == 0) {
 headsCount++;
 }
 else {
 tailsCount++;
 }
 }
 System.out.println("Number of Heads: " + headsCount);
 System.out.println("Number of Tails: " + tailsCount);
 }
}