package co.mohit.programs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.mohit.cfg.AppConfig1;
import co.mohit.dao.ProductDao;

public class P01_GetProductCount {

	public static void main(String[] args) {
		// our dependency
		ProductDao dao;
		
		// variable representing the spring container
		// Spring container is like ArrayList, HashMap and maintains objects
		AnnotationConfigApplicationContext ctx;
		
		// Object of spring container - read the Beans defined in the class
		// Spring will call the Bean functions and keep that in the memory
		ctx = new AnnotationConfigApplicationContext(AppConfig1.class);
		
		System.out.println("----------");
		
		dao = ctx.getBean("jdbcDao", ProductDao.class); // as jdbcDao is already called dao is just referencing
		// @Lazy will prevent jdbcDao be called again - only reference now
		ProductDao dao2 = ctx.getBean("jdbcDao", ProductDao.class); 
		System.out.println((dao == dao2));
		
		System.out.println("dao is an instance of " + dao.getClass().getName());
		System.out.println("There are " + dao.count() + " products");
		
		
		
		
		ctx.close();
	}

}
