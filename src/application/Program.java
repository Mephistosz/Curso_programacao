package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product  data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.println("Deseja adicionar quantidade? ");
		String validarQnt = sc.next();
		Product product;
		if (validarQnt == "Sim" || validarQnt == "S") {
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			product = new Product(name, price, quantity);
		} else {
			product = new Product(name, price);
		}
		System.out.println(product);
		System.out.println();

		product.setName("Computer");
		System.out.println("Update name " + product.getName());
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");

		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}
}