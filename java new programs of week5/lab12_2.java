package Week5;

public class lab12_2 {
        // Convert from feet to meters
        public static double footToMeter(double foot) {
            return 0.305 * foot;
        }

        // Convert from meters to feet
        public static double meterToFoot(double meter) {
            return 3.279 * meter;
        }

        public static void main(String[] args) {
            System.out.println("Feet   Meters | Meters  Feet");
            System.out.println("-----------------------------");

            for (double feet = 1.0; feet <= 10.0; feet++) {
                double meters = footToMeter(feet);
                double meters2 = 20 + (feet - 1) * 5; // To create the second column
                double feet2 = meterToFoot(meters2);

                System.out.print(feet);
                System.out.print("     ");
                System.out.print(meters);
                System.out.print("  |  ");
                System.out.print(meters2);
                System.out.print("  ");
                System.out.println(feet2);
            }
        }
    }

