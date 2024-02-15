package enunciado2;

// Extends de Asalariado
public class EmpleadoDistribucion extends Asalariado{
	String zona;
	
	public EmpleadoDistribucion() {
		String zona = "";
	}
	public EmpleadoDistribucion (String zona, String nombre, long dni, int diasVacaciones) {
		super(nombre,dni,diasVacaciones);
		this.zona = zona;
	}
}
