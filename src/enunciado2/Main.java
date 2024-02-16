package enunciado2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creamos el objeto EmpleadoDistribucion
		EmpleadoDistribucion empleDistribucion = new EmpleadoDistribucion("Madrid", "Dani", 123456782, 23);
		
		// Creamos el objeto EmpleadoProduccion
		EmpleadoProduccion empleProduccion = new EmpleadoProduccion("Tarde", "Hugo", 123456789, 10);
		
		// Mostramos por pantalla las características de empleDistribucion
		System.out.println("*******************");
		System.out.println("Empleado de Distribución");
		System.out.println("-Zona del empleado :"+empleDistribucion.getZona());
		System.out.println("-Nombre del empleado: "+empleDistribucion.getNombre());
		System.out.println("-DNI del empleado: "+empleDistribucion.getDni());
		System.out.println("-Dias de vacaciones del empleado: "+empleDistribucion.getDiasVacaciones());
		
		System.out.println("*******************");
		// Mostramos por pantalla las características de emplProducción
		System.out.println("Empleado de Producción");
		System.out.println("-Turno del empleado: "+empleProduccion.getTurno());
		System.out.println("-Nombre del empleado: "+empleProduccion.getNombre());
		System.out.println("-DNI del empleado: "+empleProduccion.getDni());
		System.out.println("-Dias de vacaciones del empleado: "+empleProduccion.getDiasVacaciones());
	}

}
