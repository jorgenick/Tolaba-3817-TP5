package ar.edu.unju.fi.model;

import java.time.LocalDate;
import org.springframework.stereotype.Component;
/**
 * Creacion de la Clase Estadio
 * Para que la Clase Estadio sea administrada por el
 * contenedor de Spring agregamos la anotacion @Component 
 * @author Jorge Tolaba
 */
@Component
public class Estadio {
	/**
	 * nombre del Estadio
	 */
	private String nombre;
	/**
	 * Fecha de fundacion del Estadio
	 */
	private LocalDate fechaFundacion;
	/**
	 * cuidad del estadio
	 */
	private String cuidad;
	/**
	 * Capacidad del estadio
	 */
	private int capacidad;
	/**
	 * Direccion del estadio
	 */
	private String direccion;
//--------------CONSTRUCTORES--------------------
	public Estadio() {
	}
//-----------METODOS ACCESORES------------------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
	public String getCuidad() {
		return cuidad;
	}
	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * Sobreescritura del metodo ToString
	 */
	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + ", cuidad=" + cuidad
				+ ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
	}
	
}
