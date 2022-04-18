package models;

import java.util.Date;

public class Carrinho {
	
	private int id;
	private Date BuyDate = new Date();
	public Cliente client;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getBuyDate() {
		return BuyDate;
	}
	public Cliente getClient() {
		return client;
	}
	public void setClient(Cliente client) {
		this.client = client;
	}
	
	@Override
	public String toString() {
		return "ID:" + getId() + "\n Cliente" + client.getName() + "\n Data da Compra" + getBuyDate();
	}
	
	
}
