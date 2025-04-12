package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.AparatoConId;

/**
 * Representa la interfaz que expone para la API los aparatos
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@RepositoryRestResource(path = "aparatos", itemResourceRel = "aparato", collectionResourceRel = "aparatos")
public interface AparatoDAO extends JpaRepository<AparatoConId, Long> {

}