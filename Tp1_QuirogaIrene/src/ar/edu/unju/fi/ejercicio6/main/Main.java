package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        //Creamos un objeto para utilizar el constructor por defecto
	        Persona persona1 = new Persona();
	        System.out.println("Ingrese el DNI de la 1ra persona:");
	        persona1.setDni(scanner.nextLine());
	        System.out.println("Ingrese el nombre de la 1ra persona:");
	        persona1.setNombre(scanner.nextLine());
	        System.out.println("Ingrese la fecha de nacimiento de la 1ra persona en formato(YYYY-MM-DD):");
	        persona1.setFechaNacimiento(LocalDate.parse(scanner.nextLine()));
	        System.out.println("Ingrese la provincia:");
	        persona1.setProvincia(scanner.nextLine());

	        System.out.println("Datos de la 1ra persona:");
	        persona1.mostrarDatos();

	        //Construcción del segundo objeto utilizando el constructor parametrizado
	        System.out.println("Ingrese el DNI de la 2da persona:");
	        String dni2 = scanner.nextLine();
	        System.out.println("Ingrese el nombre de la 2da persona:");
	        String nombre2 = scanner.nextLine();
	        System.out.println("Ingrese la fecha de nacimiento de la 2da persona en formato (YYYY-MM-DD):");
	        LocalDate fechaNacimiento2 = LocalDate.parse(scanner.nextLine());
	        System.out.println("Ingrese la provincia para la Persona 2:");
	        String provincia2 = scanner.nextLine();

	        Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2, provincia2);

	        System.out.println("Datos de la 2da persona:");
	        persona2.mostrarDatos();

	        // Construcción del 3er objeto utilizando el constructor con dni, nombre y fecha de nacimiento
	        System.out.println("Ingrese el DNI de la 3ra persona:");
	        String dni3 = scanner.nextLine();
	        System.out.println("Ingrese el nombre de la 3da persona:");
	        String nombre3 = scanner.nextLine();
	        System.out.println("Ingrese la fecha de nacimiento de la 3ra persona en formato(YYYY-MM-DD):");
	        LocalDate fechaNacimiento3 = LocalDate.parse(scanner.nextLine());

	        Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento3);

	        System.out.println("Datos de la 3ra persona:");
	        persona3.mostrarDatos();

	        scanner.close();
	    }

}
