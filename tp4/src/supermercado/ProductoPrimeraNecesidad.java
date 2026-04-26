package supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	
	double porcentajeDescuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, double porcen) {
		super(nombre, precio);
		this.porcentajeDescuento = porcen;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean isPrecioCuidado, double porcen) {
		super(nombre, precio, isPrecioCuidado);
		this.porcentajeDescuento = porcen;
	}
	
	@Override
	public double getPrecio() {
		return precio - (precio * porcentajeDescuento) / 100;
	}
	
}
