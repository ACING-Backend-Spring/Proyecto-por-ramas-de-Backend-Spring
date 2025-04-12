package es.mde.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * Representa un cuaderno
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@Entity
@DiscriminatorValue("CUADERNO")
public class Cuaderno extends Producto {

	private int hojas;

	/**
	 * Crea un Cuaderno
	 */
	public Cuaderno() {
	}

	/**
	 * Devuelve las hojas de un Cuaderno
	 * 
	 * @return Devuelve las hojas de un Cuaderno
	 */
	public int getHojas() {
		return hojas;
	}

	/**
	 * Guarda las hojas de un Cuaderno
	 * 
	 * @param hojas Hojas de un Cuaderno
	 */
	public void setHojas(int hojas) {
		this.hojas = hojas;
	}

}