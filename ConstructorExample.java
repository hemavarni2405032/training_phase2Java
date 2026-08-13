package oops;
import java.util.*;
class EmployeeDetails{
	int empId;
	String empName;
//	EmployeeDetails(){
//		System.out.println("this is a constructor");
//	}
//	EmployeeDetails(int empId,String empName){
//		this.empId=empId;
//		this.empName=empName;
//	}
	void getDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emp id");
		this.empId=sc.nextInt();
		sc.nextLine();
		System.out.println("\nenter emp name");
		this.empName=sc.nextLine();	
	}
	void display() {
		System.out.println("emp id "+this.empId);
		System.out.println("emp name "+this.empName);
	}
	
}

public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails obj=new EmployeeDetails();
		//System.out.println(obj.empId+"  "+obj.empName);
		obj.getDetails();
		obj.display();

	}

}
