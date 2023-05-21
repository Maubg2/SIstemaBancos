package co.edu.unbosque.model;

import co.edu.unbosque.view.MainView;

public class Bank {

	private ATM atm;

	public Bank() {
	}

	public void startATM(int numATM, Cola cola, MainView view) {
		// atm = new ATM(time, numATM, cola);
		atm = new ATM(numATM, cola, view);
		atm.start();
	}

}
