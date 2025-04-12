package es.mde.repositorios;

import java.util.List;

import es.mde.entidades.Producto;

/**
 * Representa la interfaz con los metodos personalizados de los Productos
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
public interface ProductoDAOCustom {

	/**
	 * Devuelve una lista de productos de los clientes que contienen un texto en su correo (emula que gmail= empresa de google...)
	 * 
	 * @param tipoCorreo Texto que se buscará en el correo de los clientes (emula que gmail= empresa de google...)
	 * @return Devuelve una lista de productos de los clientes que contienen un texto en su correo (emula que gmail= empresa de google...)
	 */
	List<Producto> getProductosDeClientesEmpresa(String tipoCorreo);

}