import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String tecla = null;
		Test1 LinkedList_x_TreeSet = new Test1();
		Test2 ArrayList_x_TreeSet = new Test2();
		
		System.out.println("Iniciando teste de performanece de pesquisa...");

		System.out.printf("\nLINKED LIST X TREE SET");

		LinkedList_x_TreeSet.testLinkedList();
		LinkedList_x_TreeSet.testTreeSet();
	
	//TESTE ARRAY LIST X TREE SET
System.out.printf("\nIniciando teste de performanece de pesquisa...");
	
	System.out.printf("\n\nARRAYLIST X TREE SET");
	
	ArrayList_x_TreeSet.testInsercaoArrayList();
	LinkedList_x_TreeSet.testTreeSet();
	
	}
}
