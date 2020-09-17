package exceptions;

public class AccountOpenFailException extends Exception {

	private int openAmount;
	
	
	
	public AccountOpenFailException(int openAmount) {
		this.openAmount = openAmount;
	}



	public String toString(){
		return "AccountOpenFailException : Cannot open account with Rs " + openAmount;
	}
}
