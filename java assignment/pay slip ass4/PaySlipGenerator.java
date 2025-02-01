public class PaySlipGenerator {
    public static void main(String[] args) {
        // Create objects for each employee type
        Programmer programmer = new Programmer("John Doe", 101, "123 Main St", "john@example.com", "1234567890", 50000);
        AssistantProfessor assistantProf = new AssistantProfessor("Jane Smith", 102, "456 Elm St", "jane@example.com", "9876543210", 60000);
        AssociateProfessor associateProf = new AssociateProfessor("Alice Johnson", 103, "789 Oak St", "alice@example.com", "5555555555", 70000);
        Professor professor = new Professor("Bob Brown", 104, "321 Pine St", "bob@example.com", "9999999999", 80000);

        // Generate pay slips
        programmer.calculateSalary();
        assistantProf.calculateSalary();
        associateProf.calculateSalary();
        professor.calculateSalary();
    }
}