package program;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product_cap14;
import entities.UsedProduct;

public class Exercicio5Ficacao {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product_cap14> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (type == 'i') {
				System.out.print("Customs fee: ");
				double customsfee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsfee));
			} else if (type == 'u') {
				System.out.print("Mannufacture date (DD/MM/YYYY) ");
				Date date = UsedProduct.sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			} else {
				list.add(new Product_cap14(name, price));
			}
		}

		for (Product_cap14 x : list) {
			System.out.println(x.priceTag());
		}

		sc.close();
	}
}
