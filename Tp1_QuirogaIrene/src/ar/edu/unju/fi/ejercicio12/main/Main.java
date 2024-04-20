package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		//creamos el objeto person
		Persona person = new Persona();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingrese Nombre:");
		//aqui llamamos al metedo set pasandole por parametro lo que se pasa por el scanner al momento de ingresar el nombre.
		person.setNombrePersona(scanner.nextLine());
		System.out.println("Ingrese fecha de nacimiento (DD MM YYYY):");
		//separamos en dia mes y año para poder tener manejo del mes donde le decrementamos uno y asi poder sacar bien el signo y la estacion del año .
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();
        mes--;
        //creamos un objeto de tipo calendar y lo instaciamos y luego hacemos el llamado de metodos para finalmente mostrar los datos.
        Calendar FechaNacimiento = Calendar.getInstance();
        FechaNacimiento.set(anio, mes, dia);
        person.setFechaNacimiento(FechaNacimiento);
        person.setMostrarDatos();
        scanner.close();
	}

}
