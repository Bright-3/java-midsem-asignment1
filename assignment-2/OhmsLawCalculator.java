import java.util.Scanner;

public class OhmsLawCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user which parameter is unknown
        System.out.println("Which parameter is unknown?");
        System.out.println("1. Voltage (V)");
        System.out.println("2. Current (I)");
        System.out.println("3. Resistance (R)");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        // Step 2: Declare variables for Voltage, Current, and Resistance
        double voltage = 0, current = 0, resistance = 0;

        // Step 3: Take input for the known parameters and calculate the unknown
        switch (choice) {
            case 1:
                // Calculate Voltage (V = I * R)
                System.out.print("Enter Current (I) in Amperes (A): ");
                current = scanner.nextDouble();
                System.out.print("Enter Resistance (R) in Ohms (Ω): ");
                resistance = scanner.nextDouble();
                voltage = current * resistance;
                System.out.printf("Voltage (V) = %.2f V%n", voltage);
                break;

            case 2:
                // Calculate Current (I = V / R)
                System.out.print("Enter Voltage (V) in Volts (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Resistance (R) in Ohms (Ω): ");
                resistance = scanner.nextDouble();
                current = voltage / resistance;
                System.out.printf("Current (I) = %.2f A%n", current);
                break;

            case 3:
                // Calculate Resistance (R = V / I)
                System.out.print("Enter Voltage (V) in Volts (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Current (I) in Amperes (A): ");
                current = scanner.nextDouble();
                resistance = voltage / current;
                System.out.printf("Resistance (R) = %.2f Ω%n", resistance);
                break;

            default:
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}