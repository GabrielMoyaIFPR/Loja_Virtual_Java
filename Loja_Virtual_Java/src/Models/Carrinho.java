package Models;

import java.util.Date;

public class Carrinho {
	
	private Date BuyDate = new Date();
	private Cliente client;
	
	public Date getBuyDate() {
		return BuyDate;
	}
	public Cliente getClient() {
		return client;
	}
	public void setClient(Cliente client) {
		this.client = client;
	}
	
}
