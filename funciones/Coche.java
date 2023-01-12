package funciones;

public class Coche {

	public int numeroPuertas = 4;

	public Coche() {

	}

	public void incrementarNumeroDePuertas() {
		this.numeroPuertas++;
	}

	public static void main(String[] args) {
		Coche miCoche = new Coche();
		miCoche.incrementarNumeroDePuertas();
		miCoche.incrementarNumeroDePuertas();
		System.out.println(miCoche.numeroPuertas);
	}
}