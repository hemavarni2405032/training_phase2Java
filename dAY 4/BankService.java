package bankApp;

public class BankService {
	double curBal=350000;
	long nums[]= {10029,10002,1004,2030};
	void searchAccount(long accNo) {
		boolean flag=false;
		for(long num:nums) {
			if(num==accNo) {
				System.out.println("Account found");
				flag=true;
				break;
			}
		}
		if(!flag) {
			throw new AccountNotFoundException("Account not found");
		}
	}
		void withdraw(float amt) {
			if(amt<=0) throw new InvalidAmtException("Invalid amount,amount should be>0 ");
			if(amt>curBal) 
				throw new InsufficientBalanceException("Insufficient balance");
			curBal=curBal-amt;
			System.out.println("CURRENT BALANCE : "+curBal);
		}
		void login(int cardNo,int pin) throws InvalidPinException {
			if(cardNo==12345)
				{
				if(pin==2020) System.out.println("Logged in successfully");
			    else throw new InvalidPinException("incorrect Pin");
				}
			else System.out.println("card is not valid");
		}
	}
