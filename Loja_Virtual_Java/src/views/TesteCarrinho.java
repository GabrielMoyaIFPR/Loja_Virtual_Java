package views;

import controllers.CarrinhoController;
import models.Carrinho;
import models.Cliente;
import models.Produto;

public class TesteCarrinho {

	public static void main (String args[]) {
		Cliente client = new Cliente();
		client.setCpf("12345678910");
		client.setName("Moya");
		
		Produto product = new Produto();
		product.setName("Teclado");
		product.setPrice(100.99);
		product.setStorage(10);
		
		Carrinho cart = new Carrinho();
		cart.setClient(client);
		
		CarrinhoController cartController = new CarrinhoController();
		cartController.addItem(cart, product, 2.0, 33.99);
		
		System.out.println(cartController);
	}
}
