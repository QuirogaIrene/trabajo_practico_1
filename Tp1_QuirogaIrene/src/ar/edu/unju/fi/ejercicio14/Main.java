package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // solicita al usuario que ingrese un número entero entre [3, 10]
        int tamaño;
        do {
            System.out.print("Ingrese un número entero entre 3 y 10 inclusive: ");
            tamaño = scanner.nextInt();
        } while (tamaño <= 3 || tamaño >= 10);

        // crea un array de tamaño ingresado por el usuario
        int[] array = new int[tamaño];

        // aqui solicita al usuario que ingrese números enteros y los guarda en el array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese un número entero en la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // muestra el valor de cada posición del array
        System.out.println("Elementos del array:");
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor en la posición " + i + ": " + array[i]);
            suma += array[i];
        }

        // Mostrar la suma de todos los valores
        System.out.println("La suma de todos los valores es: " + suma);

        scanner.close();

	}

}
