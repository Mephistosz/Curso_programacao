package curso_programacao;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.OrderEnum;
import entities.OrderItem;
import entities.Product_cap13;
import entities.enums.OrderStatus;

public class ProgramExercicioFixacaoEnum {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String data = sc.nextLine();

		Client c1 = new Client(nome, email, data);

		System.out.println("Enter order data:");
		System.out.print("Status ");
		String status = sc.next();

		OrderEnum pedidoCompleto = new OrderEnum(new Date(), OrderStatus.valueOf(status), c1);

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Enter #%d item data: \n", i);
			System.out.print("Product Name: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			Product_cap13 produto = new Product_cap13(nomeProduto, price);
			System.out.print("Quantity: ");
			int quantidade = sc.nextInt();
			OrderItem pedido = new OrderItem(quantidade, produto);
			pedidoCompleto.addOrderItem(pedido);
		}

		System.out.println(pedidoCompleto);
		sc.close();
	}
}
