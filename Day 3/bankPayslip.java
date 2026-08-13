import java.util.*;

class bankDetails1 {
    int bankId;
    String bankBranch;
    String bankIFSCCode;

    public bankDetails1(int bankId, String bankBranch, String bankIFSCCode) {
        this.bankId = bankId;
        this.bankBranch = bankBranch;
        this.bankIFSCCode = bankIFSCCode;
    }

    void display() {
        System.out.println(this.bankId + " " + this.bankBranch + " " + this.bankIFSCCode);
    }
}

class employee {
    int empId;
    String empName;
    String designation;
    double basicSalary;

    public employee(int empId, String empName, String designation, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    double HRA() {
        return basicSalary * 0.20;
    }

    double DA() {
        return basicSalary * 0.10;
    }

    double TA() {
        return basicSalary * 0.05;
    }

    double grossSalary() {
        return basicSalary + HRA() + DA() + TA();
    }


    void displayPayslip() {
        System.out.println("\nBANK PAYSLIP");
        System.out.println("Employee ID       : " + this.empId);
        System.out.println("Employee Name     : " + this.empName);
        System.out.println("Designation       : " + this.designation);
        System.out.println("Basic Salary      : " + this.basicSalary);
        System.out.println("HRA               : " + HRA());
        System.out.println("DA                : " + DA());
        System.out.println("TA                : " + TA());
        System.out.println("Gross Salary      : " + grossSalary());
    }
}

public class bankPayslip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankDetails1 bd = new bankDetails1(101, "Kadampadi", "ICOO32");

        employee emp = new employee(
                1001,
                "Hema",
                "Software Engineer",
                30000d
        );

        bd.display();
        emp.displayPayslip();

	}

}
