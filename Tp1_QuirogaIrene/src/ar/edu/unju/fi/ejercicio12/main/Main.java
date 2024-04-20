package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Persona person = new Persona();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese Nombre:");
		person.setNombrePersona(scanner.nextLine());
		System.out.println("Ingrese fecha de nacimiento (DD MM YYYY):");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();
        mes--;
        Calendar FechaNacimiento = Calendar.getInstance();
        FechaNacimiento.set(anio, mes, dia);
        person.setFechaNacimiento(FechaNacimiento);
        person.setMostrarDatos();
        scanner.close();
	}

}
