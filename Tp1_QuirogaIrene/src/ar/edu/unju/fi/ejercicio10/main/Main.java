package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {

		  Scanner scanner = new Scanner(System.in);

	        // Crear un arreglo para almacenar los objetos Pizza
	        Pizza[] pizzas = new Pizza[3];

	        // Solicitar al usuario que ingrese los datos para cada pizza
	        for (int i = 0; i < pizzas.length; i++) {
	            Pizza pizza = new Pizza();

	            System.out.println("** Pizza " + (i + 1) + " **");
	            System.out.println("Ingrese el diámetro de la pizza (20, 30, 40):");
	            pizza.setDiametro(scanner.nextInt());

	            System.out.println("¿La pizza lleva ingredientes especiales? (true/false):");
	            pizza.setIngredientesEspeciales(scanner.nextBoolean());
	            scanner.nextLine();
	            //calculo del precio y el area de las pizza
	            pizza.calcularPrecio();
	            pizza.calcularArea();

	            pizzas[i] = pizza;
	        }

	        //mostrar los datos ingresados de cada pizza
	        for (int i = 0; i < pizzas.length; i++) {
	            System.out.println("\n** Pizza " + (i + 1) + " **");
	            System.out.println("Diámetro = " + pizzas[i].getDiametro());
	            System.out.println("Ingredientes especiales = " + pizzas[i].isIngredientesEspeciales());
	            System.out.println("Precio Pizza = " + pizzas[i].getPrecio() + "$");
	            System.out.println("Área de la pizza = " + pizzas[i].getArea());
	        }

	        scanner.close();
	   }

}


