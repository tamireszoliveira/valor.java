package view;

import controller.valorController;
	/* 2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
	tamanho do vetor e o valor da úl�ma posição do vetor como o primeiro menor valor, retorne o menor
	valor con�do neste vetor.
	O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
	O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos; */
public class main {
	public static void main(String [] args) {
		int [] vetor = {50, 89, 3, 7, 5};
		int menor = vetor[vetor.length - 1];
		valorController vc = new valorController();
		System.out.println("o menor valor é: " + vc.valor(vetor, vetor.length, menor));
	}
}
