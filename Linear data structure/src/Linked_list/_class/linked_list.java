package Linked_list._class;

public class linked_list {
	//The head of the list
	private Node head;
	//Constructor
	public linked_list(){
		head = null;
	}
	//Methods
    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
        	head = newNode;
        } else {
        	newNode.setNext(head);
            head = newNode;
        }
    } 
    public void Print() {
    	System.out.println("Primer dato: " + head.getData());
    	//Get the next node
    	Node siguiente = new Node(head.getNext());
    	System.out.println("Segundo dato: "+ siguiente);
    }
}
