/**
 * 
 */
package com.buenmaestro.projectspring.project_spring_desktop.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.buenmaestro.projectspring.project_spring_desktop.dao.DisqueraDAO;
import com.buenmaestro.projectspring.project_spring_desktop.dao.impl.DisqueraDAOImpl;

/**
 * @author Eliezer
 * Clase de Prueba Unitaria que permite realizar pruebas con el framwork de SPRING
 *
 */
class SpringDesktopTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		
		DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);
		
		DisqueraDAO disqueraDAONuevo = (DisqueraDAO) context.getBean("disqueraDAO");
		
		DisqueraDAO disqueraDAOJava = new DisqueraDAOImpl();
		
		DisqueraDAO disqueraDAOJavaNuevo = new DisqueraDAOImpl();
		
		System.out.println("Contexto cargado exitosamente");
		System.out.println(disqueraDAO);
		System.out.println(disqueraDAONuevo);
		
		System.out.println(disqueraDAOJava);
		System.out.println(disqueraDAOJavaNuevo);
	}

}
