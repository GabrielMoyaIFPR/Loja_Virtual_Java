package models;

import java.util.Date;

public class Carrinho {
	
	
	private Date BuyDate = new Date();
	public Cliente client;
	
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
		return "Cliente" + client.getName() + "Data da Compra" + getBuyDate();
	}
	
}
