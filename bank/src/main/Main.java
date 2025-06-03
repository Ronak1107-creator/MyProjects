package main;
import java.util.Scanner;

import services.BankService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankService se = new BankService();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Bank");
		boolean firsttime = true;
		int choice;
		do {
			if(firsttime) {
			System.out.println("Services Provided by Bank are listed below");
			firsttime = false;}
			
			System.out.println("1. Create Account");
			System.out.println("2. Show Account Details");
			System.out.println("3. Deposit Money in the Account");
			System.out.println("4. withdraw Money from Account");
			System.out.println("5.tranfer the money from one account to another account");
			System.out.println("6. list all the accounts");
			System.out.println("0. exit from here");
			
			System .out.println("enter the choice");
			 choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter the Account Number , Name and Intial deposit Money");
			        String ac = sc.next();
			        String nam = sc.next();
			        double mon = sc.nextDouble();
			        se.createAcc(ac, nam, mon);
			        break;
			case 2:  System.out.println("Enter the Account Number");
			         String ac1 = sc.next();
			          se.showAcc(ac1);
			          break;
			case 3:  System.out.println("Enter the aAccount Number and Deposit Money");
			          String a = sc.next();
			          double mon1 =sc.nextDouble();
			          se.deposit(a, mon1);
			          break;
			case 4:   System.out.println("Enter the aAccount Number and Deposit Money");
	                   String a1= sc.next();
	                    double mon2 =sc.nextDouble();
	                    se.withdraw(a1, mon2);
	                    break;
			case 5:    System.out.println("Enter the  Sender Account Number ,reciver Account Number and transfer Money");
                        String a2= sc.next();
                        String a3= sc.next();
                        double mon3 =sc.nextDouble(); 
                        se.transfer(a2, a3, mon3);
			             break;
			case 6:   se.listAllAccounts();
			           break;
			case 0:    System.out.println("Exiting the system");   
			           break;
			           
			 default:  System.out.println("enter the valid choice"); 
			 }
			
			          
			         }while(choice>0);
		sc.close();
			
			
			
			
			
			
			
			
			
			
		}
		

	}


