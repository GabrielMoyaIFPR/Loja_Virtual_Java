package models;

import java.util.Date;

public class Cliente {
	
	private int id;
	private String name;
	private Date dt_nasc;
	private String cpf;
	private String address;
	private String mobile_phone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDt_nasc() {
		return dt_nasc;
	}
	public void setDt_nasc(Date dt_nasc) {
		this.dt_nasc = dt_nasc;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	
	@Override
	public String toString() {
		return "ID:" + getId() 
		+"\n Cliente:" + getName()
		+ "\n Data Nascimento:" + getDt_nasc()
		+ "\n CPF:" + getCpf()
		+ "\n Endereço:" + getAddress()
		+ "\n Celular:" + getMobile_phone();
	}
	
}
