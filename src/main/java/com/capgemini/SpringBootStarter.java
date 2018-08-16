package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.capgemini.repository.ProductDetails;
import com.capgemini.service.ProductDetailsImpl;

import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable;

@SpringBootApplication
public class SpringBootStarter {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringBootStarter.class, args);
		ProductDetailsImpl service=(ProductDetailsImpl) context.getBean("service");
		service.getProductDetails(1);
		
	}
}
