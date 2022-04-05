package Models;

public class CarrinhoItens {

	private Carrinho cart;
	private Produto product;
	private double quantity;
	private double unit_price;
	
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
	public double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(double total_price) {
		this.unit_price = total_price;
	}
	
	
	
	
	
}
