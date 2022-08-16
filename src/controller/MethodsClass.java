package controller;

public class MethodsClass {
	
	
	public MethodsClass() {
		super();
	}
	
	public int fatorial(int numero) {
		if(numero <= 1) {
			return 1;
		}
		return numero * fatorial(numero - 1);
	}
	
	public int vetorNegativo(int[] vetor, int index) {
		if(index == 0) {
			return 0;
		}
		
		if(vetor[index - 1] < 0) {
			return 1+vetorNegativo(vetor, index - 1);
		}
		
		return vetorNegativo(vetor, index - 1);
	}
	
	public String stringInvertida(String palavra, int index) {
		if(index == 0) {
			return "";
		}
		return palavra.substring(index-1, index)+stringInvertida(palavra, index - 1);
	}

}
