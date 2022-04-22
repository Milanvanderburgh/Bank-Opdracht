package Inleveropdrachten;
public class Person  {
	
	private String name;
	private int age;
	private String bsn;
	public Account account;
	
	
	public Person (String bsn, String name, int age) {
		this.bsn = bsn;
		this.name = name;
		this.age = age;
		System.out.println("Naam: " + name);
		System.out.println("Leeftijd: " + age);
		System.out.println("BSN: " + bsn);
		Account.nextAccountNr++;
		
	}
	
	public boolean equals (Object o) {
		return false;
		
	}
	
	public int hashCode() {
		return 0;
	}
	
}

