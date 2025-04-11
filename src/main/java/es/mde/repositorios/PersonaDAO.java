package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.mde.entidades.PersonaConId;

@Repository
public interface PersonaDAO extends JpaRepository<PersonaConId, Long> {

}