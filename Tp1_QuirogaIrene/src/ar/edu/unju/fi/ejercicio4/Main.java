package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean band=true;
		int factorial=1,i=1;
		
		Scanner scanner = new Scanner(System.in);
		
		while( band==true  ) {
			System.out.println("Ingrese numero a calcular: ");
			int num = scanner.nextInt();
			if(num>=0 && num<=10){
			
				while  ( i<=num ) {
					factorial*=i;
					i++;
				
				}
			 band=false;
			 System.out.println("el factorial de "+num+ " ingresado es: "+factorial);
			}else
			{
				System.out.println("El numero ingresaro excede el rango!");
			}
	
		}
		
		scanner.close();
	}

}
