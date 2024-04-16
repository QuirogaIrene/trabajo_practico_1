package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {

		
		 Scanner scanner = new Scanner(System.in);

	        // Solicitamos al usuario ingresar sus datos
	        System.out.println("Ingrese el nombre del empleado:");
	        String nombre = scanner.nextLine();

	        System.out.println("Ingrese el legajo del empleado:");
	        int legajo = scanner.nextInt();

	        System.out.println("Ingrese el salario del empleado:");
	        double salario = scanner.nextDouble();

	        // Creamos el objeto Empleado
	        Empleado empleado = new Empleado(nombre, legajo, salario);

	        // Mostramos los datos del empleado antes del aumento
	        System.out.println("\nDatos del empleado antes del aumento:");
	        empleado.mostrarDatos();

	        //hacemos el aumento al empleado
	        empleado.aumentoSalario();

	        // mostramos por consola los datos del empleado con el aumento
	        System.out.println("\nDatos del empleado después del aumento:");
	        empleado.mostrarDatos();

	        scanner.close();
	}

}
