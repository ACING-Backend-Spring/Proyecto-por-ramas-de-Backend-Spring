package es.mde.SpringBasico;

import org.springframework.stereotype.Component;

@Component
public class ObjetoTipo extends es.mde.ObjetoTipo {

	@Override
	public void init() {
		System.err.println("Dentro de SpringBasico");

	}

}