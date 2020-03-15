package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoVetor;

public class VetorExercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ProdutoVetor[] vect = new ProdutoVetor[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new ProdutoVetor(nome, preco);
		}

		double sum = 0;
		double avg = 0;

		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPreco();
			if (i == vect.length - 1)
				avg = sum / vect.length;
		}

		System.out.printf("A média dos preços é: %.2f reais", avg);

		sc.close();
	}

}
