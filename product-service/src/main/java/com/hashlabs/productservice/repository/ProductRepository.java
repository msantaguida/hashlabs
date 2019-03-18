package com.hashlabs.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hashlabs.productservice.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
