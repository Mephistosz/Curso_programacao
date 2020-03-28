package entities;

public class Product_cap14 {
	protected String name;
	protected Double price;

	public String priceTag() {
		return name + " $ " + String.format("%.2f", price);
	}

	public Product_cap14() {
	}

	public Product_cap14(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
