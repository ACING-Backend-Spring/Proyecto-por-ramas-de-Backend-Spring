package es.mde.SpringBasico;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import es.mde.ObjetoTipo;

@Component("autowired")
public class ObjetoAutowired extends ObjetoTipo {

	private final Logger log = LoggerFactory.getLogger(ObjetoAutowired.class);
	ObjetoTipo objetoInyectado;

	@Autowired(required = false)
	public ObjetoAutowired() {
	};

	@Autowired(required = false)
	public ObjetoAutowired(es.mde.SpringBasico.ObjetoTipo objetoPorConstructor) {
		objetoInyectado = objetoPorConstructor;
	}

	public ObjetoTipo getObjetoInyectado() {
		return objetoInyectado;
	}

//	@Autowired
//	public void setObjetoInyectado(@Qualifier("anotacion2") ObjetoTipo objetoPorSetter, @Qualifier("config") ObjetoTipo objetoPorSetter2) {
//		objetoInyectado = new ObjetoTipo();
//		objetoInyectado.setNombreObjeto(objetoPorSetter.getNombreObjeto() + " y " + objetoPorSetter2.getNombreObjeto());
//		
//	}

	@Autowired
	public void setObjetoInyectado(@Qualifier("anotacion2") ObjetoTipo objetoPorSetter,
			@Qualifier("config") ObjetoTipo objetoPorSetter2, ObjetoTipo objetoPrimary) {
		objetoInyectado = objetoPrimary;

	}

	@Override
	public void init() {
		log.warn("Texto de Bean inyectado: {}", objetoInyectado.getNombreObjeto());
	}

}
