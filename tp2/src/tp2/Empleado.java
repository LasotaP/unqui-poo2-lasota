package tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
	String nombre;
	String direc;
	int estCivil; // 1)Soltero/a - 2) Casado
	LocalDate fecNac;
	double sueldoBasico;
	double porcentajeOS = 10;
	double porcentajeAP;

	// CONSTRUCTOR, ASI SE HACE
	public Empleado(String nombre,String direc, int estCivil, LocalDate fecNac, double sueldoBasico) {
		this.nombre = nombre;
		this.direc = direc;
		this.estCivil = estCivil;
		this.fecNac = fecNac;
		this.sueldoBasico = sueldoBasico;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDirec() {
		return this.direc;
	}
	
	public int edad() {
		Period periodo = Period.between(this.fecNac, LocalDate.now());
		return  periodo.getYears();
	}
	
	public double obraSocial() {
		return (this.sueldoBruto() * this.porcentajeOS) / 100;
	}
	
	public double aportesJubilatorios() {
		return (this.sueldoBruto() * this.porcentajeAP) / 100;
	}
	
	public abstract double sueldoBruto();
	
	public double retenciones() {
		return this.aportesJubilatorios() + this.obraSocial();
	}
	
	public double sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	public String estadoCivil() {
		String estadoCivil = "Soltero";
		if (this.estCivil == 2) {
			estadoCivil = "Casado";
		}
		return estadoCivil;
	}
}
