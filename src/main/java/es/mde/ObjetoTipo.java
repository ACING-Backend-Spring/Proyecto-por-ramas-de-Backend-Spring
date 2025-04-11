package es.mde;

import org.springframework.stereotype.Component;

@Component("anotacion1")
public class ObjetoTipo {

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
		System.err.println(nombreObjeto);
	}

}