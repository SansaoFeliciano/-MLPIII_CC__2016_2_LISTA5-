package br.unipe.cc.lendopropriedades.ui;

import br.unipe.cc.lendopropriedades.modelo.Propriedades;

public class Principal {
	
	public static void main(String[] args) {
		
		Propriedades propriedades = new Propriedades();
		
		propriedades.lerArquivo();
		
	}
	
	

}
