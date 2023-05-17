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

	public Node pop() {
		if (startC != null) {
			Node aux = startC;
			if (startC == finalC) {
				startC = null;
				finalC = null;
			} else {
				startC = startC.getNext();
			}
			return aux;
		}
		return null;
	}

	public void peek() {
		Node aux = startC;
		while (aux != null) {
			System.out.print("[" + aux.getTransaction() + "]");
			aux = aux.getNext();
		}
	}

}
