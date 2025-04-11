package es.mde.mipapeleria;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.fasterxml.jackson.databind.ObjectMapper;

import es.mde.entidades.Cliente;
import es.mde.entidades.Cuaderno;
import es.mde.entidades.Libro;
import es.mde.rest.MixIns;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

/**
 * ConfiguracionPorJava va a establecer los parametros configurables en los distintos properties, referenciándolos.
 * 
 * @author JOSE LUIS PUENTES ALAMOS
 *
 */
@Configuration
@EnableTransactionManagement
@PropertySource({ "classpath:config/rest.properties", "classpath:config/jackson.properties", "classpath:config/gestionBBDD.properties"
//	, "classpath:config/passwordsBD.properties" // se comenta esta linea para que no busque el archivo al compilarse en heroku, ya que no lo hemos subido porque las contraseñas se las proporcionaremos por variables 
	})
@EnableJpaRepositories("${misRepositorios}") // leer valor de propiedades? pero solo para las entidades anotadas
@ComponentScan({ "es.mde.repositorios", "es.mde.rest" }) // para que escanee los Listener y los Controller...
public class ConfiguracionPorJava {

	/**
	 * Para usar la ruta a escanear entidades desde el application.properties
	 */
	@Value("${misEntidades}")
	String entidades;

	/**
	 * Entity manager que sustituye al jpa-config.xml
	 *
	 * @param dataSource Parametro del tipo DataSource
	 * @param env Parametro del tipo Environment
	 * @param vendorAdapter Parametro del tipo JpaVendorAdapter
	 * 
	 * @return Devuelve un "@Bean" de LocalContainerEntityManagerFactory
	 */
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, Environment env,
			JpaVendorAdapter vendorAdapter) {

		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource);
//	    JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter(); // O pedirlo como parametro y que haga el Autowired
		em.setJpaVendorAdapter(vendorAdapter);

		em.setPackagesToScan(entidades); // leer valor de propiedades? pero solo para las entidades anotadas
		em.setMappingResources("jpa/Perro.orm.xml", "jpa/Persona.orm.xml", "jpa/Zapato.orm.xml"); // para escanear
																									// archivos xml...
		// leerValorDePropiedades?

		Properties jpaProperties = new Properties();
		Arrays.asList("dialect", "show_sql", "hbm2ddl.auto", "enable_lazy_load_no_trans") // leer valor de para las
																							// entidades anotadas
				.stream().map(s -> "hibernate." + s)
				.map(p -> new AbstractMap.SimpleEntry<String, String>(p, env.getProperty(p)))
				.filter(e -> e.getValue() != null).forEach(e -> jpaProperties.put(e.getKey(), e.getValue()));
		em.setJpaProperties(jpaProperties);

		return em;
	}

	/**
	 * Devuelve un EntityManager
	 * @param emf Parametro del tipo EntityManagerFactory
	 * @return Devuelve un EntityManager
	 */
	@Bean
	public EntityManager entityManager(EntityManagerFactory emf) {
		System.err.println("--- LAS ENTIDADES MAPEADAS SON ---");
		emf.getMetamodel().getEntities().forEach(System.err::println);
		System.err.println("----------------------------------");

		return emf.createEntityManager();
	}

	/**
	 * Devuelve un ObjectMapper
	 * 
	 * @return Devuelve un ObjectMapper
	 */
	@Bean
	public ObjectMapper getObjectMapper() {

		ObjectMapper mapper = new ObjectMapper();
		mapper.addMixIn(Cliente.class, MixIns.Clientes.class);
		mapper.addMixIn(Libro.class, MixIns.Libros.class);
		mapper.addMixIn(Cuaderno.class, MixIns.Cuadernos.class);

		return mapper;
	}

}