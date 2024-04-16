package ar.edu.unju.fi.ejercicio6.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese Nombre:");
		String nombre = scanner.next();
		System.out.println("Ingrese Dni:");
		String dni = scanner.next();
		System.out.println("Ingrese Fecha de Nacimiento (AAAA-MM-DD):");
		String fechaNacimiento = scanner.next();
		Persona persona1 =new Persona();
		System.out.println(persona1);
	
		

	}

}
