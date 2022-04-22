package Inleveropdrachten;
public class Starter{
	public static void main(String[] args) {
		
		Bank bank = new Bank("ABN AMRO");
		
		// persoon 1 binkie
		System.out.println("Persoon 1");
		Person p1 = new Person("155", "Binkie", 60); 
		bank.registerAccount(p1,"BankAccount");
		System.out.println();
		
		
		// persoon 2 Bart
		System.out.println("Persoon 2");
		Person p2 = new Person("276", "Bart", 45);
		bank.registerAccount(p2,"CreditAccount");
		System.out.println();
		
		
		bank.getAccountByNr(1001).deposit(31);

	
		
	if (bank.getAccountByNr(1001).withdraw(5.0) == true) {
        System.out.println("Withdraw: Succes");
    }else {
        System.out.println("Withdraw: Failed");
    }
		System.out.println(bank.getAccountByNr(1001).balance);

		
		
	if (bank.transfer(1001, 1002, 10) == true) {
	        System.out.println("Transfer: Succes");
	    }else {
	        System.out.println("Transfer: Failed");
			
	    }
		System.out.println(bank.getAccountByNr(1002).balance);
  }
	
	
	
}
