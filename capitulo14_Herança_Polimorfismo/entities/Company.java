package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	@Override
	public Double tax() {
		if (numberOfEmployees < 11) {
			return anualIncome * 0.16;
		} else {
			return anualIncome * 0.14;
		}
	}

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Company() {
		super();
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
}
