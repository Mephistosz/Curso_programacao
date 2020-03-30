package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product_cap14 {

	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date manufactureDate;

	@Override
	public String priceTag() {
		return name + " (used)" + " $ " + String.format("%.2f", price) + " (Manufacture date: "
				+ sdf.format(manufactureDate) + ")";
	}

	public UsedProduct() {
	}

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
}
