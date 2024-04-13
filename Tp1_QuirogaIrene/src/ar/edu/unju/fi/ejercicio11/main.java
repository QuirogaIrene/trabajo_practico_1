package ar.edu.unju.fi.ejercicio11;

public class main {

	public static void main(String[] args) {
		
		 	int i = 2;
	        int j = 40;
	        int cont=0;
	        for (; j >= 0; j --, i += 1) {
	            System.out.print(j*(cont=cont+(j)-(i-1)) + " ");
	        }
	}

}
