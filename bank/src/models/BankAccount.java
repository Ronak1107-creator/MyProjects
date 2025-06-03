package models;

public class BankAccount {
	private String accountNo;
	private String holderName;
	private double balance;
	public BankAccount(String accountNo, String holderName, double balance) {
		
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getHolderName() {
		return holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	public boolean withdraw(double amount) {
		if(amount <= this.balance) {
			this.balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return "Accoun Number is \n "+this.accountNo+"  Account Holder \n "+this.holderName+"  Current balance \n"+this.balance+"cr"; 
	}
	
	
	

}
