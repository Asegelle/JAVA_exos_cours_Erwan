package fr.ibformation.poo.todolist.bo;

public class Product {
	private int id;
	private String name;
	private int quantity;
	
	public Product(int idParam, String nameParam, int quantityParam) {
		this.id = idParam;
		this.name = nameParam;
		this.quantity = quantityParam;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}
	
}
