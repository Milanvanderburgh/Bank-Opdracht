package Inleveropdrachten;

import java.util.Random;

public class CreditAccount extends Account{
	private double creditLimit = 1000;
	private double creditAmount;
	private int securityCode;
	
    Random r = new Random();
	
	
	public CreditAccount() {
		System.out.println("Type Account: CreditAccount");
		System.out.println("AccountNummer: " + accountNr);
	}
	
	public double getSpendingLimit() {
		return 0.0; 
	}
	
	public void payCredit() {
	}
	
	public boolean withdraw (double amount) {
		return false;
	}
}

