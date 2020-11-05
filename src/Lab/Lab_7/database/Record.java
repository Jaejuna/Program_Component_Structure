package Lab.Lab_7.database;

public class Record {
	private int balance;
	private Key key;
	
	/** */
	public Record(int initial_amount, Key k) {
		balance = initial_amount;
		key = k;
	}
	
	/** */
	public void deposit(int amount) {
		balance = balance + amount;
	}
	
	/** */
	public int getBalance() {
		return balance;
	}
	
	/** */
	public Key getKey() {
		return key;
	}
}


