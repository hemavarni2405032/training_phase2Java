import java.util.*;
class bankDetails{
	int bankId;
	String bankBranch;
	String bankIFSCCode;
	public bankDetails(int bankId, String bankBranch, String bankIFSCCode) {
		this.bankId = bankId;
		this.bankBranch = bankBranch;
		this.bankIFSCCode = bankIFSCCode;
	}
	void display()
	{
		System.out.println(this.bankId+" "+this.bankBranch+" "+this.bankIFSCCode);
	}
}
class account{
	long accNum;
    String accHolderName;
    String accType;
    double bal;
    double amt1;
    double amt2;
	public account(long accNum, String accHolderName, String accType,double bal,double amt1,double amt2) {
		this.accNum = accNum;
		this.accHolderName = accHolderName;
		this.accType = accType;
		this.bal=bal;
	}
	public void checkBalance() {
		if(bal>0) {
			System.out.println("your current balance is: "+this.bal);
		}
		else {
			System.out.println("invalid balance");
		}
		
	}
	public void withDraw(double amt1 ) {
		if(this.bal>amt1) {
			bal=bal-amt1;
		}
		else {
           System.out.println("insufficient balance");
		}
		
	}
	public void deposit(double amt2) {
		this.bal+=amt2;
	}   
}
//class card{
//long accNum;
//String cardType;
//public card(long accNum, String cardType) {
//	this.accNum = accNum;
//	this.cardType = cardType;
//}
//void display()
//{
//	System.out.println(this.accNum+" "+this.cardType);
//}
//
//}
public class BankOperationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankDetails bd=new bankDetails(101,"kadampadi","ICOO32");
		bd.display();
		account acc=new account(14527896354l,"hema", "savings account",1000d,500d,200d);
		acc.checkBalance();
		acc.deposit(200d);
		acc.checkBalance();
		acc.withDraw(500d);
		acc.checkBalance();

	}

}
