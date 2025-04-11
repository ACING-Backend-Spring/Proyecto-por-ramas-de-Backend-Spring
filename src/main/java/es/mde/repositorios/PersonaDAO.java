package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.PersonaConId;

/**
 * Representa la interfaz que expone para la API las Personas
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@RepositoryRestResource(path = "personas", itemResourceRel = "persona", collectionResourceRel = "personas")
public interface PersonaDAO extends JpaRepository<PersonaConId, Long> {

}