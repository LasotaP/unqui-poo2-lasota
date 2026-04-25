package tp3;

public class Point {
	int x;
	int y;
	
	public void main(String[] args) {
        System.out.println("Iniciando prueba...");
        
        Point punto = new Point();
        
        // 3. Llamar a métodos y verificar resultados
        // objeto.metodoAProbar();    
        
        System.out.println("("+x+", "+y+")");
        System.out.println("Prueba finalizada.");
    }
	
	public Point(int h, int b) {
		x = h;
		y = b;
	}
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	public void mover(int h, int b) {
		x = h;
		y = b;
	}
	
	public void sumarPunto(int a, int c) {
		x += a;
		y += c;
	}
	
	
	
}
