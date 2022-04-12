package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Carrinho;
import models.CarrinhoItens;
import models.Cliente;
import models.Produto;

public class CarrinhoController {
	private List<CarrinhoItens> cartItens = new ArrayList<CarrinhoItens>();
	
	public  void addItem(Carrinho cart,Produto product, Double quantity, double unitPrice ) {
		
		CarrinhoItens itens = new CarrinhoItens();
		itens.setCart(cart);
		itens.setProduct(product);
		itens.setQuantity(quantity);
		itens.setUnitPrice(unitPrice);
		cartItens.add(itens);
		
	}
	
	public  void removeItem(Carrinho cart,Produto product, Double quantity, double unitPrice ) {
		
		
	}
	
	public String result(){
		int i;
		String data = "";
		for(i=0; i < cartItens.size() ; i++) {
			data = "Produto: \n" + cartItens.get(i).getProduct().getName()
			+ "\nQuantidade: \n" + cartItens.get(i).getQuantity()
			+ "\nValor Unitario: \n" + cartItens.get(i).getUnitPrice()
			+ " \nUsuario: \n" + cartItens.get(i).getCart().getClient().getName();
		} return data;
	}

	@Override
	public String toString() {
		return result();
				
	}
	
}
