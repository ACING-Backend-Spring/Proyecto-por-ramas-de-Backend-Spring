package es.mde.externas;

/**
 * Representa un Aparato
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
public class Aparato {

	private String nombre;
	private String color;

	/**
	 * Crea un Aparato
	 */
	public Aparato() {
	}

	/**
	 * Devuelve un nombre de un Aparato
	 * 
	 * @return Devuelve el nombre de un Aparato
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Guarda el nombre de un Aparato
	 * 
	 * @param nombre nombre del Aparato
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve un color de un Aparato
	 * 
	 * @return Devuelve el color de un Aparato
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Guarda el color de un Aparato
	 * 
	 * @param color color del Aparato
	 */
	public void setColor(String color) {
		this.color = color;
	}
}