package co.edu.unbosque.model;

public class ATM extends Thread {

	private boolean die = false;
	// private int time;
	private int numATM;
	private Cola actualLine;

	public ATM(int atm, Cola cola) {
		// this.time = time;
		this.numATM = atm;
		this.actualLine = cola;
	}

	public void run() {
		// Mostrar cantidad de elementos

		// Pop a la cola
		Node cliente = actualLine.pop();
		System.out.println();
		System.out.println("Cajero: " + this.numATM + " atendiendo cliente.." + "\nTransacción: "
				+ cliente.getTransaction() + "\nTiempo estimado: " + cliente.getTime());
		System.out.println();
		while (cliente != null) {
			try {
				sleep(cliente.getTime() * 1000);
				cliente = actualLine.pop();
				System.out.println("Cajero: " + this.numATM + " atendiendo cliente.." + "\nTransacción: "
						+ cliente.getTransaction() + "\nTiempo estimado: " + cliente.getTime());
				System.out.println();

				// die = true;
			} catch (InterruptedException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println("Fin cajero " + this.numATM);
			}
		}
		// Calcular tiempo final acumulado
		// System.out.println("Fin Cajero:" + this.numATM + " en:" + this.time + "
		// minutos");
	}

}
