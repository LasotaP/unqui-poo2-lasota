package tp2;

import java.util.Date;

public class EmpleadoPT extends Empleado{

	Date fechaFin;
	double cantHsExtra;
	double valorHsExtra = 40;
	double valorHsExtraAP = 40;
	double antiguedadOS = 25;
	double porcentajeAP = 10;

	
	public double horasExtra() {
		return this.cantHsExtra * this.valorHsExtra;
	}
	
	@Override
	public double sueldoBruto() {
		return this.sueldoBasico + this.horasExtra();
	}

	@Override
	public double obraSocial() {
		return super.obraSocial() + ((this.edad() > 50) ? this.antiguedadOS : 0);
	}
	
	@Override
	public double aportesJubilatorios() {
		return super.aportesJubilatorios() + (this.valorHsExtraAP * this.cantHsExtra);
	}


}
