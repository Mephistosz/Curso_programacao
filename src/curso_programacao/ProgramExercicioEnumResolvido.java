package curso_programacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ProgramExercicioEnumResolvido {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String departamento = sc.nextLine();

		System.out.println("Enter worker data: ");

		System.out.print("Name: ");
		String nome = sc.nextLine();

		System.out.print("Level: ");
		String workerlevel = sc.nextLine();

		System.out.print("Base salary:");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(nome, WorkerLevel.valueOf(workerlevel), baseSalary, new Department(departamento));

		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Enter contract # " + i + " data:");

			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());

			System.out.print("Value per hour: ");
			double valorPorHora = sc.nextDouble();

			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();

			HourContract contract = new HourContract(contractDate, valorPorHora, hours);
			worker.addContract(contract);
		}
		System.out.println(worker.getContratos());
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println("Name: " + worker.getNome());
		System.out.println("Department: " + worker.getDepartamento().getNome());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		sc.close();
	}
}