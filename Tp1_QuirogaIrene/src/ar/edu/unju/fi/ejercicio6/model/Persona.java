package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String dni;
	private String nombre;
	private String fechaNacimientoStr;
	private String provincia;
	
	public Persona() {
	}

	public Persona(String dni, String nombre, String fechaNacimientoStr, String provincia) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimientoStr = fechaNacimientoStr;
		this.provincia = provincia;
	}

	public Persona(String dni, String nombre, String fechaNacimientoStr) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimientoStr = fechaNacimientoStr;
		this.provincia = "Jujuy";
	}
	
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
	
	public int calcularEdad (LocalDate fechaNacimiento) {
		
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, fechaActual);

	return periodo.getYears();
	}
	
	public void mostrarDatos(int periodo) {
		String mayorEdadSrt;
		if (periodo >=18 ) {
			mayorEdadSrt=" y es mayor de edad";
		}else
		{
			mayorEdadSrt=" y es menor de edad";
		}
		System.out.println("Nombre:"+this.nombre+" Dni:"+this.dni+" Fecha de Nacimiento:"+this.fechaNacimientoStr+" Provincia:"+this.provincia+" Edad:"+calcularEdad(this.fechaNacimiento)+mayorEdadSrt);
	}

	

}
