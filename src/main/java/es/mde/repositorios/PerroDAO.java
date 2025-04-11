package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.externas.Perro;

/**
 * Representa la interfaz que expone para la API los perros
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@RepositoryRestResource(path = "perros", itemResourceRel = "perro", collectionResourceRel = "perros")

public interface PerroDAO extends JpaRepository<Perro, Long> {

}