package es.mde.SpringBasico;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.mde.ObjetoTipo;

@Configuration
public class ConfiguracionPorJava {

	@Bean(name = "config")
	public ObjetoTipo miObjetoTipo() {
		ObjetoTipo objetoTipo = new ObjetoTipo() {
			int llamadas = 0;

			@Override
			public void init() {
				System.err.printf("Llamado %s veces", ++llamadas);
				System.err.println();
			}

		};
		objetoTipo.init();

		return objetoTipo;
	}
}