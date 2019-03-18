package com.hashlabs.productservice.domain;

import java.math.BigDecimal;

public class Discount {

	private BigDecimal percentage;
	
	private Integer valueInCents;

	public BigDecimal getPercentage() {
		return percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}

	public Integer getValueInCents() {
		return valueInCents;
	}

	public void setValueInCents(Integer valueInCents) {
		this.valueInCents = valueInCents;
	}
}
