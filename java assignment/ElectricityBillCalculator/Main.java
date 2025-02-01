public class Main {
    public static void main(String[] args) {
        // Create an instance of ElectricityBill
        ElectricityBill bill = new ElectricityBill(12345, "John Doe", 500, 700, "domestic");

        // Calculate and print the bill amount
        double billAmount = bill.calculateBill();
        System.out.println("Consumer Name: " + bill.getConsumerName());
        System.out.println("Units Consumed: " + (bill.getCurrentMonthReading() - bill.getPreviousMonthReading()));
        System.out.println("Total Bill Amount: Gh. " + billAmount);
    }
}