public class AssistantProfessor extends Employee {
    private double BasicPay;

    // Constructor
    public AssistantProfessor(String name, int id, String address, String mail, String mobile, double basicPay) {
        super(name, id, address, mail, mobile);
        this.BasicPay = basicPay;
    }

    // Method to calculate salary
    public void calculateSalary() {
        double DA = 0.97 * BasicPay;
        double HRA = 0.10 * BasicPay;
        double PF = 0.12 * BasicPay;
        double clubFund = 0.001 * BasicPay;

        double grossSalary = BasicPay + DA + HRA;
        double netSalary = grossSalary - (PF + clubFund);

        // Display pay slip
        System.out.println("\nPay Slip for Assistant Professor:");
        displayDetails();
        System.out.println("Basic Pay: " + BasicPay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("PF: " + PF);
        System.out.println("Staff Club Fund: " + clubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}