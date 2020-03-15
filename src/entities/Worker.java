package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String nome;
	private WorkerLevel level;
	private Double baseSalary;

	private Department departamento;
	private List<HourContract> contratos = new ArrayList<>();

	public Worker() {
	}

	public Worker(String nome, WorkerLevel level, Double baseSalary, Department departamento) {
		this.nome = nome;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departamento = departamento;
	}

	public void addContract(HourContract contratos) {
		this.contratos.add(contratos);
	}

	public void removeContract(HourContract contratos) {
		this.contratos.remove(contratos);
	}

	public double income(int ano, int mes) {

		Calendar cal = Calendar.getInstance();
		double sum = baseSalary;

		for (HourContract c : contratos) {

			cal.setTime(c.getData());

			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);

			if (ano == c_ano && mes == c_mes) {
				sum += c.totalValue();
			}
		}
		return sum;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Department departamento) {
		this.departamento = departamento;
	}

	public List<HourContract> getContratos() {
		return contratos;
	}
}
