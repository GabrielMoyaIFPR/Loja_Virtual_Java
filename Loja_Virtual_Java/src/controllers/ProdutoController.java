package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Produto;

public class ProdutoController {
	private List<Produto> products = new ArrayList<Produto>();
	
	
	
	public  void addProduto(String name,double price,double storage) 
	{
		int id=0;
		Produto product = new Produto ();
		product.setId(id);
		id++;
		product.setName(name);
		product.setPrice(price);
		product.setStorage(storage);
	}
		
	public String resultProducts(){
		int i;
		String data = "";
		for(i=0; i < products.size() ; i++) {
			data = "ID: \n" + products.get(i).getId() 
			+ "Nome: \n" + products.get(i).getName()
			+ "\n Preço: \n" + products.get(i).getPrice()
			+ "\n Estoque: \n" + products.get(i).getStorage();
		} 
		return data;
	}

	@Override
	public String toString() {
		return resultProducts();
				
	}
	
}
