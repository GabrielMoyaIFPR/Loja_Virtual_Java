package models;

public class CarrinhoItens {

	private int id;
	private Carrinho cart;
	private Produto product;
	private double quantity;
	private double unitPrice;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Carrinho getCart() {
		return cart;
	}
	public void setCart(Carrinho cart) {
		this.cart = cart;
	}
	public Produto getProduct() {
		return product;
	}
	public void setProduct(Produto product) {
		this.product = product;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double total_price) {
		this.unitPrice = total_price;
	}
	
	@Override
	public String toString() {
		return "ID:" + getId() 
		+"Produto" + product.getName() 
		+ "Carrinho:" + cart.getClient() 
		+ "Quantidade:" + getQuantity() 
		+ "Valor Unitario:" + getUnitPrice()
		+ "Produto:" + getProduct();
	}
}