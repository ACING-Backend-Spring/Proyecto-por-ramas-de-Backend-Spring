package es.mde.rest;

import java.util.List;

import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import es.mde.entidades.Producto;
import es.mde.repositorios.ProductoDAO;

/**
 * Controlador que maneja y expone los métodos personalizados de los productos
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@RepositoryRestController
public class ProductoController {

	private ProductoDAO productoDAO;

	/**
	 * Controlador para ejecutar los metodos personalizados
	 * @param productoDAO DAO de producto
	 */
	public ProductoController(ProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}

	/**
	 * Metodo que agrupa los productos de los clientes de una empresa
	 * @param tipoCorreo Texto del correo del cliente que identifica a la empresa
	 * @param assembler Elemento del tipo PersistentEntityResourceAssembler
	 * @return Lista de productos de los clientes de una empresa
	 */
	@GetMapping("/productos/search/clientes-por-correo")
	@ResponseBody
	public CollectionModel<PersistentEntityResource> getProductosDeClientesEmpresa(@RequestParam("empresa") String tipo,
			PersistentEntityResourceAssembler assembler) {
		List<Producto> productos = productoDAO.getProductosDeClientesEmpresa(tipo);

		return assembler.toCollectionModel(productos);
	}
	
}