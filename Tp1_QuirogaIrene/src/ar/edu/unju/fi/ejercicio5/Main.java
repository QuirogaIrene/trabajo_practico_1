package ar.edu.unju.fi.ejercicio5;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int resultado=0;
		System.out.println("Ingrese un numero");
		int num = scanner.nextInt();
			for (int i = 1; i <=10 && (num>=1 && num<=9) ; i++) {
				resultado=num*i;
				System.out.println(num+"X"+i+"="+resultado);
				
			}

		scanner.close();	
		}

	}


