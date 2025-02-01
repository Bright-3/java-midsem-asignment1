import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input consumer details
        System.out.print("Enter Consumer Number: ");
        int consumerNo = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        int previousMonthReading = scanner.nextInt();

        System.out.print("Enter Current Month Reading: ");
        int currentMonthReading = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Type of Connection (domestic/commercial): ");
        String typeOfConnection = scanner.nextLine();

        // Create an instance of ElectricityBill
        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousMonthReading, currentMonthReading, typeOfConnection);

        // Calculate and print the bill amount
        double billAmount = bill.calculateBill();
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer Name: " + bill.getConsumerName());
        System.out.println("Units Consumed: " + (bill.getCurrentMonthReading() - bill.getPreviousMonthReading()));
        System.out.println("Total Bill Amount: Gh. " + billAmount);

        // Close the scanner
        scanner.close();
    }
}