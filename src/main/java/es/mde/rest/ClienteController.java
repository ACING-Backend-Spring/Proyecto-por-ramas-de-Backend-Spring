package es.mde.rest;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import es.mde.entidades.Producto;
import es.mde.repositorios.ClienteDAO;

/**
 * Controlador que maneja y expone los métodos personalizados de los clientes
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@RepositoryRestController
@Configuration
public class ClienteController {

	private ClienteDAO clienteDAO;

	/**
	 * Controlador para ejecutar los metodos personalizados
	 * @param clienteDAO DAO de cliente
	 */
	public ClienteController(ClienteDAO clienteDAO) {

		this.clienteDAO = clienteDAO;
	}

	/**
	 * Metodo que agrupa los productos pagados de un cliente
	 * @param id Id del cliente
	 * @param assembler Elemento del tipo PersistentEntityResourceAssembler
	 * @return Lista de productos pagados
	 */
	@GetMapping("/clientes/{id}/productos-pagados")
	@ResponseBody
	public CollectionModel<PersistentEntityResource> getProductosPagadosDeCliente(@PathVariable Long id,
			PersistentEntityResourceAssembler assembler) {
		System.err.println("prueba");
		List<Producto> productos = clienteDAO.getProductosPagadosDeCliente(id);

		return assembler.toCollectionModel(productos);
	}

}