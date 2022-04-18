package models;

public class Produto {
	private int id;
	private String name;
	private double price;
	private double storage;
	
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getStorage() {
		return storage;
	}
	public void setStorage(double storage) {
		this.storage = storage;
	}
	
	@Override
	public String toString() {
		return "ID:" + getId() 
		+"\n Nome do Produto:" + getName()
		+ "\n Preço:" + getPrice()
		+ "\n Estoque:" + getStorage();
	}
	
}
