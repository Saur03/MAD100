package Saurabh;
import java.util.ArrayList;
import java.util.Scanner;
public class SumArrayList {
 
public static void main(String[] args) {
 
ArrayList<Double> numbers = new ArrayList<>();
 
Scanner scanner = new Scanner(System.in);
 
System.out.println("Enter five numbers:");
 
for (int i = 0; i < 5; i++) {
 
System.out.print("Number " + (i + 1) + ": ");
 
double inputNumber = scanner.nextDouble();
 
numbers.add(inputNumber);
 
}
 
double sumResult = sum(numbers);
 
System.out.println("Sum of the numbers: " + sumResult);
 
}
 
public static double sum(ArrayList<Double> list) {
 
double sum = 0;
 
for (double number : list) {
 
sum += number;
 
}
 
return sum;
 
}

}