package demo2.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import demo2.demo2.config.WebConfig;

@SpringBootApplication
@Import(WebConfig.class)
@ComponentScan("demo2.demo2")
public class Demo2Application extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(Demo2Application.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
