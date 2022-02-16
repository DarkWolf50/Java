import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

import java.io.IOException;

class SavingAccount{
	int acNo;
	String name;
	double balance;
	public SavingAccount() {
		acNo=0;
		name=null;
		balance=500.0;
	}
	public void accept()throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account number,name,and balance for the customer:");
		acNo=sc.nextInt();
		name=sc.next();
		balance=sc.nextDouble();
	}
	public void withdraw() throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ammount you want to withdraw:");
		Double wamt=sc.nextDouble();
		try {
		
			double bal1=balance;
			bal1=bal1-wamt;
			if(bal1<500)
				throw new InsufficientResourcesException("Insuffient Balance:");
			balance=balance-wamt;
			System.out.println("Withdrawal Successful....!!!");
		}
		catch(InsufficientResourcesException e) {
			System.out.println("Exception:"+e.getMessage());
		}
	}
	public void deposit() throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ammount you want to deposite");
		double damt=sc.nextDouble();
		balance=balance+damt;
		System.out.println("Deposite Successful....!!!");
	}
	public void viewBalance() {
		System.out.println(" The balance is"+balance);
	}
	
	
}
public class slip5 {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("Enter the number of customers: ");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		  SavingAccount[] sa=new SavingAccount[n];
		  for(int i=0;i<n;i++){
		   sa[i]=new SavingAccount();
		   sa[i].accept();
		  }
		  int no=0;
		  System.out.println("Enter the customer Number");
		 no=sc.nextInt();
		  no--;
		  int ch=0;
		  while(ch!=4){
		   System.out.println("1. Withdraw");
		   System.out.println("2. Deposit");
		   System.out.println("3. View Balance");
		   System.out.println("4. Quit");
		   System.out.println("Select Any Option:");
		   ch=sc.nextInt();
		   switch(ch){
		   case 1: sa[no].withdraw();
		   break;
		   case 2: sa[no].deposit();
		   break;
		   case 3: sa[no].viewBalance();
		   break;
		   }
		  }
		  }

		}
		


