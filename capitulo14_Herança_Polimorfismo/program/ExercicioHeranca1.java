package program;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ExercicioHeranca1 {
	public static void main(String[] args) {
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(120, "Junior", 300.0, 500.0);
		Account acc3 = new SavingsAccount(130, "Anna", 300.0, 500.0);

		List<Account> acc = new ArrayList<>();
		acc.add(acc1);
		acc.add(acc2);
		acc.add(acc3);
		
		for (Account account : acc) {
			System.out.println(account.getBalance());
		}
		// DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}
