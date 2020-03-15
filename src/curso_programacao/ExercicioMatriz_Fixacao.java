package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatriz_Fixacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Quantas linhas terá sua matriz? ");
		int n = sc.nextInt();
		System.out.println("Quantas colunas terá sua matriz? ");
		int m = sc.nextInt();
		int[][] mat = new int[n][m];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int N = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < mat[i].length; j++) {
				if (N == mat[i][j]) {

					System.out.println("Position: " + i + "," + j);

					if (j > 0)
						System.out.println("Left: " + mat[i][j - 1]);
					if (i > 0)
						System.out.println("Up: " + mat[i - 1][j]);
					if (j < mat[i].length - 1)
						System.out.println("Right: " + mat[i][j + 1]);
					if (i < mat.length - 1)
						System.out.println("Down: " + mat[i + 1][j]);
				}
			}
		}
		sc.close();
	}

}
