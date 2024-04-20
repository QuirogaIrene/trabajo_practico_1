package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
	private String nombrePersona;
	private Calendar fechaNacimiento;
	
	public Persona() {
	}

	public Persona(String nombrePersona, Calendar fechaNacimiento) {
		this.nombrePersona = nombrePersona;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int edadPersona() {
		int edad=0;
		Calendar hoy= Calendar.getInstance();
		edad=hoy.get(Calendar.YEAR)-fechaNacimiento.get(Calendar.YEAR);
		if (fechaNacimiento.get(Calendar.DAY_OF_YEAR) > hoy.get(Calendar.DAY_OF_YEAR)) {
			edad--;
		}
		
		return edad;
	}
	
	public String signoZodiaco() {
		String signo;
		int mes=fechaNacimiento.get(Calendar.MONTH)+1;
		switch (mes) {
		case 1:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 20) {
				signo="Capricornio";
			}else
				signo="Acuario";	
			break;
		case 2:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 19) {
				signo="Acuario";
			}else
				signo="Piscis";
			break;
		case 3:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 20) {
				signo="Piscis";
			}else
				signo="Aries";
			break;
		case 4:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 21) {
				signo="Aries";
			}else
				signo="Tauro";
			break;
		case 5:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 20) {
				signo="Tauro";
			}else
				signo="Geminis";
			break;
		case 6:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 21) {
				signo="Geminis";
			}else
				signo="Cancer";
			break;
		case 7:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 20) {
				signo="Cancer";
			}else
				signo="Leo";
			break;
		case 8:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 21) {
				signo="Leo";
			}else
				signo="Virgo";
			break;
		case 9:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 20) {
				signo="Virgo";
			}else
				signo="Libra";
			break;
		case 10:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 21) {
				signo="Libra";
			}else
				signo="Escorpio";
			break;
		case 11:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 20) {
				signo="Escorpio";
			}else
				signo="Sagitario";
			break;
		case 12:
			if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 21) {
				signo="Sagitario";
			}else
				signo="Capricornio";
			break;


		default:
			signo="Error datos mal ingresados";
			break;
		} 
		return signo;
	}
	public String estacion() {
	    int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
	    String estacion;
	    switch ((mes) / 4) {
	        case 0:
	        	if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 20) {
	        		estacion = "Verano";
	        	}else
	        		estacion = "Otoño";	
	            break;
	        case 1:
	        	if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 20) {
	        		estacion = "Otoño";
	        	}else
	        		estacion = "Invierno";
	            break;
	        case 2:
	        	if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 20) {
	        		estacion = "Invierno";
	        	}else
	        		estacion = "Primavera";
	            break;
	        case 3:
	        	if(fechaNacimiento.get(Calendar.DAY_OF_MONTH)<= 20) {
	        		estacion = "Primavera";
	        	}else
	        		estacion = "Verano";
	            break;
	        default:
	            estacion = "Error datos mal ingresados.";
	            break;
	    }
	    return estacion;
	}

	public void setMostrarDatos() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Nombre: "+this.nombrePersona);
		System.out.println("Fecha de Nacimiento: " + sdf.format(fechaNacimiento.getTime()));
		System.out.println("Edad: "+edadPersona());
		System.out.println("Signo Zodiacal: "+signoZodiaco());
		System.out.println("Estacion: "+estacion());
		
	}
	
	
}
