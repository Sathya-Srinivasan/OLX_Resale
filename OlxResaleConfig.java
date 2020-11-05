package com.hcl.olxresale.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author Sathya S
 *
 */
@Configurable
@EnableWebMvc
//@Component(basePackage = "com.hcl.olxresale")
public class OlxResaleConfig {
	@Bean(name = "jspViewResolver")
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("WEB-INF/views/");
		return viewResolver;
	}
}