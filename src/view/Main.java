package view;

import controller.MethodsClass;

public class Main {
	
	public static void main(String[] args) {
		MethodsClass m = new MethodsClass();
		
		fatorial(m);
		vetorNegativo(m);
		stringInvertida(m);
	}
	
	public static void fatorial(MethodsClass m) {
		int resultado = m.fatorial(7);
		System.out.println(resultado);
	}
	
	public static void vetorNegativo(MethodsClass m) {
		int[] vetor = {1, -1, 1, -1, 1, 1, -1};
		int resultado =  m.vetorNegativo(vetor, vetor.length);
		System.out.println(resultado);
	}
	
	public static void stringInvertida(MethodsClass m) {
		String palavra = "ko321";
		String resultado = m.stringInvertida(palavra, palavra.length());
		System.out.println(resultado);
	}

}
