package br.com.gustavohmf.todolist.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * CORS configuration, allowed all origins
 */
@Configuration
public class WebAppConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry
            .addMapping("/**")
                .allowedMethods("POST",
                        "GET",
                        "UPDATE",
                        "DELETE",
                        "OPTIONS",
                        "PUT")
            .allowedOrigins("*");


    }
}
