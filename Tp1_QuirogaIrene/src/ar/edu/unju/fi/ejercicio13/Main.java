package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];

        // Pedir al usuario que ingrese los valores y almacenarlos en el array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese un número entero en la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Mostrar por consola el valor almacenado en esa posición
        System.out.println("Elementos del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indice " + i + ": " + array[i]);
        }

        scanner.close();

	}

}
