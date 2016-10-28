import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
	Scanner leitor = new Scanner(System.in);
	String tecla = null;
	long inicio;
	int total;
	long fim;
	long tempo;

	
public void testLinkedList(){

System.out.printf("\nTeste de Inserção em uma LinkedList:");

List <Integer> teste =	new LinkedList<>();
inicio =	System.currentTimeMillis();
total	=	30000;
for(int i	=	0;	i	<	total;	i++)	{
teste.add(i);
}
fim	=	System.currentTimeMillis();
tempo	=	fim	- inicio;

System.out.printf("\nTempo gasto na inserção de 30000 numeros na linkedlist: %d",tempo);

System.out.printf("\n\nTeste de Pesquisa em uma LinkedList:");
inicio =	System.currentTimeMillis();
for(int i	=	0;	i	<	total;	i++)	{
teste.contains(i);
}
fim	=	System.currentTimeMillis();
tempo	=	fim	- inicio;
System.out.printf("\nTempo gasto na pesquisa de 30000 numeros na linkedlist: %d",tempo);
}

public void testTreeSet(){
System.out.printf("\n\nTeste de Inserção em uma TreeSet:");

Set <Integer> teste1 =	new TreeSet<>();
inicio =	System.currentTimeMillis();
total	=	30000;
for(int i	=	0;	i	<	total;	i++)	{
teste1.add(i);
}
fim	=	System.currentTimeMillis();
tempo	=	fim	- inicio;

System.out.printf("\nTempo gasto na inserção de 30000 numeros na TreeSet: %d",tempo);

System.out.printf("\n\nTeste de Pesquisa em uma TreeSet:");
inicio =	System.currentTimeMillis();
for(int i	=	0;	i	<	total;	i++)	{
teste1.contains(i);
}
fim	=	System.currentTimeMillis();
tempo	=	fim	- inicio;
System.out.printf("\nTempo gasto na pesquisa de 30000 numeros na TreeSet: %d",tempo);
}
}
