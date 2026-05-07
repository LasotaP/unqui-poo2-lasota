package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mercado.Caja;
import mercado.Factura;
import mercado.Impuesto;
import mercado.Producto;
import mercado.ProductoCooperativa;
import mercado.ProductoTradicional;
import mercado.Servicio;

class CajaTest {

	private Caja caja1;

	private Producto arroz;
	private Producto leche;
	
	private Factura luz;
	private Factura abl;
	
	
	@BeforeEach
	void setUp(){
		
		//Declaracion de productos
		arroz = new ProductoTradicional(100, 8);
		leche = new ProductoCooperativa(90, 10, 10);
		
		//Declaracion de facturas
		luz = new Servicio(10, 5);
		abl = new Impuesto(40);
		
		
		
		caja1 = new Caja();
		caja1.hacerPip(arroz);
		caja1.hacerPip(leche);
		caja1.registrarPago(luz);
		caja1.registrarPago(abl);
		
	}

	@Test
	void precioTtest() {
		assertEquals(271,caja1.totalAPagar());
	}	
	@Test
	void stockTtest() {
		assertEquals(7,arroz.getStock());
		assertEquals(9,leche.getStock());
	}
}
