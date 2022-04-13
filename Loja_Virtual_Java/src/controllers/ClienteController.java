package controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.Cliente;

public class ClienteController {
	private List<Cliente> clients = new ArrayList<Cliente>();
	
	
	
	public  void addCliente(String name
		,Date dt_nasc,String cpf,String address
		,String mobile_phone) 
	{
		Cliente client = new Cliente();
		client.setName(name);
		client.setDt_nasc(dt_nasc);
		client.setCpf(cpf);
		client.setAddress(address);
		client.setMobile_phone(mobile_phone);	
	}
		
	public String resultClients(){
		int i;
		String data = "";
		for(i=0; i < clients.size() ; i++) {
			data = "Nome: \n" + clients.get(i).getName()
			+ "\n Data de Nascimento: \n" + clients.get(i).getDt_nasc()
			+ "\nCPF: \n" + clients.get(i).getCpf()
			+ " \nCelular: \n" + clients.get(i).getMobile_phone()
			+ "\nEndereço: \n" + clients.get(i).getAddress();
		} return data;
	}

	@Override
	public String toString() {
		return resultClients();
				
	}
	
}
