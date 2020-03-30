package entities;

public class OutsourcedEmployee extends Employee {
	private Double additionalCharger;

	@Override
	public double payment() {
		return super.payment() + additionalCharger * 1.1;
	}

	public OutsourcedEmployee() {
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharger) {
		super(name, hours, valuePerHour);
		this.additionalCharger = additionalCharger;
	}

	public Double getAdditionalCharger() {
		return additionalCharger;
	}

	public void setAdditionalCharger(Double additionalCharger) {
		this.additionalCharger = additionalCharger;
	}
}
