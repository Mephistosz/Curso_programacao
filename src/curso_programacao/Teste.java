package curso_programacao;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Teste {

	public static void main(String args[]) {

		int numeros[] = new int[3];

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		}

		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para crescente e 2 para decrescente"));

		if (opcao == 1) {

			Arrays.sort(numeros);

			for (int i = 0; i < numeros.length; i++) {
				System.out.println(numeros[i]);
			}

		}

		if (opcao == 2) {

			for (int i = 0; i < numeros.length; i++) {

				numeros[i] = -numeros[i];
			}

			Arrays.sort(numeros);

			for (int i = 0; i < numeros.length; i++) {

				numeros[i] = -numeros[i];
				System.out.println(numeros[i]);
			}
		}
	}
}
