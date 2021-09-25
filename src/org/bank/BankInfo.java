package org.bank;

public class BankInfo extends AxisBank {
private void savings() {
	System.out.println("Savings 7%");
}
	private void fixed() {
	
	System.out.println("fixed 8%");
}
public static void main(String[] args) {
	BankInfo b = new BankInfo();
	b.savings();
	b.fixed();
	b.deposit();
	
}
}
