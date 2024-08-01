package main;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		double balance=100,amount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Customer Name");
        String Name=sc.nextLine();
        System.out.println("To Deposit press 1,to Withdraw press 2");
        int x=sc.nextInt();
        
        switch (x) {
        case 1:
        	System.out.print("Enter deposit amount: ");
        	amount=sc.nextInt();
        	if(amount<0)
        		{
        		try {
        			throw new NegativeAmountException("Invalid amount, please enter right amount."); 
        		}catch(NegativeAmountException e){e.printStackTrace();}
        		
        		
        		}
        	else {
        		balance+=amount;
        	}
        	break;
        	
        case 2:
        	System.out.print("Enter withdraw amount: ");
        	amount=sc.nextInt();
        	if(amount<0)
    		{
    		try {
    			throw new NegativeAmountException("Invalid amount, please enter right amount."); 
    		}catch(NegativeAmountException e){e.printStackTrace();}
    		
    		
    		}
    	else if(balance>amount) {
    		balance-=amount;
    	}
    	else {
    		try {
    			throw new InsufficientFundsException("Insufficient amount.");
    		}catch(InsufficientFundsException e) {{e.printStackTrace();}
    	}
    		
    		
        	}
        	break;
        	
        }
        sc.close();
        System.out.println("Your A/C Bal is INR:"+balance);
        System.out.println("Thank you");
	}
}


