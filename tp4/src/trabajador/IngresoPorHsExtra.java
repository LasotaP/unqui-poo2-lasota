package trabajador;

public class IngresoPorHsExtra extends Ingreso{
	
	double cantHsExtra;

	public IngresoPorHsExtra(String mes, String concepto, double montoPercibido, double cantHsExtra) {
		super(mes, concepto, montoPercibido);
		this.cantHsExtra = cantHsExtra;
	}

}
