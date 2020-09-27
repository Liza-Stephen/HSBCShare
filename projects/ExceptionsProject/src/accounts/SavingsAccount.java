package accounts;

import exceptions.*;

public class SavingsAccount implements Account {
	private int accountNumber;
	private int balance;

	public SavingsAccount(int acno, int amount) {

		if (amount < 1000)
			System.out.println("Not possible");
		else {
			this.balance = amount;
			this.accountNumber = acno;
		}
	}

	public void withdraw(int amount) throws InsufficientBalanceException {
		if (amount >= balance - 500)
			throw new InsufficientBalanceException(balance, amount);
		balance = balance - amount;
		System.out.println(
				"Rs " + amount + " withdrawn from account " + accountNumber + " Latest Balance : Rs " + balance);
	}

	public void deposit(int amount) {
		balance = balance + amount;
		System.out
				.println("Rs " + amount + " deposited in account " + accountNumber + " Latest Balance : Rs " + balance);
	}

	public String toString() {
		return "Savings account Number : " + accountNumber + " Current Balance : Rs " + balance;
	}

}
