package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ejercicio numero 2
		//activamos scanner para el ingreso de datos
		Scanner scanner = new Scanner(System.in);
		//Mostramos por pantalla el pedido de ingreso de datos y declaramos variables. 
		System.out.println("Ingrese el Nombre de un pais : ");
		String nombrePais = scanner.next();
		System.out.println("Ingrese la edad de la persona: ");
		int edadPersona = scanner.nextInt();
		System.out.println("Ingrese la altura del edificio: ");
		float alturaEdificio = scanner.nextFloat();
		System.out.println("Ingrese el precio del producto: ");
		double precio = scanner.nextDouble();
		System.out.println("Ingrese el numero de telefono: ");
		String numeroTelefono = scanner.next();
		System.out.println("Ingrese el numero para calcular el coseno: ");
		double numCos = scanner.nextDouble();
		//mostramos resultados por consola
		System.out.println("pais: "+nombrePais);
		System.out.println("Edad: "+edadPersona);
		System.out.println("Altura de Edificio: "+alturaEdificio+"mts");
		System.out.println("Precio del Producto: $"+precio);
		System.out.println("Numero de telefono: "+numeroTelefono);
		//calculo del coseno
		double coseno = Math.cos(numCos);
		System.out.println("El coseno del numero ingresado es: "+coseno);
		
		scanner.close();
		
	
	}

}
