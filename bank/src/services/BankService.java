package services;
import java.util.HashMap;
import java.util.Map;

import models.BankAccount;


public class BankService {
 private Map<String,BankAccount> acc = new HashMap<>();
 
public void createAcc(String accNo,String name,double intialDeposit) {
	if(acc.containsKey(accNo)) {
		System.out.println("Account no is alkready existed");
		
	}
	else {
		BankAccount bank = new BankAccount(accNo,name,intialDeposit);
		acc.put(accNo, bank);
		System.out.println("Account Created successfullty");
		
	}
}

public void showAcc(String acc1) {
	if(acc.containsKey(acc1)) {
		BankAccount a = acc.get(acc1);
		System.out.println(a);
	}
	else {
		System.out.println("invalid account number");
	}
	
}

public void deposit(String acc2 , double depoMon ) {
	if(acc.containsKey(acc2)) {
		BankAccount ac = acc.get(acc2);
		ac.deposit(depoMon);
		System.out.println("deposited Successfully");
	}
	else {
		System.out.println("invalid account number");
	}
}
public void withdraw(String acc3,double withMo) {
	if(acc.containsKey(acc3)) {
		BankAccount accc = acc.get(acc3);
		if(accc.withdraw(withMo)) {
			System.out.println("withdraw Successfully");
		}
		else {
			System.out.println("Amount is greater than Bank balance");
		}
	}
	else {
		System.out.println("Invalid accopunt number");
	}
}
public void transfer(String formto,String to,double transMon) {
	if(acc.containsKey(formto) && acc.containsKey(to)) {
		BankAccount sen = acc.get(formto);
		BankAccount rec = acc.get(to);
		if(sen.withdraw(transMon)) {
			rec.deposit(transMon);
			System.out.println("deposited successfully in"+rec.getAccountNo());
		}
		else {
			System.out.println("sender has insufficient amount");
		}
		
	}
	else {
		System.out.println("Check Both accountNo again");
	}
}
public void listAllAccounts() {
	for(BankAccount a : acc.values()) {
		System.out.println(a.toString());
	}
}


}
