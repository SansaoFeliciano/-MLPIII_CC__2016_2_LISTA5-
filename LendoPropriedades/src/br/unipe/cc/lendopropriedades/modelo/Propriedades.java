package br.unipe.cc.lendopropriedades.modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Propriedades {
	
	Properties propriedades = new Properties();
	
	public void lerArquivo(){
		
		Scanner ler = new Scanner(System.in);
		String op;
		int ok = 0;
		String[] chave;
		String url;
		String dataBase;
		String usuario;
		String senha;
		String porta;
		
		while (ok == 0){
		System.out.printf("Informe o nome do arquivo texto:\n");
	    String nome = ler.nextLine();
	    
	    try {
	      FileReader arq = new FileReader(nome);
	      BufferedReader lerArq = new BufferedReader(arq);
	 
	      String linha = lerArq.readLine(); // lê a primeira linha
	      chave = linha.split("=");
	    
	     propriedades.put(chave[0], chave[1]);
	      
	// a variável "linha" recebe o valor "null" quando o processo
	// de repetição atingir o final do arquivo texto
	      while (linha != null) {
	        linha = lerArq.readLine();// lê da segunda até a última linha
	        try{
	        chave = linha.split("=");
		    propriedades.put(chave[0], chave[1]);}catch (NullPointerException e){
		    	
		    }
	      }
	      ok=1;
	      arq.close();
	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }
	    
	    if (ok == 1){
	    System.out.println("Propriedades lidas com sucesso!");
	    System.out.println("Exibir? 1-Sim 0-Não");
	    
	    op = ler.nextLine();
	    
	    if (op.equals("1")){
	   System.out.printf("\nPROPRIEDADES:\n");
	   url = propriedades.getProperty("conexao.url");
	   System.out.printf("\nUrl: %s\n",url);
	   dataBase = propriedades.getProperty("conexao.database");
	   System.out.printf("Data Base: %s\n",dataBase);
	   usuario = propriedades.getProperty("conexao.usuario");
	   System.out.printf("Usuário: %s\n",usuario);
	   senha = propriedades.getProperty("conexao.senha");
	   System.out.printf("Senha: %s\n",senha);
	   porta = propriedades.getProperty("conexão.porta");
	   System.out.printf("Porta: %s\n",porta);
	   }
	   
	    }
	 
	}
 }
}
