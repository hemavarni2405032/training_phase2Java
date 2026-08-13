package oops;
class StudentReport{
	int rollNum;
	String studName;
	int m1;
	int m2;
	int m3;
	int m4;
	int m5;
	float avg;
	char grade;
	StudentReport(int rollNum,String studName,int m1,int m2,int m3,int m4,int m5){
		this.rollNum=rollNum;
		this.studName=studName;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;	
		this.calResult();
	}
	void calResult() {
		avg=(m1+m2+m3+m4+m5)/5;
		if(avg>80) grade='A';
		else if(avg>60) grade='B';
		else if(avg>50) grade='C';
		else if(avg>=40) grade='D';
		else grade='E';
	}
	void getReportCard() {
		System.out.println(this.rollNum+" "+this.studName+" "+this.m1+" "+this.m2+" "+this.m3+" "+this.m4+" "+this.m5+" "+this.avg+" "+this.grade);	
	}
}

public class StudentReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentReport sr=new StudentReport(32,"hema",90,95,89,87,98);
		StudentReport sr1=new StudentReport(51,"lithigaa",50,40,54,88,98);
//		sr.calResult();
//   	sr.grade='D';
		sr.getReportCard();
		sr1.getReportCard();
		System.out.println("GRADE: "+sr.grade);
		System.out.println("GRADE: "+sr1.grade);
		

	}

}
