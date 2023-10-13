package Linked_list._class;

public class Node {
	//Atributos
	private Object data;
	private Node next;
	//Constructores
	public Node(Object data) {
		this.data = data;
		this.next = null;
	}
	//Metodos
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}