package Linked_list._class;

public class linked_list {
	//The head of the list
	private Node head;
	//Constructor
	public linked_list(){
		head = null;
	}
	//Methods
    public int List_size() {
    	if (head==null) {
    		return -1;
    	}else {
    		Node newNode = head;
    		int i = 0;
	    	do {
	    		newNode = newNode.getNext();
	    		i++;
	    	}while(newNode!=null);
	    	return i;
    	}
    }
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
    	if (head==null) {
    		System.out.println("Error: No data in the list");
    	}else {
    		Node newNode = head;
    		int i = 0;
	    	do {
	    		Object data = newNode.getData();
	    		System.out.println("Position " + i + ": " + data);
	    		newNode = newNode.getNext();
	    		i++;
	    	}while(newNode!=null);
    	}
    }
    public Object Search_Pos(int pos) {
    	if (head==null) {
    		System.out.println("Error: No data in the list");
    	}else if(pos>List_size() || pos<0){
    		System.out.println("Error: Out of index");
    	}else {
    		Node newNode = head;
    		int i = 0;
    		boolean found = false;
	    	do {
	    		Object data = newNode.getData();
	    		newNode = newNode.getNext();
	    		if(i==pos) {
	    			found = true;
	    			return data;
	    		}
	    		i++;
	    	}while(newNode!=null && found == false);
    	}
		return -1;
    }
    public int Search_Data(Object searched) {
    	if (head==null) {
    		System.out.println("Error: No data in the list");
    	}else {
    		Node newNode = head;
    		int i = 0;
    		boolean found = false;
	    	do {
	    		Object data = newNode.getData();
	    		newNode = newNode.getNext();
	    		if(data==searched) {
	    			found = true;
	    			return i;
	    		}
	    		i++;
	    	}while(newNode!=null && found == false);
    	}
		return -1;
    }
    public void Pop() {
    	if (head==null) {
    		System.out.println("Error: No data in the list");
    	}else {
    		System.out.println("Pop from the list: "+ head.getData());
    		Node newNode = head.getNext();
            head.setNext(null);
    		head = newNode;
    	}
    }
}
