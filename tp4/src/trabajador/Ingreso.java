package trabajador;

public class Ingreso {
	String mes;
	String concepto;
	double montoPercibido;
	
	public Ingreso(String mes, String concepto, double montoPercibido) {
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public double getMontoPercibido() {
		return this.montoPercibido;
	}
}
