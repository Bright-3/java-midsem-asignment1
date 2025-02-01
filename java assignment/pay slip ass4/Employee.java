public class Employee {
    // Attributes
    protected String Emp_name;
    protected int Emp_id;
    protected String Address;
    protected String Mail_id;
    protected String Mobile_no;

    // Constructor
    public Employee(String name, int id, String address, String mail, String mobile) {
        this.Emp_name = name;
        this.Emp_id = id;
        this.Address = address;
        this.Mail_id = mail;
        this.Mobile_no = mobile;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Address: " + Address);
        System.out.println("Mail ID: " + Mail_id);
        System.out.println("Mobile No: " + Mobile_no);
    }
}