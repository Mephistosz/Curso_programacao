package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;

public class ExercicioListaFixacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();

		List<EmployeeList> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.printf("Emplyoee %s:%n", i + 1);

			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();

			System.out.print("Name: ");
			String nome = sc.nextLine();

			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			System.out.println();
			list.add(new EmployeeList(id, nome, salary));
		}
		System.out.println("List of employees: ");
		for (EmployeeList x : list) {
			System.out.println(x);
		}

		System.out.println("Enter the employee id that will have salary increase : ");
		int idCheck = sc.nextInt();
		EmployeeList emp = list.stream().filter(x -> x.getId() == idCheck).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();

			emp.increaseSalary(percentage);
		}

		System.out.println("List of employees: ");
		for (EmployeeList x : list) {
			System.out.println(x);
		}

		sc.close();
	}
}
