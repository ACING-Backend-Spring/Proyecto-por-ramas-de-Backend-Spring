package es.mde;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("anotacion1")
public class ObjetoTipo {

	private final Logger log = LoggerFactory.getLogger(ObjetoTipo.class);

	protected String nombreObjeto = "Objeto por defecto";

	// Tiene que tener los getter y setter para ser inyectado

	public String getNombreObjeto() {
		return nombreObjeto;
	}

	public void setNombreObjeto(String nombreObjeto) {
		this.nombreObjeto = nombreObjeto;
	}

	// el metodo que estamos poniendo que tiene en el Bean XML para que se inicie al
	// crearse...

	public void init() {
		log.info("Llamado init(): {}", nombreObjeto);
	}

}