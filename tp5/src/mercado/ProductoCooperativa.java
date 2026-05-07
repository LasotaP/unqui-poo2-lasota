package mercado;

public class ProductoCooperativa extends Producto {

	private double porcentaje;
	
	public ProductoCooperativa(double precio, int stock, double porcentaje) {
		super(precio, stock);
		this.porcentaje = porcentaje;
	}
	
	@Override
	double getPrecio() {
		// TODO Auto-generated method stub
		return super.getPrecio() * (1-this.porcentaje/100);
	}


}
