package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.mde.entidades.ZapatoConId;

@Repository
public interface ZapatoDAO extends JpaRepository<ZapatoConId, Long> {

}