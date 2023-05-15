package co.edu.unbosque.model;

public class ATM extends Thread{
	
	private boolean die = false;
	private int time;
	private int numATM;

	public ATM(int time, int atm) {
		this.time = time;
		this.numATM = atm;
	}

	public void run() {
		System.out.println("Cajero:"+ this.numATM+ " atendiendo cliente..");
		while (!die) {
			try {
				sleep(this.time * 1000);
				die = true;
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Fin Cajero:"+this.numATM + " en:"+this.time+" minutos");
	}

}
