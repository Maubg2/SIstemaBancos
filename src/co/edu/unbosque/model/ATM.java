package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import co.edu.unbosque.view.MainView;

public class ATM extends Thread {

	// private int time;
	private int numATM;
	private Cola actualLine;
	private MainView view;
	private long initTime;
	private long endTime;
	private long workTime;
	private int contador;
	// Estadisticas generales
	public static int totalCustomers = 0;
	public static long totalTime = 0;
	public static int[] totalTransactions = new int[4];
	// Estructura de datos para almacenar los nombres de las transacciones atendidas
	private ArrayList<String> transactions;

	public ATM(int atm, Cola cola, MainView view) {
		// this.time = time;
		this.numATM = atm;
		this.actualLine = cola;
		this.view = view;
		contador = 0;
		transactions = new ArrayList<>();
	}

	public void run() {
		// Mostrar cantidad de elementos

		// Pop a la cola
		initTime = System.currentTimeMillis();
		Node cliente = actualLine.pop();
		System.out.println();
		view.sysoToJTextArea("\n");
		view.sysoToJTextArea("Cajero " + this.numATM + " atendiendo cliente.." + "\nTransacción: "
				+ cliente.getTransaction() + "\nTiempo estimado: " + cliente.getTime() + " minutos");
		view.sysoToJTextArea("\n");
		contador++;
		totalCustomers++;
		transactions.add(cliente.getTransaction());
		switch (cliente.getTransaction()) {
		case "retiro":
			totalTransactions[0]++;
			break;
		case "consignacion":
			totalTransactions[1]++;
			break;
		case "pago":
			totalTransactions[2]++;
			break;
		case "chequeGerencia":
			totalTransactions[3]++;
			break;
		}
		while (cliente != null) {
			try {
				sleep(cliente.getTime() * 1000);
				cliente = actualLine.pop();
				view.sysoToJTextArea("Cajero: " + this.numATM + " atendiendo cliente.." + "\nTransacción: "
						+ cliente.getTransaction() + "\nTiempo estimado: " + cliente.getTime() + " minutos");
				view.sysoToJTextArea("\n");
				transactions.add(cliente.getTransaction());
				contador++;
				totalCustomers++;
				switch (cliente.getTransaction()) {
				case "retiro":
					totalTransactions[0]++;
					break;
				case "consignacion":
					totalTransactions[1]++;
					break;
				case "pago":
					totalTransactions[2]++;
					break;
				case "chequeGerencia":
					totalTransactions[3]++;
					break;
				}

				// die = true;
			} catch (InterruptedException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				// Estadísticas
				endTime = System.currentTimeMillis();
				workTime = (endTime - initTime) / 1000;
				totalTime += workTime;
				transactions.sort(Collections.reverseOrder()); // Ordenar descendentemente
				Set<String> parsedTransactions = new LinkedHashSet<>(transactions); // Eliminar elementos duplicados
				view.sysoToJTextArea("FIN CAJERO " + this.numATM + " en " + workTime + " minutos\n"
						+ "Cantidad de clientes atendidos: " + contador + "\nTransacciones realizadas:");
				for (String x : parsedTransactions) {
					view.sysoToJTextArea(x);
				}
				view.sysoToJTextArea("-------------------");
				view.sysoToJTextArea("Total clientes atendidos al momento: " + totalCustomers);
				view.sysoToJTextArea("Total tiempo de simulación al momento: " + totalTime + " segundos");
				view.sysoToJTextArea("Cantidad total por transacción realizada: ");
				view.sysoToJTextArea("Retiros: " + totalTransactions[0] + "\nConsignaciones: " + totalTransactions[1]
						+ "\nPagos: " + totalTransactions[2] + "\nCheques de gerencia: " + totalTransactions[3]);

			}
		}
	}

}
