package enunciado1;

public class Main {

	public static void main(String[] args) {
		// Creamos el coche dawcar
		Coche dawcar = new Coche(4,0,60);
		
		System.out.println("*******************");
		
		// Aceleramos a 100 km/h
		dawcar.acelerar(100);
		System.out.println("*******************");
		
		// Se reducen 20 litros
		dawcar.consumir(20);
		System.out.println("*******************");

		// Frena hasta los 60 km/h
		dawcar.frenar(40);
		System.out.println("*******************");

		// Se consulta lo que queda de combustible
		System.out.println("Tienes: "+dawcar.getCombustible()+" litros");
		System.out.println("*******************");

		// Se acelera hasta 90 km/h
		dawcar.acelerar(30);
		System.out.println("*******************");

		// Se reducen el combustible 10 litros
		dawcar.consumir(10);
		System.out.println("*******************");

		// Se frena hasta parar el coche
		dawcar.frenar(90);;
		System.out.println("*******************");

		// Se repostan 20 litros de combustible
		dawcar.repostar(20);
		System.out.println("*******************");

		// Se consulta lo que queda de combustible
		System.out.println("Tienes: "+dawcar.getCombustible()+" litros");
		System.out.println("*******************");

		
	}

}
