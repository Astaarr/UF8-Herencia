package enunciado2;

// Extends de Asalariado
public class EmpleadoDistribucion extends Asalariado{
	String zona;
	
	public EmpleadoDistribucion (String zona, String nombre, long dni, int diasVacaciones) {
		super(nombre,dni,diasVacaciones);
		this.zona = zona;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	
}
