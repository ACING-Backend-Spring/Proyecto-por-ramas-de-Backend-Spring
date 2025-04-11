package es.mde.entidades;

import java.util.ArrayList;
import java.util.Collection;

import es.mde.repositorios.ClienteListener;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Representa un Cliente
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@Entity
@Table(name = "CLIENTES")
@EntityListeners(ClienteListener.class)
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Long id;
	@Column(length = 25, name = "apodo") // para ver que podemos limitar los caracteres de esta columna, nombre de la
											// columna...
	private String nombre;
	private String correo;
	@OneToMany(cascade = CascadeType.ALL, targetEntity = Producto.class, mappedBy = "cliente")
	private Collection<Producto> productos = new ArrayList<>();

	/**
	 * Crea un Cliente
	 */
	public Cliente() {
	}

	/**
	 * Crea un Cliente
	 * 
	 * @param nombre Nombre del Cliente
	 * @param correo Correo del Cliente
	 */
	public Cliente(String nombre, String correo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
	}

	/**
	 * Devuelve un Id de un Cliente
	 * 
	 * @return Devuelve el Id de un Cliente
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Guarda el Id de un Cliente
	 * 
	 * @param id Id del Cliente
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Devuelve un nombre de un Cliente
	 * 
	 * @return Devuelve el nombre de un Cliente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Guarda el nombre de un Cliente
	 * 
	 * @param nombre Nombre del Cliente
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve un correo de un Cliente
	 * 
	 * @return Devuelve el correo de un Cliente
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Guarda el correo de un Cliente
	 * 
	 * @param correo Correo del Cliente
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * Devuelve los productos de un Cliente
	 * 
	 * @return Devuelve los productos de un Cliente
	 */
	public Collection<Producto> getProductos() {
		return productos;
	}

	/**
	 * Guarda los productos de un Cliente
	 * 
	 * @param productos Productos del Cliente
	 */
	public void setProductos(Collection<Producto> productos) {
		this.productos = productos;
	}

	// Establece la relacion en los dos sentidos
	/**
	 * Agrega el Producto al Cliente
	 * 
	 * @param producto Producto agregado al Cliente
	 */
	public void addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setCliente(this);
	}
}