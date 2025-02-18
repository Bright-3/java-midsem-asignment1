import java.util.Scanner;

public class DCMotorSpeed {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take inputs
        System.out.print("Enter Voltage (V): ");
        double voltage = scanner.nextDouble();

        System.out.print("Enter Back EMF (V): ");
        double backEMF = scanner.nextDouble();

        System.out.print("Enter Motor Constant (V/RPM): ");
        double motorConstant = scanner.nextDouble();

        // Step 2: Validate inputs
        if (motorConstant <= 0) {
            System.out.println("Error: Motor Constant must be a positive value.");
        } else if (voltage < backEMF) {
            System.out.println("Error: Voltage must be greater than or equal to Back EMF.");
        } else {
            // Step 3: Calculate speed
            double speed = (voltage - backEMF) / motorConstant;

            // Step 4: Display the result
            System.out.printf("Motor Speed: %.2f RPM%n", speed);
        }

        // Close the scanner
        scanner.close();
    }
}