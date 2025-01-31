
class Employee {
    String Emp_name;
    int Emp_id;
    String Address;
    String Mail_id;
    String Mobile_no;
    double Basic_Pay;

    
    public Employee(String name, int id, String address, String mail, String mobile, double bp) {
        this.Emp_name = name;
        this.Emp_id = id;
        this.Address = address;
        this.Mail_id = mail;
        this.Mobile_no = mobile;
        this.Basic_Pay = bp;
    }

   
    public double calculateDA() {
        return 0.97 * Basic_Pay;
    }

    
    public double calculateHRA() {
        return 0.10 * Basic_Pay;
    }

    public double calculatePF() {
        return 0.12 * Basic_Pay;
    }

  
    public double calculateSCF() {
        return 0.001 * Basic_Pay;
    }

    
    public double calculateGrossSalary() {
        return Basic_Pay + calculateDA() + calculateHRA();
    }

   
    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF() - calculateSCF();
    }

 
    public void displayPaySlip() {
        System.out.println("Pay Slip for Employee ID: " + Emp_id);
        System.out.println("Name: " + Emp_name);
        System.out.println("Address: " + Address);
        System.out.println("Mail ID: " + Mail_id);
        System.out.println("Mobile No: " + Mobile_no);
        System.out.println("Basic Pay: " + Basic_Pay);
        System.out.println("DA: " + calculateDA());
        System.out.println("HRA: " + calculateHRA());
        System.out.println("PF: " + calculatePF());
        System.out.println("Staff Club Fund: " + calculateSCF());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
        System.out.println("----------------------------------------");
    }
}


class Programmer extends Employee {
    public Programmer(String name, int id, String address, String mail, String mobile, double bp) {
        super(name, id, address, mail, mobile, bp);
    }
}


class AssistantProfessor extends Employee {
    public AssistantProfessor(String name, int id, String address, String mail, String mobile, double bp) {
        super(name, id, address, mail, mobile, bp);
    }
}


class AssociateProfessor extends Employee {
    public AssociateProfessor(String name, int id, String address, String mail, String mobile, double bp) {
        super(name, id, address, mail, mobile, bp);
    }
}


class Professor extends Employee {
    public Professor(String name, int id, String address, String mail, String mobile, double bp) {
        super(name, id, address, mail, mobile, bp);
    }
}


public class PayrollSystem {
    public static void main(String[] args) {
        
        Programmer programmer = new Programmer("John Doe", 101, "123 Main St", "john@example.com", "1234567890", 50000);
        AssistantProfessor asstProf = new AssistantProfessor("Jane Smith", 102, "456 Elm St", "jane@example.com",
                "9876543210", 60000);
        AssociateProfessor assocProf = new AssociateProfessor("Alice Johnson", 103, "789 Oak St", "alice@example.com",
                "5555555555", 70000);
        Professor professor = new Professor("Bob Brown", 104, "321 Pine St", "bob@example.com", "9999999999", 80000);

     
        programmer.displayPaySlip();
        asstProf.displayPaySlip();
        assocProf.displayPaySlip();
        professor.displayPaySlip();
    }
}