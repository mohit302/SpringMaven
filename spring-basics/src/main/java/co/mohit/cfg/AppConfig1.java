package co.mohit.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import co.mohit.dao.DummyProductDao;
import co.mohit.dao.JdbcProductDao;

@Configuration
public class AppConfig1 {
	
	public AppConfig1() {
		System.out.println("AppConfig1 instantiated");
	}
	
	@Lazy // doesn't instantiate this as 'singleton' Bean is already there
	@Bean
	public DummyProductDao dummyDao() {
		System.out.println("AppConfig1.dummyDao() called");
		return new DummyProductDao();
	}
	
	@Lazy // only instantiated when called
	@Scope("singleton") // singleton - default(every Bean is instantiated even if that one is not called
	// ; other option  - prototype ( spring container does not maintain this; can go for garbage collection )
	@Bean
	public JdbcProductDao jdbcDao() {
		System.out.println("AppConfig1.jdbcDao() called");
		return new JdbcProductDao();
	}

}
