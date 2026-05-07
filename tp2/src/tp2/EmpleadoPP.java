package tp2;

import java.time.LocalDate;

public class EmpleadoPP extends Empleado{
	

	double cantHijos;
	double montoXhijoXAsig = 150;
	double montoXhijoXOS = 25;
	double montoXConyu = 100;
	double antiguedad;
	double montoXAnio = 50;
	double porcentajeAP = 15;
	
	public EmpleadoPP(String nombre, String direc, int estCivil, LocalDate fecNac) {
		super(nombre, direc, estCivil, fecNac);
		// TODO Auto-generated constructor stub
	}
	
	public double asigXHijo() {
		return this.montoXhijoXAsig*this.cantHijos;
	}
	
	public double asigXConyugue() {
		return (this.estCivil == 1) ? this.montoXConyu : 0;
	}
	
	public double salarioFamiliar() {
		return this.asigXHijo()+this.asigXConyugue();
	}
	
	public double salarioAntigu() {
		return this.montoXAnio*this.antiguedad;
	}

	@Override
	public double sueldoBruto() {
		return this.sueldoBasico + this.salarioFamiliar() + this.salarioAntigu();
	}
	
	@Override
	public double obraSocial() {
		return super.obraSocial()+(this.montoXhijoXOS*this.cantHijos);
	}
	
}
