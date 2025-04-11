package es.mde.SpringBasico;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.mde.ObjetoTipo;

@SpringBootApplication
@PropertySource({ "application2.properties" })
public class SpringBasicoApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBasicoApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBasicoApplication.class, args);

//		ConfigurableApplicationContext context = // mi objeto contenedor
//				new ClassPathXmlApplicationContext(new String[] { "config.xml" // aqui ponemos los archivos de
//																				// configuracion
//						, "config-scan.xml" });
		ObjetoTipo miObjetoTipo = new ObjetoTipo();
		String tipoBean = "autowired"; // "xml";//"anotacion2";//"config";
		miObjetoTipo = context.getBean(tipoBean, ObjetoTipo.class);
		miObjetoTipo.init();
//		miObjetoTipo = context.getBean("xml", ObjetoTipo.class);
//		miObjetoTipo.init();
//		miObjetoTipo = context.getBean("anotacion1",ObjetoTipo.class);
//		miObjetoTipo.init();
//		miObjetoTipo = context.getBean("config", ObjetoTipo.class);
//		miObjetoTipo.init();

		log.error("Recuperando el Bean \"{}\" del tipo {}", tipoBean, miObjetoTipo.getClass());

		context.close();

	}

}
