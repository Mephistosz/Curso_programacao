package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class VetorExercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double sum = 0;
		double avg = 0;
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
			if (i == n - 1) {
				avg = sum / n;
			}
		}
		System.out.printf("%.2f", avg);
		sc.close();
	}

}
