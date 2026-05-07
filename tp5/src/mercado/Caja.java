package mercado;


public class Caja implements Agencia{
	
	private double totalAPagar;
	
	public void hacerPip(Producto prod) {
		prod.restarStock();
		totalAPagar += prod.getPrecio();
	}
	
	
	public double totalAPagar() {
		return this.totalAPagar;
	}

	@Override
	public void registrarPago(Factura factura) {
		this.totalAPagar += factura.totalAPagar();
	}

}
