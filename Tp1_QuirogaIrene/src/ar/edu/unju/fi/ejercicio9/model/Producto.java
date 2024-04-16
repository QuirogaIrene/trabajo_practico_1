package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	    private String nombre;
	    private int codigo;
	    private double precio;
	    private int descuento; 

	    public Producto() {
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }

	    public int getDescuento() {
	        return descuento;
	    }

	    public void setDescuento(int descuento) {
	        this.descuento = descuento;
	    }

	    // Método que va a  calcular el descuento del producto ingresado
	    public double calcularDescuento() {
	        double precioConDescuento = precio;
	        if (descuento > 0 && descuento <= 50) {
	            precioConDescuento = precio - (precio * (descuento / 100.0));
	        }
	        return precioConDescuento;
	    }
}
