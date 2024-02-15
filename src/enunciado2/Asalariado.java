package enunciado2;

public class Asalariado {
	// Creamos variables
	String nombre;
	long dni;
	int diasVacaciones;
	
	// Creamos constructores
	public Asalariado() {
		nombre = "";
		dni = 0;
		diasVacaciones = 0;
	}
	
	public Asalariado(String nombre, long dni, int diasVacaciones) {
		this.nombre = nombre;
		this.dni = dni;
		this.diasVacaciones = diasVacaciones;
	}

	// Generamos los Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public int getDiasVacaciones() {
		return diasVacaciones;
	}

	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}
		
}
