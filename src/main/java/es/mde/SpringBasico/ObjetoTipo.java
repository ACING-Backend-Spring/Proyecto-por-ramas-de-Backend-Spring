package es.mde.SpringBasico;

import org.springframework.stereotype.Component;

@Component("anotacion2")
public class ObjetoTipo extends es.mde.ObjetoTipo {

	@Override
	public void init() {
		System.err.println("Dentro de SpringBasico");

	}

}