package supermercado;
import java.util.ArrayList;

public class Supermercado {
	String nombre;
	String direccion;;
	ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public void agregarProducto (Producto p) {
		productos.add(p);
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		return productos.stream().mapToDouble(Producto::getPrecio).sum();
	}
}
