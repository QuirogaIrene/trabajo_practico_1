package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		//Ejercicio numero 11.
		
		 	int i = 2;
	        int j = 40;
	        int cont=0;
	        for (; j >= 0; j --, i += 1) {
	            System.out.print(j*(cont=cont+(j)-(i-1)) + " ");
	        }
	}

}
