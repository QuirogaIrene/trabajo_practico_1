package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {

		private String nombre;
		private int legajo;
		private Double salario;
		//creacion de las constantes
		private final double SALARIO_MINIMO=210000.00;
		private final double AUMENTO_MERITO=20000.00;
		
		//construtor parametrizado
		public Empleado(String nombre, int legajo, Double salario) {
			this.nombre = nombre;
			this.legajo = legajo;
			this.salario = salario;
			
			if (salario >= SALARIO_MINIMO) {
				salario=this.salario;
			}else {
				this.salario = SALARIO_MINIMO;
			}
			
			
		}
		//metodo para mostrar los datos por consola
		public void mostrarDatos(){
			System.out.println("Nombre del Empleado: "+nombre);
			System.out.println("Legajo: "+legajo);
			System.out.println("Salario: "+salario);
		
		}
		//metodo para realizar el aumento del salario
		public void aumentoSalario(){
			salario += AUMENTO_MERITO;
		}
		
		
		
}
