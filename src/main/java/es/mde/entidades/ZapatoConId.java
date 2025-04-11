package es.mde.entidades;

import es.mde.externas.Zapato;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Representa un Zapato
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@Entity
@Table(name = "ZAPATOS")
public class ZapatoConId extends Zapato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSONA")
	private PersonaConId persona;

	/**
	 * Crea un Zapato
	 */
	public ZapatoConId() {
	}

	/**
	 * Devuelve un Id de un Zapato
	 * 
	 * @return Devuelve el Id de un Zapato
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Guarda el Id de un Zapato
	 * 
	 * @param id Id de un Zapato
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Devuelve la Persona de un Zapato
	 * 
	 * @return Devuelve la Persona de un Zapato
	 */
	public PersonaConId getPersona() {
		return persona;
	}

	/**
	 * Guarda la Persona de un Zapato
	 * 
	 * @param persona la Persona de un Zapato
	 */
	public void setPersona(PersonaConId persona) {
		this.persona = persona;
	}

}