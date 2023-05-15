package co.edu.unbosque.model;

public class Bank {

	private ATM atm;

	public Bank() {
	}

	public void startATM(int time, int numATM, Cola cola) {
		atm = new ATM(time, numATM, cola);
		atm.start();
	}

}
