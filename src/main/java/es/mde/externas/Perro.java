package es.mde.externas;

/**
 * Representa un Perro
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
public class Perro {

	private Long id;
	private String nombre;
	private String size;

	/**
	 * Crea un Perro
	 */
	public Perro() {
	}

	/**
	 * Crea un Perro
	 * @param nombre Nombre del perro
	 * @param size Tamaño del perro
	 */
	public Perro(String nombre, String size) {
		this.nombre = nombre;
		this.size = size;
	}

	/**
	 * Devuelve un Id de un Perro
	 * 
	 * @return Devuelve el Id de un Perro
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Guarda el Id de un Perro
	 * 
	 * @param id Id del Perro
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Devuelve un nombre de un Perro
	 * 
	 * @return Devuelve el nombre de un Perro
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Guarda el nombre de un Perro
	 * 
	 * @param nombre nombre del Perro
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve un tamaño de un Perro
	 * 
	 * @return Devuelve el tamao de un Perro
	 */
	public String getSize() {
		return size;
	}

	/**
	 * Guarda el tamaño de un Perro
	 * 
	 * @param size tamaño del Perro
	 */
	public void setSize(String size) {
		this.size = size;
	}

}