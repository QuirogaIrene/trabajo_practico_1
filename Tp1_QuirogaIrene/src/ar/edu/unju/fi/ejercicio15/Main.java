package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int tamaño;
	        do {
	            System.out.print("Ingrese un número entero entre 5 y 10 inclusive: ");
	            tamaño = scanner.nextInt();
	        } while (tamaño <= 5 || tamaño >= 10);

	        //creamos un array de tamaño ingresado por consola
	        String[] nombres = new String[tamaño];

	        //solicitamos al usuario que ingrese nombres de personas y lo guarda en el array
	        for (int i = 0; i < nombres.length; i++) {
	            System.out.print("Ingrese un nombre de persona para la posición " + i + ": ");
	            nombres[i] = scanner.next();
	        }

	        //muestra el valor de cada posición del array
	        System.out.println("Elementos del array: ");
	        for (int i = 0; i < nombres.length; i++) {
	            System.out.println("Valor en la posición " + i + ": " + nombres[i]);
	        }

	        // Mostrar el contenido del array pero comenzando desde la última posición
	        System.out.println("Elementos del array en forma iterativa:");
	        for (int i = nombres.length - 1; i >= 0; i--) {
	            System.out.println("Valor en la posición " + i + ": " + nombres[i]);
	        }

	        scanner.close();

	}

}
