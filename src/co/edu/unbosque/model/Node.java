package co.edu.unbosque.model;

public class Node {

	private int time;
	private String transaction;
	private Node next;

	public Node(String transaction) {
		this.transaction = transaction;
		next = null;

		switch (transaction) {
		case "retiro":
			time = (int) (Math.random() * (6 - 1) + 1);
			break;
		case "consignacion":
			time = (int) (Math.random() * (10 - 1) + 1);
			break;
		case "pago":
			time = (int) (Math.random() * (16 - 1) + 1);
			break;
		case "chequeGerencia":
			time = (int) (Math.random() * (24 - 1) + 1);
			break;
		default:
			time = 0;
			break;
		}
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
