package trabajador;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Trabajador {
	double porcentajeImpuesto;
	double montoImponible = 0;
	List<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public Trabajador(double porcentajeImpuesto) {
		this.porcentajeImpuesto = porcentajeImpuesto;
	}
	
	public void agregarIngreso(Ingreso ing) {
		this.ingresos.add(ing);
	}
	
	public double getTotalPercibido() {
		return this.ingresos.stream()
				.mapToDouble(i -> i.getMontoPercibido())
				.sum();
	}
	
	public double getMontoImponible() {
		return this.ingresos.stream()
				.filter(o -> o.getClass() == Ingreso.class)
				.mapToDouble(i -> i.getMontoPercibido())
				.sum();
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * (porcentajeImpuesto / 100);
	}
	
}
