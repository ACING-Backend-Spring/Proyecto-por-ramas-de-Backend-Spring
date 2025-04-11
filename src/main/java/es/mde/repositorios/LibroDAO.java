package es.mde.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import es.mde.entidades.Libro;

/**
 * Representa la interfaz que expone para la API los libros
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@RepositoryRestResource(path = "libros", itemResourceRel = "libro", collectionResourceRel = "libros")
public interface LibroDAO extends JpaRepository<Libro, Long> {
		
	/**
	 * Devuelve una lista de libros que contiene ese texto en su Nombre o en su Autor
	 * 
	 * @param autor Texto que esta incluido en el Autor del libro buscado
	 * @param nombre Texto que esta incluido en el Nombre del libro buscado
	 * @return Devuelve una lista de libros que contiene ese texto en su Nombre o en su autor
	 */
	@RestResource(path = "autor-nombre")
	List<Libro> findByAutorIgnoreCaseContainingOrNombreIgnoreCaseContaining(@Param("autor-nombre") String autor,
			@Param("autor-nombre") String nombre);

}