package com.hashlabs.productservice.proxy;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.hashlabs.productservice.domain.Discount;

@Component
public class DiscountProxy {

	public Discount findOne(String id, String userId) {
		Discount discount = new Discount();
		discount.setPercentage(new BigDecimal("10.0"));
		discount.setValueInCents(50);
		return discount;
	}
}
