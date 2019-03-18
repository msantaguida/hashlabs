package com.hashlabs.productservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hashlabs.productservice.domain.Product;
import com.hashlabs.productservice.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping
	public @ResponseBody ResponseEntity<List<Product>> findAll(
			@RequestHeader(name = "X-USER-ID", required = false) String userId) {
		return Optional
	            .ofNullable( service.findAll(userId) )
	            .map( user -> ResponseEntity.ok().body(user))
	            .orElseGet( () -> ResponseEntity.notFound().build() );
	}
}
