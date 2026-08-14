package bankApp;

import java.util.Scanner;

public class BankPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("--------BANK PORTAL-------");
		System.out.println("1.login");
		System.out.println("2.search account");
		System.out.println("3.withdraw");
		System.out.println("enter user choice");
		int n=sc.nextInt();
		BankService bs=new BankService();
		switch(n) {
		case 1:
			try {
				bs.login(12345,2020);
			} catch (InvalidPinException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			bs.searchAccount(100436);
			break;
		case 3:
			bs.withdraw(-1f);
			break;
		default:
			System.out.println("invalid choice");		
		}

	}

}
