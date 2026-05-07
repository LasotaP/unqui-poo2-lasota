package tp2;
import java.util.HashSet;
import java.util.Set;

public class Empresa {
	String nombre;
	String cuit;
	Set<Empleado> empleados = new HashSet<>();
	
	public Empresa() {
		// TODO Auto-generated constructor stub
	}
	
	public Empresa empresa = new Empresa ();
	
	public double sueldosNTotal() {
		double total = 0;
		for (Empleado empleado : empleados) {
			total += empleado.sueldoNeto();
		}
		return total;
	}
	
	public double sueldosBTotal() {
		double total = 0;
		for (Empleado empleado : empleados) {
			total += empleado.sueldoBruto();
		}
		return total;
	}
	
	public double retencionesTotal() {
		double total = 0;
		for (Empleado empleado : empleados) {
			total += empleado.retenciones();
		}
		return total;
	}
	
	public void liquidarIndv(Empleado empleado) {
		System.out.println("----- RECIBO DE HABERES -----");
		System.out.println("Nombre: "+empleado.nombre);
		System.out.println("Direccion: "+empleado.direc);
		System.out.println("Estado Civil: "+empleado.estadoCivil());
	}
	
}
