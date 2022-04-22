package Inleveropdrachten;

import java.util.ArrayList;

public class Bank{
	
private static ArrayList<Account> accounts = new ArrayList<>();
private String name;


public Bank (String name) {
	this.name = name;
}

public boolean transfer(int fromAccountNr, int toAccountNr, int amount) {
	Account fromAccount = getAccountByNr (fromAccountNr); 
	Account toAccount = getAccountByNr(toAccountNr);
	
	
	if(fromAccount != null && toAccount != null && fromAccount != toAccount) {
		if(fromAccount.withdraw(amount) == true) {
			toAccount.deposit(amount);
			return true;
		}
	}
	return false;
	
}
public Account getAccountByNr(int accountNr) {
	for(int i = 0; i<accounts.size(); i++){
	Account account = accounts.get(i);
		if(account.accountNr == accountNr) {
		return account;
	}

}
	return null;
}

public boolean registerAccount(Person person, String type ) {
	if (type == "BankAccount") {
		BankAccount bankaccount = new BankAccount();
		accounts.add(bankaccount);
		return true;
	}else {  
		CreditAccount creditaccount = new CreditAccount();
		person.account = creditaccount;
		accounts.add(creditaccount);
		return false;
}
		
}
	
}

