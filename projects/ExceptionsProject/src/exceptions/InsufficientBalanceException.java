package exceptions;

public class InsufficientBalanceException extends Exception {

	private int currentBalance;
	private int withdrawAmount;
	
	public InsufficientBalanceException(int currentBalance, int withdrawAmount) {
		this.currentBalance = currentBalance;
		this.withdrawAmount = withdrawAmount;
	}
	
	public String toString(){
		return "InsufficientBalanceException : Cannot withdraw Rs "+withdrawAmount + " from balance Rs "+currentBalance;
	}
	
}
