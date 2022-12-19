package collection;

import java.util.LinkedList;
import java.util.List;

public class BankAccount {

	private String HolderName;
	private String BranchName;
	private int AccountNo;
	private String Branch;

	public BankAccount(String holderName, String branchName, int accountNo, String branch) {
		super();
		HolderName = holderName;
		BranchName = branchName;
		AccountNo = accountNo;
		Branch = branch;
	}
	public String getHolderName() {
		return HolderName;
	}
	public void setHolderName(String holderName) {
		HolderName = holderName;
	}
	public String getBranchName() {
		return BranchName;
	}
	public void setBranchName(String branchName) {
		BranchName = branchName;
	}
	public int getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}
	@Override
	public String toString() {
		return "BankAccount [HolderName=" + HolderName + ", BranchName=" + BranchName + ", AccountNo=" + AccountNo
				+ ", Branch=" + Branch + "]";
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
