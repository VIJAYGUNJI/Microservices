package com.tekleads.beans;

import lombok.Data;

@Data
public class CurrencyCostBean {

	private String currencyFrom;
	private String currencyTo;
	private Double totalCurrencyAmt;
}
