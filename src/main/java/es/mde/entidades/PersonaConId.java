package es.mde.entidades;

import java.util.Collection;

import es.mde.externas.Persona;
import es.mde.externas.Zapato;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Representa una Persona
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@Entity
@Table(name = "PERSONAS")
public class PersonaConId extends Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	Long id;

	/**
	 * Crea una Persona
	 */
	public PersonaConId() {
	}

	/**
	 * Devuelve un Id de una Persona
	 * 
	 * @return Devuelve el Id de una Persona
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Guarda el Id de una Persona
	 * 
	 * @param id Id de una Persona
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Devuelve los zapatos de una Persona
	 * 
	 * @return Devuelve los zapatos de una Persona
	 */
	@Override
	@OneToMany(targetEntity = ZapatoConId.class)
	public Collection<Zapato> getZapatos() {
		return super.getZapatos();
	}

	// Establece la relacion en los dos sentidos
	/**
	 * Agrega el Zapato a la Persona
	 * 
	 * @param Zapato agregado a la Persona
	 */
	public void addZapatoConId(ZapatoConId zapato) {
		super.getZapatos().add(zapato);
		zapato.setPersona(this);
	}

}