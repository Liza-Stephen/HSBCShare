package accounts;

import exceptions.*;

public class CurrentAccount implements Account {
	public static final int MINIMUM_BALANCE=2500;
	private int accountNumber;
	private int balance;

	public CurrentAccount(int acno, int amount) throws AccountOpenFailException {

		if (amount < 5000)
			throw new AccountOpenFailException(amount);
		this.balance = amount;
		this.accountNumber = acno;
	}

	public void withdraw(int amount) throws InsufficientBalanceException {
		if (amount >= balance - MINIMUM_BALANCE)
			throw new InsufficientBalanceException(balance, amount);
		balance = balance - amount;
		System.out.println(amount + " withdrawn from account " + accountNumber);
		System.out.println("Latest Balance : " + balance);
	}

	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println(amount + " deposited in account " + accountNumber);
		System.out.println("Latest Balance : " + balance);
	}

}
