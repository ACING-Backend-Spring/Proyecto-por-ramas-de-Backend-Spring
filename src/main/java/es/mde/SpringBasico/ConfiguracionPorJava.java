package es.mde.SpringBasico;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import es.mde.ObjetoTipo;

@Configuration
public class ConfiguracionPorJava {

	@Bean(name = "config")
	@Primary
	public ObjetoTipo miObjetoTipo() {
		ObjetoTipo objetoTipo = new ObjetoTipo() {
			int llamadas = 0;

			@Override
			public void init() {
				System.err.printf("Llamado %s veces", ++llamadas);
				System.err.println();
			}

		};
		objetoTipo.setNombreObjeto("Por configuracion");
		objetoTipo.init();

		return objetoTipo;
	}
}