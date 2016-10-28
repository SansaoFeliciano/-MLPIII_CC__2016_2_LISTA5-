import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
	
	Scanner leitor = new Scanner(System.in);
	String tecla = null;
	long inicio;
	int total;
	long fim;
	long tempo;

	public void testInsercaoArrayList(){
		System.out.printf("\n\nTeste de Inserção em uma ArrayList:");
		
		List <Integer> teste2 =	new ArrayList<>();
		inicio =	System.currentTimeMillis();
		total	=	30000;
		for(int i	=	0;	i	<	total;	i++)	{
		teste2.add(i);
		}
		fim	=	System.currentTimeMillis();
		tempo	=	fim	- inicio;
		
		System.out.printf("\nTempo gasto na inserção de 30000 numeros na ArrayList: %d",tempo);
		
		
		System.out.printf("\n\nTeste de Pesquisa em uma ArrayList:");
		inicio =	System.currentTimeMillis();
		for(int i	=	0;	i	<	total;	i++)	{
		teste2.contains(i);
		}
		fim	=	System.currentTimeMillis();
		tempo	=	fim	- inicio;
		
		System.out.printf("\nTempo gasto na pesquisa de 30000 numeros na ArrayList: %d",tempo);
	}
}
