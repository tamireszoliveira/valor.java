package controller;

public class valorController {
	/* 2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
	tamanho do vetor e o valor da úl�ma posição do vetor como o primeiro menor valor, retorne o menor
	valor con�do neste vetor.
	O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
	O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos; */
	
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