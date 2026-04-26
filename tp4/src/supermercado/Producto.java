package supermercado;

public class Producto {
	String nombre;
	double precio;
	boolean isPrecioCuidado = false;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre, double precio, boolean isPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.isPrecioCuidado = isPrecioCuidado;
		
	}
	
	public void aumentarPrecio(double act) {
		this.precio += act;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean esPrecioCuidado() {
		return isPrecioCuidado;
	}
	
	public double getPrecio() {
		return precio;
	}
}
