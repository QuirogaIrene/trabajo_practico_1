package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	    private int num;

	    public CalculadoraEspecial() {
	    }
	    //Metodo get
	    public int getNum() {
	        return num;
	    }
	    //Metodo set
	    public void setNum(int num) {
	        this.num= num;
	    }
	    //Calculo de sumatoria
	    public double calcularSumatoria() {
	        double sumatoria = 0;
	        for (int k = 1; k <= num; k++) {
	            sumatoria += (k * (k + 1) / 2.0) * (k * (k + 1) / 2.0);
	        }
	        return sumatoria;
	    }
	    //Calculo de productoria
	    public double calcularProductoria() {
	        double productoria = 1;
	        for (int k = 1; k <= num; k++) {
	            productoria *= (k * (k + 4));
	        }
	        return productoria;
	    }
}
