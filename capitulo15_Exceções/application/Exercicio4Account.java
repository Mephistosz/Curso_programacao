package application;

public class Exercicio4Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public void withdraw(Double amount) {
		if (amount >= withdrawLimit) {
			throw new IllegalArgumentException("Withdraw error: The amount exceeds withdraw limit");
		} else if (amount >= balance) {
			throw new IllegalArgumentException("Withdraw error: Not enough balance");
		} else {
			this.balance -= amount;
		}
	}

	public void deposit(Double amount) {
		this.balance += amount;
	}

	public Exercicio4Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Exercicio4Account() {
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
}
