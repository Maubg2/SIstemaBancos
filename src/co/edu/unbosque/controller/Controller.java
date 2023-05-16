package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Bank;
import co.edu.unbosque.model.Cola;
import co.edu.unbosque.view.MainView;

public class Controller implements ActionListener {

	private MainView mv;
	private Cola cola;
	private Bank bank;

	private String[] transactionArray = { "retiro", "consignacion", "pago", "chequeGerencia" };

	public Controller() {
		mv = new MainView();
		cola = new Cola();
		bank = new Bank();
		setListeners();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "StartSimulation":

			String numATM = mv.getCashierAmountField().getText();

			if (numATM.matches("[1-5]{1}")) {
				String timeResponse = JOptionPane.showInputDialog(null, "1. 8:00 a 12:00\n" + "2. 12:00 a 14:000\n"
						+ "3. 14:00 a 16:00\n" + "Ingrese la franja horaria");
				if (timeResponse.matches("[1-3]{1}")) {
					switch (timeResponse) {
					case "1":
						// Usuarios promedio: 5
						for (int i = 0; i <= (int) (Math.random() * (10 - 1)) + 1; i++) {
							cola.push(transactionArray[(int) (Math.random() * 3 )]); // Agregar un nodo con una
						}
						break;
					case "2":
						// Usuarios promedio: 10
						for (int i = 0; i <= (int) (Math.random() * (20 - 1)) + 1; i++) {
							cola.push(transactionArray[(int) (Math.random() * 3 )]); // Agregar un nodo con una
						}
						break;
					case "3":
						// Usuarios promedio: 3
						for (int i = 0; i <= (int) (Math.random() * (9 - 1)) + 1; i++) {
							cola.push(transactionArray[(int) (Math.random() * 3 )]); // Agregar un nodo con una
						}
						break;

					default:
						break;
					}
				}else {
					JOptionPane.showMessageDialog(null, "Debe ingresar un número del 1 al 3");
				}
			/*	for (int i = 1; i <= Integer.parseInt(numATM); i++) {
					bank.startATM((int) (Math.random() * (10 - 3)) + 3, i);
				}*/
			} else {
				JOptionPane.showMessageDialog(null, "Debe ingresar un número del 1 al 5");
			}

			break;
		}
	}

	public void setListeners() {
		mv.getStartSimulationButton().addActionListener(this);
		mv.getStartSimulationButton().setActionCommand("StartSimulation");
	}

}
