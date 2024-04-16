package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Solicitamos el ingreso de datos por consola	
		System.out.println("Ingrese el valor de n:");
		int n = scanner.nextInt();

		//Creamos el objeto de la clase CalculadoraEspecial
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setNum(n);

		//Calculamos la sumatoria
		double sumatoria = calculadora.calcularSumatoria();
		System.out.println("La sumatoria especial es: " + sumatoria);

		//Calculamos la productoria
		double productoria = calculadora.calcularProductoria();
		System.out.println("La productoria especial es: " + productoria);

		scanner.close();
	}	
}
