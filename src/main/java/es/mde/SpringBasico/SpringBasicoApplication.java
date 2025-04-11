package es.mde.SpringBasico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.mde.ObjetoTipo;

//@SpringBootApplication
public class SpringBasicoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBasicoApplication.class, args);

		ConfigurableApplicationContext context = // mi objeto contenedor
				new ClassPathXmlApplicationContext(new String[] { "config.xml" // aqui ponemos los archivos de
																				// configuracion
						, "config-scan.xml" });
		ObjetoTipo miObjetoTipo = new ObjetoTipo();
		miObjetoTipo.init();
		miObjetoTipo = context.getBean("xml", ObjetoTipo.class);
		miObjetoTipo.init();
//		miObjetoTipo = context.getBean("anotacion1",ObjetoTipo.class);
//		miObjetoTipo.init();
		miObjetoTipo = context.getBean("anotacion2", ObjetoTipo.class);
		miObjetoTipo.init();
		miObjetoTipo = context.getBean("config", ObjetoTipo.class);
		miObjetoTipo.init();

		context.close();

	}

}
