package modelo;

import java.io.Serializable;

public class Persona implements Serializable{	//Si no se quiere serializar algo se utiliza la palabra "transient"
	
	private static final long serialVersionUID = 1L; //Para si existem muchas frases con el mismo nombre. 
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	};
	
	
}
