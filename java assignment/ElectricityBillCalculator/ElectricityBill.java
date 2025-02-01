public class ElectricityBill {
    // Fields
    private int consumerNo;
    private String consumerName;
    private int previousMonthReading;
    private int currentMonthReading;
    private String typeOfConnection; // "domestic" or "commercial"

    // Constructor
    public ElectricityBill(int consumerNo, String consumerName, int previousMonthReading, int currentMonthReading, String typeOfConnection) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousMonthReading = previousMonthReading;
        this.currentMonthReading = currentMonthReading;
        this.typeOfConnection = typeOfConnection;
    }

    // Method to calculate the bill
    public double calculateBill() {
        int unitsConsumed = currentMonthReading - previousMonthReading;
        double totalAmount = 0;

        if (typeOfConnection.equalsIgnoreCase("domestic")) {
            if (unitsConsumed <= 100) {
                totalAmount = unitsConsumed * 1;
            } else if (unitsConsumed <= 200) {
                totalAmount = 100 * 1 + (unitsConsumed - 100) * 2.50;
            } else if (unitsConsumed <= 500) {
                totalAmount = 100 * 1 + 100 * 2.50 + (unitsConsumed - 200) * 4;
            } else {
                totalAmount = 100 * 1 + 100 * 2.50 + 300 * 4 + (unitsConsumed - 500) * 6;
            }
        } else if (typeOfConnection.equalsIgnoreCase("commercial")) {
            // Commercial tariff (you can define your own logic here)
            totalAmount = unitsConsumed * 6; // Example rate for commercial
        }

        return totalAmount;
    }

    // Getters and Setters (optional but recommended)
    public int getConsumerNo() {
        return consumerNo;
    }

    public void setConsumerNo(int consumerNo) {
        this.consumerNo = consumerNo;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public int getPreviousMonthReading() {
        return previousMonthReading;
    }

    public void setPreviousMonthReading(int previousMonthReading) {
        this.previousMonthReading = previousMonthReading;
    }

    public int getCurrentMonthReading() {
        return currentMonthReading;
    }

    public void setCurrentMonthReading(int currentMonthReading) {
        this.currentMonthReading = currentMonthReading;
    }

    public String getTypeOfConnection() {
        return typeOfConnection;
    }

    public void setTypeOfConnection(String typeOfConnection) {
        this.typeOfConnection = typeOfConnection;
    }
}