package accounts;

import exceptions.InsufficientBalanceException;

public interface Account {

	void deposit(int amount);
	void withdraw(int amount) throws InsufficientBalanceException ;
}
