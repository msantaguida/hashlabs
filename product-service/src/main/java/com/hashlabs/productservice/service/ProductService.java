package com.hashlabs.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashlabs.productservice.domain.Discount;
import com.hashlabs.productservice.domain.Product;
import com.hashlabs.productservice.proxy.DiscountProxy;
import com.hashlabs.productservice.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Autowired
	private DiscountProxy discountProxy;

	public List<Product> findAll(String userId) {
		List<Product> products = repository.findAll();
		if (userId != null && products != null) {
			for (Product product : products) {
				Discount discount = discountProxy.findOne(product.getId(), userId);
				product.setDiscount(discount);
			}
		}
		return products;
	}

}
