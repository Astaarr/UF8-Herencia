package enunciado2;

//Extends de Asalariado
public class EmpleadoProduccion extends Asalariado {
	String turno;
	
	public EmpleadoProduccion (String turno, String nombre, long dni, int diasVacaciones) {
		super(nombre,dni,diasVacaciones);
		this.turno = turno;
	}
	
}
