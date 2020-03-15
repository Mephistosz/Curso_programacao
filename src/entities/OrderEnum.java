package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class OrderEnum {

	public static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date data;

	private OrderStatus status;
	private Client cliente;
	private List<OrderItem> pedido = new ArrayList<>();

	public Double total() {
		Double sum = 0.0;
		for (OrderItem orderItem : pedido) {
			sum += orderItem.subTotal();
		}
		return sum;
	}

	public OrderEnum() {
	}

	public OrderEnum(Date data, OrderStatus status, Client cliente) {
		this.data = data;
		this.status = status;
		this.cliente = cliente;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order SUMMARY: \n");
		sb.append("Order moment: " + sdf1.format(data) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + cliente + "\n");
		sb.append("Order items \n");
		for (OrderItem orderItem : pedido) {
			sb.append(orderItem + "\n");
		}
		sb.append("Total price: $" + total());

		return sb.toString();
	}

	public void addOrderItem(OrderItem pedido) {
		this.pedido.add(pedido);
	}

	public void removeOrderItem(OrderItem pedido) {
		this.pedido.remove(pedido);
	}

	public Client getCliente() {
		return cliente;
	}

	public Date getData() {
		return data;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
}
