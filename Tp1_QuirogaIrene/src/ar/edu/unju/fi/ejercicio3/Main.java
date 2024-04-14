package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//importamos scanner para el ingreso de datos por consola
		Scanner scanner = new Scanner(System.in);
		
		//solicitamos al usuario que ingrese un entero y luego lo almacenamos en la variable num.
		System.out.println("ingrese un numero: ");
		int num =scanner.nextInt();
		
		//utilizamos la estructura de control if para verificar si el numero ingresado es para o impar.
		//y luego mostramos los resultado por consola.
		if (num % 2 == 0) {
			num=num*3;
			System.out.println("El numero es par y el 3ple del numero es: "+num);
		}else
		{
			num=num*2;
			System.out.println("El numero es impar y el 2ble del numero es: "+num);
		}
		
		scanner.close();	

	}

}
