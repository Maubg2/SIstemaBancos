package co.edu.unbosque.model;

public class Bank {
	
	private ATM atm;
	
	public Bank() {
	}
	
	public void startATM(int time, int numATM) {
		atm = new ATM(time, numATM);
		atm.start();
	}

}
