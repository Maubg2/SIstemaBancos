package co.edu.unbosque.model;

public class Bank {

	private ATM atm;

	public Bank() {
	}

	public void startATM(int numATM, Cola cola) {
		// atm = new ATM(time, numATM, cola);
		atm = new ATM(numATM, cola);
		atm.start();
	}

}
