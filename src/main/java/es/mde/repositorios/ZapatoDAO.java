package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.ZapatoConId;

/**
 * Representa la interfaz que expone para la API los zapatos
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@RepositoryRestResource(path = "zapatos", itemResourceRel = "zapato", collectionResourceRel = "zapatos")
public interface ZapatoDAO extends JpaRepository<ZapatoConId, Long> {

}