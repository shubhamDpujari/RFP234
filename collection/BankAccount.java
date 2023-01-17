package collection;

import java.util.LinkedList;
import java.util.List;

public class BankAccount {

	private String holderName;
	private String branchName;
	private int accountNo;
	private String branch;

	public BankAccount(String holderName, String branchName, int accountNo, String branch) {
		super();
		holderName = holderName;
		branchName = branchName;
		accountNo = accountNo;
		branch = branch;
	}
	public String getholderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		holderName = holderName;
	}
	public String getbranchName() {
		return branchName;
	}
	public void setbranchName(String branchName) {
		branchName = branchName;
	}
	public int getaccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		accountNo = accountNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		branch = branch;
	}
	@Override
	public String toString() {
		return "BankAccount [HolderName=" + holderName + ", branchName=" + branchName + ", accountNo=" + accountNo
				+ ", branch=" + branch + "]";
	}
	public static void main(String[] args) {

		BankAccount bankaccount = new BankAccount("Saikumar", "Vizag", 2345, "sbi");
		BankAccount bankaccount1 = new BankAccount("Shubham", "pune", 2419, "kotak");

		System.out.println(bankaccount1);

		List<BankAccount> list = new LinkedList<>();
		list.add(bankaccount1);
		System.out.println(bankaccount1);

		list.add(new BankAccount("Saikumar", "Vizag", 2345, "sbi") );
		System.out.println( bankaccount);
		
		



	}

}
