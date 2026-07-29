package be_study.quiz.quiz52;

import java.util.ArrayList;
import java.util.List;

public class Order {
	String orderId;
	String date;
	List<Item> items;
	
	public Order() {
		super();
		this.items = new ArrayList<>();
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<Item> getItems() {
		return items;
	}

	public void addItems(Item item) {
		this.items.add(item);
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", date=" + date + ", items=" + items + "]";
	}
	
}
