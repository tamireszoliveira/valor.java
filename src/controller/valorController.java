package controller;

public class valorController {
	
	
	public valorController() {
		super();
	}
	public int valor(int[] vetor, int tamanho, int menor) {
		// a condição de parada é a primeira posição do vetor
		if ( tamanho == 0) {
			return menor; 
		} else {
			// atualiza o menor valor caso o valor do tamanho atual seja menor
			if(vetor[tamanho - 1] < menor) {
				menor = vetor[tamanho - 1];
			}
			// chamada da função com o prox valor
			return valor(vetor, tamanho -1, menor);
		}
		
	}
}