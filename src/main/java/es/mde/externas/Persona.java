package es.mde.externas;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Representa una Persona
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
public class Persona {

	private String nombre;
	private Collection<Zapato> zapatos = new ArrayList<Zapato>();

	/**
	 * Crea una Persona
	 */
	public Persona() {
	}

	/**
	 * Devuelve un nombre de una Persona
	 * 
	 * @return Devuelve el nombre de una Persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Guarda el nombre de una Persona
	 * 
	 * @param nombre nombre de la Persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve los zapatos de una Persona
	 * 
	 * @return Devuelve los zapatos de una Persona
	 */
	public Collection<Zapato> getZapatos() {
		return zapatos;
	}

	/**
	 * Guarda los zapatos de una Persona
	 * 
	 * @param zapatos Zapatos de la Persona
	 */
	public void setZapatos(Collection<Zapato> zapatos) {
		this.zapatos = zapatos;
	}

}