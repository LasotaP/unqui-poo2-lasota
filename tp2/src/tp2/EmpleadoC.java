package tp2;

public class EmpleadoC extends Empleado{
	int numContrato;
	String medioDePago; // 1) Efectivo - 2) Deposito
	double gastosAdmContractuales = 50; // retencion extra del empleado contratado
	
	
	@Override
	public double sueldoBruto() {
		return this.sueldoBasico;
	}
	
	@Override
	public double retenciones() {
		return this.gastosAdmContractuales;
	}
	
	
	
}
