import java.util.*;

class Employee {
    String empName, empId, address, mailId, mobileNo;
    double basicPay;

    Employee(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    void calculateSalary() {}
    
  
    void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name : " + empName);
        System.out.println("ID : " + empId);
        System.out.println("Address : " + address);
        System.out.println("Mail ID : " + mailId);
        System.out.println("Mobile No : " + mobileNo);
        System.out.println("Basic Pay : " + basicPay);
    }
}


class Programmer extends Employee {
    Programmer(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

 
    void calculateSalary() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClub = 0.01 * basicPay;

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClub;

        displayDetails();
        System.out.println("Designation: Programmer");
        System.out.println("DA : " + da);
        System.out.println("HRA : " + hra);
        System.out.println("PF : " + pf);
        System.out.println("Staff Club : " + staffClub);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary : " + netSalary);
    }
}

class AssistantProfessor extends Employee {
    AssistantProfessor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    void calculateSalary() {
        double da = 1.10 * basicPay;
        double hra = 0.20 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClub = 0.05 * basicPay;

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClub;

        displayDetails();
        System.out.println("Designation: Assistant Professor");
        System.out.println("DA : " + da);
        System.out.println("HRA : " + hra);
        System.out.println("PF : " + pf);
        System.out.println("Staff Club : " + staffClub);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary : " + netSalary);
    }
}

class AssociateProfessor extends Employee {
    AssociateProfessor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

 
    void calculateSalary() {
        double da = 1.30 * basicPay;
        double hra = 0.30 * basicPay;
        double pf = 0.13 * basicPay;
        double staffClub = 0.10 * basicPay;

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClub;

        displayDetails();
        System.out.println("Designation: Associate Professor");
        System.out.println("DA : " + da);
        System.out.println("HRA : " + hra);
        System.out.println("PF : " + pf);
        System.out.println("Staff Club : " + staffClub);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary : " + netSalary);
    }
}

class Professor extends Employee {
    Professor(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    void calculateSalary() {
        double da = 1.40 * basicPay;
        double hra = 0.40 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClub = 0.15 * basicPay;

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClub;

        displayDetails();
        System.out.println("Designation: Professor");
        System.out.println("DA : " + da);
        System.out.println("HRA : " + hra);
        System.out.println("PF : " + pf);
        System.out.println("Staff Club : " + staffClub);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary : " + netSalary);
    }
}

public class Ex.3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();
        System.out.println("Enter Employee ID:");
        String id = sc.nextLine();
        System.out.println("Enter Address:");
        String address = sc.nextLine();
        System.out.println("Enter Mail ID:");
        String mail = sc.nextLine();
        System.out.println("Enter Mobile No:");
        String mobile = sc.nextLine();
        System.out.println("Enter Basic Pay:");
        double basic = sc.nextDouble();

        System.out.println("Select Designation:\n1. Programmer\n2. Assistant Professor\n3. Associate Professor\n4. Professor");
        int choice = sc.nextInt();

        Employee emp;
        switch (choice) {
            case 1:
                emp = new Programmer(name, id, address, mail, mobile, basic);
                break;
            case 2:
                emp = new AssistantProfessor(name, id, address, mail, mobile, basic);
                break;
            case 3:
                emp = new AssociateProfessor(name, id, address, mail, mobile, basic);
                break;
            case 4:
                emp = new Professor(name, id, address, mail, mobile, basic);
                break;
            default:
                System.out.println("Invalid Choice!");
                return;
        }
        emp.calculateSalary();
    }
}
