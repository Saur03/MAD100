package Week3;
import java.util.Scanner;
public class lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculate Area software");
        System.out.println("What would you like to calculate the area of?:\n"
                + "1) Circle:\n"
                + "2) Square:\n"
                + "3) Rectangle:\n"
                + "Enter the number (1-3): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();

                if (radius <= 0) {
                    System.out.println("Radius cannot be zero or negative.");
                } else {
                    double area = Math.PI * Math.pow(radius, 2);
                    System.out.println("The area of the circle is: " + area);
                    break;
                }
            case 2:
                System.out.print("Enter the side length of the square: ");
                double sideLength = scanner.nextDouble();

                if (sideLength <= 0) {
                    System.out.println("Side length cannot be zero or negative.");
                } else {
                    double area = Math.pow(sideLength, 2);
                    System.out.println("The area of the square is: " + area);
                    break;
                }
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();

                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();

                if (length <= 0 || width <= 0) {
                    System.out.println("Length and width must be greater than zero.");
                } else {
                    double area = length * width;
                    System.out.println("The area of the rectangle is: " + area);
                    break;
                }
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                break;

        }
    }
}
