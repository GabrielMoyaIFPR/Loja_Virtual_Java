package Controllers;

import java.util.ArrayList;
import java.util.List;

import Models.Carrinho;
import Models.CarrinhoItens;
import Models.Produto;

public class CarrinhoController {
	private List<CarrinhoItens> cartItens = new ArrayList<CarrinhoItens>();
	
	public  void addItem(Carrinho cart,Produto product, Double quantity, double unitPrice ) {
		
		CarrinhoItens itens = new CarrinhoItens();
		itens.setCart(cart);
		itens.setProduct(product);
		itens.setQuantity(quantity);
		itens.setUnit_price(unitPrice);
		cartItens.add(itens);
		
	}
	
	public  void removeItem(Carrinho cart,Produto product, Double quantity, double unitPrice ) {
		
		
	}
	
	
	@Override
	public String toString() {
		//descricao de cada produto
		//quantidade adicionada
		//valor unitario
		//valor total
		//mostrar o cliente
		return "";
	}
	
}
