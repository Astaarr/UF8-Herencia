package enunciado1;

// extends de la clase padre
public class Coche extends Vehiculo {
	// Iniciamos las variable
	int combustible;
	
	// Creamos constructor
	public Coche() {
		this.combustible = 0;
	}
	// Creamos constructor
	public Coche (int rueda, int velocidad, int combustible) {
		// Usamos el super para traer las variables de la clase padre
		super(rueda,velocidad);
		this.combustible = combustible;
	}
	// Getters and Setters
	public int getCombustible() {
		return combustible;
	}

	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}
	// Crear método repostar, que sumará el int mas hasta un máximo de 60 
	void repostar(int mas) {
		this.combustible = this.combustible + mas;
		if (this.combustible <= 60) {
			System.out.println("Tu cantidad de combustible despues de repostar es de: "+this.combustible+" litros");
		}else {
			System.out.println("Tienes el deposito lleno, no puedes llenarlo más");
		}
	}
	// Creamos método consumir para que consuma la gasolina de int menos, si tiene menos que 0 no se podrá
	void consumir(int menos) {
		this.combustible = this.combustible - menos;
		if (this.combustible >= 0) {
			System.out.println("Te queda "+this.combustible+ " litros restantes");
		}else {
			System.out.println("Te has quedado sin combustible");
		}
	}
}
