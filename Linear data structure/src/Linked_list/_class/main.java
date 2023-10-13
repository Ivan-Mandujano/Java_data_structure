package Linked_list._class;

public class main {
	public static void main(String[] args) {
		linked_list lista = new linked_list();
        lista.Print();
        lista.add("Primer dato");
        lista.add("Segundo dato");
        lista.add("Tercer dato");
        lista.add("Cuarto dato");
		lista.Print();
		lista.Pop();
		lista.add("cuarto dato 2");
		lista.Print();
		System.out.println(lista.Search_Pos(2));
		System.out.println(lista.Search_Data("cuarto dato 2"));


	}
}
