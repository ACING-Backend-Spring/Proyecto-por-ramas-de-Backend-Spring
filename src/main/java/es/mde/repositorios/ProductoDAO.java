package es.mde.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.Producto;

/**
 * Representa la interfaz que expone para la API los productos
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@RepositoryRestResource(path = "productos", itemResourceRel = "producto", collectionResourceRel = "productos")
public interface ProductoDAO extends JpaRepository<Producto, Long>, ProductoDAOCustom {

	/**
	 * Devuelve una lista de productos que contiene ese texto en su Nombre
	 * 
	 * @param txt Texto que esta incluido en el Nombre del Producto buscado
	 * @return Devuelve una lista de productos que contiene ese texto en su Nombre
	 */
	List<Producto> findByNombreIgnoreCaseContaining(String txt);
	
}