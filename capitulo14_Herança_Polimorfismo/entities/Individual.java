package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	@Override
	public Double tax() {
		if (anualIncome < 20000.00)
			return anualIncome * 0.15;
		else if (healthExpenditures == 0) {
			return anualIncome * 0.25;
		} else {
			return anualIncome * 0.25 - (healthExpenditures * 0.50);
		}
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Individual() {
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
}
