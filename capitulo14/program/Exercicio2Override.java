package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Exercicio2Override {
	public static void main(String[] args) {
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());

		Account acc2 = new SavingsAccount(1001, "Alex", 1000.0, 0.0);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());

		Account acc3 = new BusinessAccount(1001, "Alex", 1000.0, 0.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}
}
