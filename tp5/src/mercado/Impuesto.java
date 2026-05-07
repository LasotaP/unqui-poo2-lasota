package mercado;

public class Impuesto extends Factura{

	private double tasaDeServicio;
	
	public Impuesto(double tasa) {
		this.tasaDeServicio = tasa;
	}
	
	@Override
	double totalAPagar() {
		return this.tasaDeServicio;
	}

}
