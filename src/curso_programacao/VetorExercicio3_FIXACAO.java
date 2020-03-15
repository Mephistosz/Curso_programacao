package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.QuartosVetor;

public class VetorExercicio3_FIXACAO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		QuartosVetor[] vect = new QuartosVetor[9];

		String nome, email;
		Integer room;
		if (n < vect.length) {
			for (int i = 0; i < n; i++) {
				System.out.println("Rent #1: ");
				sc.nextLine();
				System.out.print("Name: ");
				nome = sc.nextLine();

				System.out.print("Email:");
				email = sc.nextLine();

				System.out.print("Room: ");
				room = sc.nextInt();
				vect[room] = new QuartosVetor(nome, email, room);
			}
			System.out.println();
			System.out.println("Busy rooms:");
			for(QuartosVetor obj: vect) {
				if (obj != null)
					System.out.println(obj);
			}
		} else
			System.out.println("Quartos indisponíveis");

		sc.close();
	}

}
