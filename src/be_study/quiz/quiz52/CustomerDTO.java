package be_study.quiz.quiz52;

import java.util.ArrayList;
import java.util.List;

public class CustomerDTO {
	int id;
	String name;
	List<Contact> contacts;
	Address address;
	List<Order> orders;
	
	public CustomerDTO() {
		super();
		this.contacts = new ArrayList<>();
		this.orders = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void addContact(Contact contact) {
		this.contacts.add(contact);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(Order order) {
		this.orders.add(order);
	}

	@Override
	public String toString() {
		return "CustomerDTO \n[\n id=" + id + ",\n name=" + name + ",\n contacts=" + contacts + ",\n address=" + address
				+ ",\n orders=" + orders + "\n]";
	}
	
}
