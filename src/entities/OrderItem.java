package entities;

public class OrderItem {
	private Integer quantity;
	Double price;

	private Product_cap13 produto;

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Product_cap13 produto) {
		this.quantity = quantity;
		this.produto = produto;
	}

	public String toString() {
		return produto.getName() + " $" + getPrice() + ", " + "Quantity: " + quantity + ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}

	public Double subTotal() {
		return produto.getPrice() * this.quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product_cap13 getProduct() {
		return produto;
	}

	public void setProduct(Product_cap13 produto) {
		this.produto = produto;
	}
}
