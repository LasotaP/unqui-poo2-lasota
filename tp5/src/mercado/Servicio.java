package mercado;

public class Servicio extends Factura{

	private double costoXUnidad;
	private double cantUnidades;
	
	public Servicio(double costoXU, double cantXU) {
		this.costoXUnidad = costoXU;
		this.cantUnidades = cantXU;
	}
	
	@Override
	double totalAPagar() {
		return this.costoXUnidad * this.cantUnidades;
	}

}
