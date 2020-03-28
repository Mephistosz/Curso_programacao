package program;

import entities.Account;
import entities.SavingsAccount;

public class Exercicio3Polimorfismo {
	public static void main(String[] args) {

		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.1);

		x.withdraw(50.0);
		y.withdraw(50.0);
		System.out.println(y.getBalance());
		if (y instanceof SavingsAccount) {
			SavingsAccount z = (SavingsAccount) y;
			z.updateBalance();
			System.out.println("troco");
		}
		System.out.println(y.getBalance());
	}
}
