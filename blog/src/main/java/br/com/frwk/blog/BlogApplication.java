package br.com.frwk.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * @author CleberLeão
 */
@SpringBootApplication
@EnableSpringDataWebSupport
@EnableCaching
@EnableSwagger2
public class BlogApplication {
	public BlogApplication() {
	}

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
}
