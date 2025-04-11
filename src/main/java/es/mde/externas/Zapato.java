package es.mde.externas;

/**
 * Representa un Zapato
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
public class Zapato {
	private String modelo;
	private int numero;
	
	/**
	 * Crea un Zapato
	 */
	public Zapato() {
	}

	/**
	 * Devuelve un modelo de un Zapato
	 * 
	 * @return Devuelve el modelo de un Zapato
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Guarda el modelo de un Zapato
	 * 
	 * @param modelo Modelo del Zapato
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Devuelve un numero de un Zapato
	 * 
	 * @return Devuelve el numero de un Zapato
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Guarda el numero de un Zapato
	 * 
	 * @param numero Numero del Zapato
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

}