package es.mde.repositorios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import es.mde.entidades.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * Representa la clase implementada con los metodos personalizados de los productos 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@Transactional(readOnly = true)
public class ProductoDAOImpl implements ProductoDAOCustom {

	@Autowired
	ClienteDAO clienteDAO;

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Devuelve una lista de productos de los clientes de una empresa (su correo contiene... "gmail.com"=google...)
	 * @return Devuelve una lista de productos de los clientes de una empresa (su correo contiene... "gmail.com"=google...)
	 */
	@Override
	public List<Producto> getProductosDeClientesEmpresa(String tipo) {

		List<Producto> productos = new ArrayList<Producto>();
		clienteDAO.findByCorreoContaining(tipo).forEach(c -> productos.addAll(c.getProductos()));

		return productos;
	}

}