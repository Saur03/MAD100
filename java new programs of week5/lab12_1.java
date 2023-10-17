package Week5;

public class lab12_1 {
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        System.out.println("Celsius   Fahrenheit | Fahrenheit  Celsius");
        System.out.println("--------------------------------------");

        for (int celsius = 40; celsius >= 31; celsius--) {
            double fahrenheit = celsiusToFahrenheit(celsius);
            double fahrenheit2 = 120 - (celsius - 40) * 10;
            double celsius2 = fahrenheitToCelsius(fahrenheit2);

            System.out.print(celsius);
            System.out.print("        ");
            System.out.print(fahrenheit);
            System.out.print("     |     ");
            System.out.print(fahrenheit2);
            System.out.print("        ");
            System.out.println(celsius2);
        }
    }
}
