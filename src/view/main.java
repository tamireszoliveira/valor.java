package view;

import controller.valorController;

public class main {
	public static void main(String [] args) {
		int [] vetor = {50, 89, 3, 7, 5};
		int menor = vetor[vetor.length - 1];
		valorController vc = new valorController();
		System.out.println("o menor valor é: " + vc.valor(vetor, vetor.length, menor));
	}
}
