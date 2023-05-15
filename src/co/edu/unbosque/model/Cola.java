package co.edu.unbosque.model;

public class Cola {

	Node startC;
	Node finalC;

	public Cola() {
		startC = null;
		finalC = null;
	}

	public void push(String str) {
		Node newNode = new Node(str);
		newNode.setNext(null);
		if (startC == null) {
			startC = newNode;
			finalC = newNode;
		} else {
			finalC.setNext(newNode);
			finalC = newNode;
		}
	}

	public void pop() {
		if (startC != null) {
			if (startC == finalC) {
				startC = null;
				finalC = null;
			} else {
				startC = startC.getNext();
			}
		}
	}

	public void peek() {
		Node aux = startC;
		while (aux != null) {
			System.out.print("[" + aux.getTransaction() + "]");
			aux = aux.getNext();
		}
	}

}
