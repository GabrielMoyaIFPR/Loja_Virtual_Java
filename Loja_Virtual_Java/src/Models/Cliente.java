package Models;

import java.util.Date;

public class Cliente {
	
	private String name;
	private Date dt_nasc;
	private String cpf;
	private String address;
	private int mobile_phone;
	
	
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
	public int getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(int mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	
}
