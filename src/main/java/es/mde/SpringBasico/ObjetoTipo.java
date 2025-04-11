package es.mde.SpringBasico;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("anotacion2")
public class ObjetoTipo extends es.mde.ObjetoTipo {

	@Value("${nombre-objeto}")
	String propiedad;

//	public ObjetoTipo() {
//		nombreObjeto = propiedad;
//	}

	public ObjetoTipo(@Value("${nombre-objeto2}") String propiedad) {
		System.err.println(propiedad);
		nombreObjeto = propiedad;
	}

	@Override
	public void init() {
		System.err.println("Dentro de SpringBasico");
		;
		System.err.println(propiedad);
	}

}