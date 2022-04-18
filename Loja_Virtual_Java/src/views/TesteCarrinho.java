package views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

import controllers.CarrinhoController;
import controllers.ClienteController;
import controllers.ProdutoController;
import models.Carrinho;
import models.Produto;

public class TesteCarrinho {

	public static void main (String args[]) throws ParseException{
		
		exibirMenu();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int opcao = input.nextInt();
		
		do {
			if(opcao==1) {
				cadastrarCliente();
				exibirMenu();
				opcao = input.nextInt();
			}
			if(opcao==2) {
				cadastrarProduto();
				exibirMenu();
				opcao = input.nextInt();
			}
			if(opcao==3) {
				cadastrarItemCarrinho();
				exibirMenu();
				opcao = input.nextInt();
			}
			if(opcao==4) {
				listarClientes();
				exibirMenu();
				opcao = input.nextInt();
			}
			if(opcao==5) {
				listarProdutos();
				exibirMenu();
				opcao = input.nextInt();
			}
			if(opcao==6) {
				listarItensCarrinho();
				exibirMenu();
				opcao = input.nextInt();
			}	
			
		}while(opcao != 0);
		
		System.out.println("Encerrando......");
		
	}
	
	public static void exibirMenu() {
		System.out.println( "Selecione uma das opçoes para iniciar: \n"
				+ "1 - Cadastrar Cliente \n"
				+ "2 - Cadastrar Produto \n"
				+ "3 - Adicionar item ao Carrinho \n"
				+ "4 - Listar Clientes \n"
				+ "5 - Listar Produtos \n"
				+ "6 - Listar itens do Carrinho\n"
				+ "0 - Sair");
		System.out.println("Digite sua Opcao:");
	}
	
	public static  ClienteController cadastrarCliente() throws ParseException {
		
		ClienteController clientController = new ClienteController();
		String name = JOptionPane.showInputDialog("Informe seu nome:");
		String return_date = JOptionPane.showInputDialog("Informe a data de Nascimento:");
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(return_date);
		String cpf = JOptionPane.showInputDialog("Informe seu CPF:");
		String address = JOptionPane.showInputDialog("Informe seu Endereço:");
		String mobile_phone = JOptionPane.showInputDialog("Informe seu Celular:");
		clientController.addCliente(name, date, cpf, address, mobile_phone);
		
		return clientController;
	}
	
	public static ProdutoController cadastrarProduto() {
		ProdutoController productController = new ProdutoController();
		String name = JOptionPane.showInputDialog("Informe o nome do Produto:");
		Double price = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preço:"));
		Double storage = Double.parseDouble(JOptionPane.showInputDialog("Informe o Estoque:"));
		productController.addProduto(name, price, storage);
		
		return productController;
	}
	
	public static CarrinhoController cadastrarItemCarrinho() {
		
		Carrinho cart = new Carrinho();
		cart.getClient().getName();
		
		Produto product = new Produto();
		product.setName(JOptionPane.showInputDialog("Informe o produto:"));
		
		CarrinhoController cartController = new CarrinhoController();
		Double quantity = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade:"));
		Double unitPrice = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preço Unitario:"));
		cartController.addItem(cart, product, quantity, unitPrice);
		
		return cartController;
		
	}
	
	public static void listarClientes() throws ParseException {
			String data = ClienteController.class.toString();
			System.out.println(data);
					
	}
	
	public static void listarProdutos() {
		String data = ProdutoController.class.toString();
		System.out.println(data);
				
	}
	public static void listarItensCarrinho() {
		String data = CarrinhoController.class.toString();
		System.out.println(data);
				
}
}
