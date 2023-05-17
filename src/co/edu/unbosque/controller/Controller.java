package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Bank;
import co.edu.unbosque.model.Cola;
import co.edu.unbosque.view.MainView;

public class Controller implements ActionListener {

	private MainView mv;
	private Cola cola1;
	private Cola cola2;
	private Cola cola3;
	private Cola cola4;
	private Cola cola5;
	private Bank bank;

	private String[] transactionArray = { "retiro", "consignacion", "pago", "chequeGerencia" };

	public Controller() {
		mv = new MainView();
		cola1 = new Cola();
		cola2 = new Cola();
		cola3 = new Cola();
		cola4 = new Cola();
		cola5 = new Cola();
		bank = new Bank();
		setListeners();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "StartSimulation":

			String numATM = mv.getCashierAmountField().getText();
			int randomUserAmount = 0;
			if (numATM.matches("[1-5]{1}")) {
				String timeResponse = JOptionPane.showInputDialog(null, "1. 8:00 a 12:00\n" + "2. 12:00 a 14:000\n"
						+ "3. 14:00 a 16:00\n" + "Ingrese la franja horaria");
				if (timeResponse.matches("[1-3]{1}")) {
					switch (timeResponse) { // Switch de franja horaria
					case "1":
						// Generación de colas
						// Usuarios promedio: 5 (Tiempo 8:00 a 12:00)
						switch (numATM) { // Switch de cantidad de cajeros
						case "1": // 1 cajero => 1 cola
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 1 con " + (randomUserAmount + 1) + " nodos");
							// Crear hilos con la cola
							bank.startATM(1, cola1);
							break;
						case "2": // 2 cajeros => 2 colas
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 1 con " + (randomUserAmount + 1) + " nodos");
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola2.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 2 con " + (randomUserAmount + 1) + " nodos");
							// Crear hilos con la cola
							bank.startATM(1, cola1);
							bank.startATM(2, cola2);
							break;
						case "3": // 3 cajeros => 3 colas
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 1 con " + (randomUserAmount + 1) + " nodos");
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola2.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 2 con " + (randomUserAmount + 1) + " nodos");
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola3.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 3 con " + (randomUserAmount + 1) + " nodos");
							// Crear hilos con la cola
							bank.startATM(1, cola1);
							bank.startATM(2, cola2);
							bank.startATM(3, cola3);
							break;
						case "4": // 4 cajeros => 4 colas
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 1 con " + (randomUserAmount + 1) + " nodos");
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola2.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 2 con " + (randomUserAmount + 1) + " nodos");
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola3.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 3 con " + (randomUserAmount + 1) + " nodos");
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola4.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 4 con " + (randomUserAmount + 1) + " nodos");
							// Crear hilos con la cola
							bank.startATM(1, cola1);
							bank.startATM(2, cola2);
							bank.startATM(3, cola3);
							bank.startATM(4, cola4);
							break;
						case "5": // 5 cajeros => 5 colas
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 1 con " + randomUserAmount + " nodos");
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola2.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 2 con " + randomUserAmount + " nodos");
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola3.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 3 con " + randomUserAmount + " nodos");
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola4.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 4 con " + randomUserAmount + " nodos");
							randomUserAmount = (int) (Math.random() * (10 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola5.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							System.out.println("Generada cola 5 con " + randomUserAmount + " nodos");

							bank.startATM(1, cola1);
							bank.startATM(2, cola2);
							bank.startATM(3, cola3);
							bank.startATM(4, cola4);
							bank.startATM(5, cola5);
							break;
						}
						break;
					case "2":
						// Generación de colas
						// Usuarios promedio: 10 (Tiempo 12:00 a 14:00)
						switch (numATM) {
						case "1": // 1 cajero => 1 cola
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							// Crear hilos con la cola
							bank.startATM(1, cola1);
							break;
						case "2": // 2 cajeros => 2 colas
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola2.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							// Crear hilos con la cola
							bank.startATM(1, cola1);
							bank.startATM(2, cola2);
							break;
						case "3": // 3 cajeros => 3 colas
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola2.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola3.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							// Crear hilos con la cola
							bank.startATM(1, cola1);
							bank.startATM(2, cola2);
							bank.startATM(3, cola3);
							break;
						case "4": // 4 cajeros => 4 colas
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola2.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola3.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola4.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							// Crear hilos con la cola
							bank.startATM(1, cola1);
							bank.startATM(2, cola2);
							bank.startATM(3, cola3);
							bank.startATM(4, cola4);
							break;
						case "5": // 5 cajeros => 5 colas
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola2.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola3.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola4.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (20 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola5.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							bank.startATM(1, cola1);
							bank.startATM(2, cola2);
							bank.startATM(3, cola3);
							bank.startATM(4, cola4);
							bank.startATM(5, cola5);
							break;
						}
						break;
					case "3":
						// Generación de colas
						// Usuarios promedio: 3 (Tiempo 14:00 a 16:00)
						switch (numATM) {
						case "1": // 1 cajero => 1 cola
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							// Crear hilos con la cola
							bank.startATM(1, cola1);
							break;
						case "2": // 2 cajeros => 2 colas
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola2.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							// Crear hilos con la cola
							bank.startATM(1, cola1);
							bank.startATM(2, cola2);
							break;
						case "3": // 3 cajeros => 3 colas
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola2.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola3.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							// Crear hilos con la cola
							bank.startATM(1, cola1);
							bank.startATM(2, cola2);
							bank.startATM(3, cola3);
							break;
						case "4": // 4 cajeros => 4 colas
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola2.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola3.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola4.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							// Crear hilos con la cola
							bank.startATM(1, cola1);
							bank.startATM(2, cola2);
							bank.startATM(3, cola3);
							bank.startATM(4, cola4);
							break;
						case "5": // 5 cajeros => 5 colas
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola1.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola2.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola3.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola4.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							randomUserAmount = (int) (Math.random() * (6 - 1)) + 1;
							for (int i = 0; i <= randomUserAmount; i++) {
								cola5.push(transactionArray[(int) (Math.random() * 3)]); // Agregar un nodo con una
																							// transacción
							}
							// Iniciar hilos con colas
							bank.startATM(1, cola1);
							bank.startATM(2, cola2);
							bank.startATM(3, cola3);
							bank.startATM(4, cola4);
							bank.startATM(5, cola5);
							break;
						}
						break;
					default:
						JOptionPane.showMessageDialog(null, "Error");
						break;
					}
				} else {
					JOptionPane.showMessageDialog(null, "Debe ingresar un número del 1 al 3");
				}

				// Ejecutar colas y cajeros

				/*
				 * for (int i = 1; i <= Integer.parseInt(numATM); i++) { bank.startATM((int)
				 * (Math.random() * (10 - 3)) + 3, i); }
				 */
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
