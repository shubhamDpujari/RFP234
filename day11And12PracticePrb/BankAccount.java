package day11And12PracticePrb;

public class BankAccount {

	int number;
	double balance;
	String name;
	String email;
	String phonenumber;




	public void DepositMoney(double DepositMoney) {
		this.balance+=DepositMoney;

		System.out.println("Deposit is successfull, new Blance is" +this.balance);
	}


	public void withdraw() {
		double withdraw = 0;
		if(this.balance- withdraw < 0) {
			System.out.println("withdraw is unccessfull only" + this.balance+" is left");
		}else {
			this.balance-=withdraw;		
			System.out.println("withdraw ssuccesful, current balance is "+this.balance);
		}
	}



	public double getBalance() {
		return balance;
	}
}





















