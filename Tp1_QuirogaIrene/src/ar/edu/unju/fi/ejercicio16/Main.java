package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        //mostramos los valores guardados en el array con la estructura de control repetitiva while
        System.out.println("Elementos del array:");
        int j = 0;
        while (j < nombres.length) {
            System.out.println(nombres[j]);
            j++;
        }
        //mostramos el tamaño del array
        System.out.println("El tamaño del array es: " + nombres.length);
        //solicitamos al usuario que ingrese un indice para eliminar un elemento del array
        byte indice;
        do {
            System.out.print("Ingrese el indice del elemento a eliminar (entre 0 y 4): ");
            indice = scanner.nextByte();
        } while (indice <= 0 || indice >= 4);
        //eliminamos el elemento del arreglo en el indice proporcionado
        if (nombres[indice] != null) {
            nombres[indice] = null;
            System.out.println("Elemento eliminado");
        } else {
            System.out.println("El elemento en ese indice ya esta vacio.");
        }
        //mostramos denuevo el arreglo despues de eliminar un elemento
        System.out.println("Elementos del array despues de eliminar:");
        for (String nombre : nombres) {
            System.out.println(nombre != null ? nombre : "Espacio vacio");
        }

        scanner.close();

	}

}
