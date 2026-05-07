package mercado;

public abstract class Producto {
	protected double precio;
	protected int stock;
	
	public Producto(double precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	double getPrecio(){
		return this.precio;
	}
	
	void restarStock() {
		this.stock--;
	}
	
	public int getStock() {
		return this.stock;
	}
}
