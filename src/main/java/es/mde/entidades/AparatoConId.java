package es.mde.entidades;

import es.mde.externas.Aparato;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Representa un Aparato
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@Entity
@Table(name = "APARATOS")
public class AparatoConId extends Aparato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	Long id;

	/**
	 * Crea un Aparato
	 */
	public AparatoConId() {
	}

	/**
	 * Devuelve un Id de un Aparato
	 * 
	 * @return Devuelve el Id de un Aparato
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Guarda el Id de un Aparato
	 * 
	 * @param id Id del Aparato
	 */
	public void setId(Long id) {
		this.id = id;
	}
}