package com.hashlabs.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.hashlabs.productservice.domain.Product;
import com.hashlabs.productservice.repository.ProductRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.hashlabs.productservice.repository")
public class ProductServiceApplication implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(".......................");
		System.out.println("TESTANDO REPOSITORIO");
		System.out.println(".......................");
		repository.deleteAll();
		repository.save(new Product("Camisa", "Camisa Branca", 1000));
		repository.save(new Product("Calça", "Calça Branca", 2000));
		for (Product product : repository.findAll()) {
			System.out.println("Produto: " + product.getTitle() + ", " + product.getDescription() + ", " + product.getPrice());
		}
	}
}
