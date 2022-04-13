package views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import controllers.CarrinhoController;
import controllers.ClienteController;
import controllers.ProdutoController;
import models.Carrinho;

public class TesteCarrinho {

	public static void main (String args[]) throws ParseException{

		
		cadastrarCliente();
		
		cadastrarProduto();
		
		cadastrarItemCarrinho();
	}
	
	public static void cadastrarCliente() throws ParseException {
		
		ClienteController clientController = new ClienteController();
		String name = JOptionPane.showInputDialog("Informe seu nome:");
		String return_date = JOptionPane.showInputDialog("Informe a data de Nascimento:");
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(return_date);
		String cpf = JOptionPane.showInputDialog("Informe seu CPF:");
		String address = JOptionPane.showInputDialog("Informe seu Endereço:");
		String mobile_phone = JOptionPane.showInputDialog("Informe seu Celular:");
		
		clientController.addCliente(name, date, cpf, address, mobile_phone);
		
		System.out.println(clientController);
	}
	
	public static void cadastrarProduto() {
		ProdutoController productController = new ProdutoController();
		String name = JOptionPane.showInputDialog("Informe seu nome:");
		Double price = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preço:"));
		Double storage = Double.parseDouble(JOptionPane.showInputDialog("Informe o Estoque:"));
		productController.addProduto(name, price, storage);
	}
	
	public static void cadastrarItemCarrinho() {
		
		Carrinho cart = new Carrinho();
		cart.getClient().getName();
		
		
		CarrinhoController cartController = new CarrinhoController();
		Double quantity = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade:"));
		Double unitPrice = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preço Unitario:"));
		
		cartController.addItem(cart, product, quantity, unitPrice);
		
		System.out.println(cartController);
	}
}
