package enunciado1;

public class Vehiculo{
	int rueda;
	int velocidad;
	
	public Vehiculo () {
		this.rueda = 0;
		this.velocidad = 0;
	}

	public Vehiculo (int rueda, int velocidad) {
		this.rueda = rueda;
		this.velocidad = velocidad;
	}
	
	// Getters and Setters

	public int getRueda() {
		return rueda;
	}

	public void setRueda(int rueda) {
		this.rueda = rueda;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	// Creamos método acelerar, que no puede acelerar más de 120 km/h
	void acelerar(int mas){
		this.velocidad = this.velocidad + mas;
		if (this.velocidad <= 120) {
			System.out.println("Esta es la nueva velocidad despues de acelerar: "+this.velocidad+" km/h");
		}else {
			System.out.println("No se puede acelerar más de 120 km/h");
		}
	}
	
	// Creamos el método frenar, que no puede frenar en negativo
	void frenar(int menos) {
		this.velocidad = this.velocidad - menos;
		if (this.velocidad >=0) {
			System.out.println("Esta es la nueva velocidad despues de frenar: "+this.velocidad+" km/h");
		}else {
			System.out.println("No puedes frenar más");
		}
	}
}
